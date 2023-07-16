package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Competition;

import java.util.List;

public interface CompetitionService {
   public Competition saveCompetition(Competition competition);

  public List<Competition> fetchCompetitionList();
}
