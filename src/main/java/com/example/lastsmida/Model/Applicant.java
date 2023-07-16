package com.example.lastsmida.Model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Applicant extends User{

    private String university;

}
