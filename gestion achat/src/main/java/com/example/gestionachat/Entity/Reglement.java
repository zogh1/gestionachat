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
@NoArgsConstructor
@AllArgsConstructor
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdReglement ;
    private float montantPaye ;
    private float montantRestant ;
    private boolean payee ;
    private Date dateRegelement ;
    @ManyToOne
    private Facture facture ;
}
