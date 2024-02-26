package com.ghassen.formation.repository;
 import org.springframework.data.jpa.repository.JpaRepository;
 import com.ghassen.formation.entities.Produit;

 import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    List<Produit > findByNomProduit(String nom);

}
