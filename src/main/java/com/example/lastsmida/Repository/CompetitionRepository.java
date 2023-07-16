package com.example.lastsmida.Repository;

import com.example.lastsmida.Model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Date> {
}
