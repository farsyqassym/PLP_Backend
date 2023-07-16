package com.example.lastsmida.Controller;

import com.example.lastsmida.Model.Competition;
import com.example.lastsmida.Service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    @PostMapping("/competitions")
    public Competition saveCompetition(@RequestBody Competition competition){
        return competitionService.saveCompetition(competition);
    }

    @GetMapping("/competitions")
    public List<Competition> fetchCompetitionList(){
        return competitionService.fetchCompetitionList();
    }
}
