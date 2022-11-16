package com.example.gestionachat.Service;

import com.example.gestionachat.Entity.Produit;

import java.util.List;

public interface ProduitService {
    public Produit addProduit(Produit produit) ;

    Produit updateProduit(long id,Produit produit);

    public String deleteProduit(Produit produit) ;
    public List<Produit> getAllProduits();

    public Produit getById (long id) ;
    public void assignProduitToCategorieProduit (long idProuduit, long
            dCategorieProduit);
}
