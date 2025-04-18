package com.jones.produits.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jones.produits.models.Produit;
import com.jones.produits.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService{

	private ProduitRepository produitRepository;
	
	@Override
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepository.findById(id).get();	
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
	}

}
