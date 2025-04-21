package com.jones.produits;

import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.jones.produits.models.Categorie;
import com.jones.produits.models.Produit;
import com.jones.produits.repository.ProduitRepository;


@SpringBootTest
class ProduitsApplicationTests {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	/*@Test
	public void testCreateProduit() {
		Produit prod = new Produit(null, "PC Dell",2200.99,new Date(), null);
		produitRepository.save(prod);
	}
	
	@Test 
	public void testFindProduit() {
		Produit p = produitRepository.findById(3L).get();
		System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(3L).get();
		p.setPrixProduit(1499.99);
		produitRepository.save(p);
		System.out.println(p);
	}
	
	@Test 
	public void testDeleteProduit() {
		produitRepository.deleteById(5L);
	}
	
	@Test
	public void testFindAllProduct() {
		List<Produit> p =  produitRepository.findAll();
		for(Produit prod:p)
			System.out.println(prod);
	}
	
	@Test 
	public void testFindByNomProduit() {
		List<Produit> p = produitRepository.findByNomProduit("PC Dell");
		for(Produit pdt:p)
			System.out.println(pdt);
	}
	
	@Test 
	public void testFindByNomProduitContains() {
		List<Produit> p = produitRepository.findByNomProduitContains("s");
		for(Produit pdt:p)
			System.out.println(pdt);
	}
	
	@Test
	public void testFindByNomPrix(){
		List<Produit> prods = produitRepository.findByNomPrix("Mac Studio", 1000.0);
		for (Produit p : prods){
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindByCategorie(){	
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		
		List<Produit> prods = produitRepository.findByCategorie(cat);
		for (Produit p : prods){
			System.out.println(p);
		}
	}
	
	@Test
	public void findByCategorieIdCat() {
		List<Produit> prods = produitRepository.findByCategorieIdCat(2L);
		for (Produit p : prods){
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindByOrderByNomProduitAsc() {
		List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
		for(Produit p: prods) {
			System.out.println(p);
		}
	}
	
	@Test 
	public void testTrierProduitsNomPrix() {
		List<Produit> prods = produitRepository.trierProduitsNomPrix();
		for(Produit p: prods) {
			System.out.println(p);
		}
	}*/

}
	