package com.jones.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jones.produits.models.Produit;
import com.jones.produits.repository.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PC Dell",2200.500,new Date());
		produitRepository.save(prod);
	}
	
	@Test 
	public void testFindProduit() {
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(1499.99);
		produitRepository.save(p);
		System.out.println(p);
	}
	
	@Test 
	public void testDeleteProduit() {
		produitRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllProduct() {
		List<Produit> p =  produitRepository.findAll();
		for(Produit prod:p)
			System.out.println(prod);
	}
}