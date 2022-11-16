package com.example.gestionachat.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFourniseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFourniseur ;
    private Date dateDebutCollaboration ;
    private String adresse  ;
    private String matricule ;
     @OneToOne
     private Fourniseur fourniseur;
}
