package com.jones.produits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jones.produits.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
}
