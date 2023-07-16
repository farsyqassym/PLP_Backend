package com.example.lastsmida.Controller;

import com.example.lastsmida.Model.Applicant;
import com.example.lastsmida.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping("/applicants")
    public List<Applicant> fetchApplicantntList(){
        return applicantService.fetchApplicantList();
    }
}
