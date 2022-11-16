package com.example.gestionachat.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSecteurActivite  ;
    private String codeSecteurActivite ;
    private  String libelleSecteurActivite ;
    @ManyToMany(mappedBy = "secteurActivites")
    @JsonIgnore
    private List<Fourniseur> fournisseurs ;
}
