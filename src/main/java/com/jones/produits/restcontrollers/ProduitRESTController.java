package com.jones.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jones.produits.models.Produit;
import com.jones.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {
	
	@Autowired
	ProduitService produitService;
	
	@GetMapping
	public List<Produit> getAllProduits(){
		return produitService.getAllProduits();
	}
	
	@GetMapping("/{id}")
	public Produit getProduitById(@PathVariable Long id) {
		return produitService.getProduit(id);
	}
	
	@PostMapping
	public Produit createProduit(@RequestBody Produit produit) {
		return produitService.saveProduit(produit);
	}
	
	@PutMapping
	public Produit updateProduit(@RequestBody Produit produit) {
		return produitService.updateProduit(produit);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduitById(@PathVariable Long id) {
		produitService.deleteProduitById(id);
	}
	
	@GetMapping("/prodscat/{idCat}")
	public List<Produit> getProduitByCatId(@PathVariable Long idCat){
		return produitService.findByCategorieIdCat(idCat);
	}
	
}
