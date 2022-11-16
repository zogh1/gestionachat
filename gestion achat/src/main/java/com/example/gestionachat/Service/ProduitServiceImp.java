package com.example.gestionachat.Service;

import com.example.gestionachat.Entity.CategorieProduit;
import com.example.gestionachat.Entity.Produit;
import com.example.gestionachat.Repository.CategorieProduitRepository;
import com.example.gestionachat.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImp implements ProduitService{
    @Autowired
    ProduitRepository produitRepository ;
    @Autowired
    CategorieProduitRepository categorieProduitRepository ;

    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(long id, Produit produit) {
        Produit produit1 = produitRepository.findById(id).orElse(null);
        if (produit1!=null){
            produit1.setLibelleProduit(produit.getLibelleProduit());
            produit1.setCodeProduit(produit.getCodeProduit());

            produit1.setCategorieProduit(produit.getCategorieProduit());
            produit1.setPrix(produit.getPrix());
            produit1.setStock(produit.getStock());

            return produitRepository.save(produit1);
        }
        else return null;
        }


    @Override
    public String deleteProduit(Produit produit) {
        if(produit != null){
            produitRepository.delete(produit);
            return "produit supprimé";
        }
        return "produit non existant";


    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();

    }

    @Override
    public Produit getById(long id) {
        return produitRepository.findById(id).orElse(null);

    }

    @Override
    public void assignProduitToCategorieProduit(long idProuduit, long idCategorieProduit) {
       Produit produit= produitRepository.findById(idProuduit).orElse(null) ;
       CategorieProduit categorieProduit =categorieProduitRepository.findById(idCategorieProduit).orElse(null) ;
        if (produit!=null && categorieProduit!=null) {
            produit.setCategorieProduit(categorieProduit);
         produitRepository.save(produit);
        }



    }
}
