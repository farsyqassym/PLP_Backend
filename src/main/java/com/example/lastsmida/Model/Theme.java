package com.example.lastsmida.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long themeId;
    private String title;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "themeId",
    referencedColumnName = "themeId")
    private Set<Idea> ideas;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "competition_theme",
    joinColumns = {
            @JoinColumn(name = "themeId",
                    referencedColumnName = "themeId")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "competitionId",
            referencedColumnName = "competitionId")
    })
    private Set<Competition> competitions;
}
