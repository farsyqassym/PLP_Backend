package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Applicant;
import com.example.lastsmida.Repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

    @Override
    public List<Applicant> fetchApplicantList() {
        return applicantRepository.findAll();
    }
}
