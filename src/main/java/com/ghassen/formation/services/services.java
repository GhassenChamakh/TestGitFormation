package com.ghassen.formation.services;
import com.ghassen.formation.entities.Produit;
import java.util.List;
public interface services {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
}
