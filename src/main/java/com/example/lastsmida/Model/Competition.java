package com.example.lastsmida.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class
Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long competitionId;
    private Date issueDate;
    private String description;
    private String address;

    @Enumerated(value = EnumType.STRING)
    private CompetitionType type;

    private Date deadline;
    private Date startingDate;

    @ManyToMany(mappedBy = "competitions",
    fetch = FetchType.EAGER)
    private Set<Theme> themes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "competitionId", referencedColumnName = "competitionId")
    private Set<Application> applications;

}
