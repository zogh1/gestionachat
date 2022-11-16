package com.example.gestionachat.Controlleur;

import com.example.gestionachat.Entity.Produit;
import com.example.gestionachat.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("produits")
    public class ProduitControlleur {
        @Autowired
        ProduitService produitService;



        @GetMapping
        public List<Produit> displayProduits (){
            return produitService.getAllProduits() ;
        }
        @PostMapping
        public Produit addProduit (@RequestBody  Produit produit){

            return produitService.addProduit(produit);

        }

        @PutMapping("{id}")
        public  Produit updateProduit (@PathVariable("id")long id ,@RequestBody  Produit produit){
            return produitService.updateProduit(id,produit) ;

        }
        @DeleteMapping("{id}")
        public String deleteProduit(@PathVariable("id")long id){
            return produitService.deleteProduit(produitService.getById(id));
        }
        @PutMapping("/assign/{IidProuduit}/{idCategorieProduit}")
        public void assignProduitToCategorieProduit (@PathVariable ("idProuduit") long idProuduit,@PathVariable ("idCategorieProduit") long idCategorieProduit){
           produitService.assignProduitToCategorieProduit(idProuduit,idCategorieProduit);
            return;
        }

    }
