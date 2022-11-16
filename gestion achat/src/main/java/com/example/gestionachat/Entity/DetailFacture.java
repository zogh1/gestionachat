package com.example.gestionachat.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailFacture {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  long idDetailFacture ;
    private int qteCommande ;
    private float prixTotalDetail ;
    private int pourcentageRemise ;
    private float montantRemise ;
    @ManyToOne
    private Produit produit ;
    @ManyToOne
    private Facture facture ;
}
