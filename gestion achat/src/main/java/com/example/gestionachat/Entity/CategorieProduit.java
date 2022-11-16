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
@AllArgsConstructor
@NoArgsConstructor

public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCategorieProduit ;
    private String codeProduit ;
    private String libelleCategorieProduit ;
    @OneToMany(mappedBy = "categorieProduit")
    private List<Produit> produits;
}
