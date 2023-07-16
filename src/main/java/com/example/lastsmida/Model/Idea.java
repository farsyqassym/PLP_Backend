package com.example.lastsmida.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ideaId;
    private String title;
    private String description;
    private String status;

    @ManyToMany(mappedBy = "ideas",
    fetch = FetchType.EAGER)
    private Set<User> users;

    public void setStatus(String accepted) {
    }
}
