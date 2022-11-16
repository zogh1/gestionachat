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

public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOperateur ;
    private String nom ;
    private String prenom ;
    private String password ;
    @OneToMany
    private List<Facture> factures  ;
}
