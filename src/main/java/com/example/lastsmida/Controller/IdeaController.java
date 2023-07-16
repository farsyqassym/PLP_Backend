package com.example.lastsmida.Controller;

import com.example.lastsmida.Model.Idea;
import com.example.lastsmida.Repository.IdeaRepository;
import com.example.lastsmida.Service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class IdeaController {

    @Autowired
    private IdeaService ideaService;

    @Autowired
    private IdeaRepository ideaRepository;

    //    accepting and rejecting...............................................
    @PutMapping("/accept/id")
    public ResponseEntity<?> acceptApplication(@PathVariable("id") Long id ){
        Optional<Idea> applicationOptional = ideaRepository.findById(id);

        if (applicationOptional.isPresent()){
            Idea application = applicationOptional.get();
            application.setStatus("Accepted");
            ideaRepository.save(application);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/reject/id")
    public ResponseEntity<?> rejectApplication(@PathVariable("id") Long id){
        Optional<Idea> applicationOptional = ideaRepository.findById(id);

        if (applicationOptional.isPresent()){
            Idea application = applicationOptional.get();
            application.setStatus("Rejected");
            ideaRepository.save(application);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/accept")
    public List<Idea> getAcceptedApplications(){
        return ideaRepository.findByStatus("Accepted");
    }

    @GetMapping("/reject")
    public List<Idea> getRejectedApplications(){
        return ideaRepository.findByStatus("Rejected");
    }


//    accepting and rejecting...................................................

    @PostMapping("/ideas")
    public Idea saveIdea(@RequestBody Idea idea){
        return ideaService.saveIdea(idea);
    }

    @GetMapping("/ideas")
    public List<Idea> fetchIdeaList(){
        return ideaService.fetchIdeaList();
    }

    @GetMapping("/ideas/{id}")
    public Idea fetchIdeaById(@PathVariable("id") Long ideaId){
        return ideaService.fetchIdeaById(ideaId);
    }

    @DeleteMapping("/ideas/{id}")
    public String deleteIdeaById(@PathVariable("id") Long ideaId){
        ideaService.deleteIdeaById(ideaId);
        return "idea deleted successfully";
    }

    @PutMapping("/ideas/{id}")
    public Idea updateIdea(@PathVariable("id") Long ideaId,
                           @RequestBody Idea idea){
        return ideaService.updateIdea(ideaId, idea);
    }
}
