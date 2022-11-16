package com.example.gestionachat.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdFacture ;
    private float montantRemise ;
    private float montantFacture ;
    private Date dateCreationFacutre ;
    private boolean archive ;
    @OneToMany(mappedBy="facture")
    private List<Reglement> reglements ;
    @OneToMany(mappedBy ="facture")
    private List<DetailFacture> detailFactures ;
}
