import { ProduitService } from './../services/produit.service';
import { CommonModule, DatePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Produit } from '../model/produit.model';

@Component({
  selector: 'app-produits',
  standalone : true,
  imports: [DatePipe],
  templateUrl: './produits.component.html',
  styleUrl: './produits.component.css'
})
export class ProduitsComponent implements OnInit{
  produits! : Produit[];

  constructor(private produitService : ProduitService){

  }

  ngOnInit(): void {
    this.produits = this.produitService.listeProduit();
  }
}
