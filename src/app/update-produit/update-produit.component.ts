import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProduitService } from '../services/produit.service';
import { Produit } from '../model/produit.model';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-update-produit',
  imports: [FormsModule, CommonModule],
  templateUrl: './update-produit.component.html'
})
export class UpdateProduitComponent implements OnInit{

  currentProduit = new Produit();
  constructor(private activatedRoute: ActivatedRoute,
              private produitService: ProduitService,
              private router : Router) { }

  ngOnInit(): void {
    console.log(this.activatedRoute.snapshot.params['id']);
    this.currentProduit = this.produitService.consulterProduit(this.activatedRoute.snapshot.params['id']);
    console.log(this.currentProduit);
  }

  updateProduit() {
    // console.log(this.currentProduit);
    this.produitService.updateProduit(this.currentProduit);
    this.router.navigate(['produits']);
  }

}
