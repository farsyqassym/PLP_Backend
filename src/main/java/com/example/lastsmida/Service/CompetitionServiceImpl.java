package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Competition;
import com.example.lastsmida.Repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionServiceImpl implements CompetitionService{

    @Autowired
    private CompetitionRepository competitionRepository;

    @Override
    public Competition saveCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }

    @Override
    public List<Competition> fetchCompetitionList() {
        return competitionRepository.findAll();
    }
}
