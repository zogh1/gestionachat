package com.example.gestionachat.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fourniseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFourniseur ;
    private String codeFourniseur ;
    private String libelleFourniseur ;
    private CategorieFourniseur categorieFourniseur ;
    @OneToOne (mappedBy ="fourniseur")
    private DetailFourniseur detailFourniseur ;
    @ManyToMany
    private List<SecteurActivite> secteurActivites;
 }
