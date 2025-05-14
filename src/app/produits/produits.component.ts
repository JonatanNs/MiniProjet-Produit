import { ProduitService } from './../services/produit.service';
import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Produit } from '../model/produit.model';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-produits',
  standalone : true,
  imports: [CommonModule, RouterLink],
  templateUrl: './produits.component.html',
  styleUrl: './produits.component.css'
})
export class ProduitsComponent implements OnInit{

  produits! : Produit[];

  constructor(private produitService : ProduitService){

  }

  supprimerProduit(prod: Produit) {
    //supprimer le produit prod du tableau produits
    let conf = confirm("Etes-vous sur ?");
    if(conf){
      this.produitService.supprimerProduit(prod);
    }
  }

  ngOnInit(): void {
    this.produits = this.produitService.listeProduit();
  }
}
