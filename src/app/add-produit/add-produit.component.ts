import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Produit } from '../model/produit.model';
import { ProduitService } from '../services/produit.service';
import { Categorie } from '../model/categorie.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-produit',
  imports: [
    FormsModule
  ],
  templateUrl: './add-produit.component.html',
  styleUrl: './add-produit.component.css'
})
export class AddProduitComponent implements OnInit{

  newProduit = new Produit();
  message! :string;
  newIdCat! : number;
  newCategorie! : Categorie;
  categories! : Categorie[];

  constructor(private produitService : ProduitService, 
              private router : Router
            ){ }

  ngOnInit(): void {
    this.categories = this.produitService.listeCategories();
  }

  addProduit(){
    //console.log(this.newProduit);
    this.newCategorie = this.produitService.consulterCategorie(this.newIdCat);
    this.newProduit.categorie = this.newCategorie;

    this.produitService.addNewProduit(this.newProduit);
    this.message = "Produit " + this.newProduit.nomProduit + " ajouté avec succès !" ;

    this.router.navigate(['produits']);
  }

}
