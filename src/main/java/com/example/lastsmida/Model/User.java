package com.example.lastsmida.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    private String userName;
    private String userFirstName;
    private String userMiddleName;
    private String userLastName;
    private String userEmail;
    private String userPhone;
    private String userPassword;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
    joinColumns = {
            @JoinColumn(name = "USER_ID")
    },
            inverseJoinColumns = {
            @JoinColumn(name = "ROLE_ID")
            }
    )
    private Set <Role> role;


    @ManyToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinTable(name = "applicant_idea",
            joinColumns = {
                    @JoinColumn(name = "user_Id",
                            referencedColumnName = "userName")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "idea_Id",
                            referencedColumnName = "ideaId")
            })
    private Set<Idea> ideas;
}
