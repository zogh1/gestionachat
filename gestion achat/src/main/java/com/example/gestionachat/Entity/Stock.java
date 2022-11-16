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

public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStock ;
    private int qte ;
    private int qteMin ;
    private String libelleStock ;
    @OneToMany(mappedBy = "stock")
    @JsonIgnore
    private List<Produit> produits ;

}
