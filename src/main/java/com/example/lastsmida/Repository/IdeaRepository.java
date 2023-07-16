package com.example.lastsmida.Repository;

import com.example.lastsmida.Model.Idea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdeaRepository extends JpaRepository<Idea, Long> {
   public List<Idea> findByStatus(String accepted);
}
