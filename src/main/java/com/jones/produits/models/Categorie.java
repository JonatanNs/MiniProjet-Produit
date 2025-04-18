package com.jones.produits.models;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Categorie {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long idCat;
	
	private String nomCat;
	
	private String descriptionCat;
	
	@OneToMany (mappedBy = "categorie")
	private List<Produit> produits;
	
	public Categorie() {
		super();
	}
}
