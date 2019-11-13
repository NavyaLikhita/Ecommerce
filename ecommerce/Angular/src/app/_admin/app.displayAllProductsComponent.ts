
import {Component, OnInit} from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";
import { ProductService } from '../_service/app.productService';
import { Product } from '../_model/app.product';



@Component({
    selector: 'displayAllProducts',
  templateUrl: 'app.displayAllProducts.html'
   
})
export class DisplayAllProductsComponent implements OnInit{

   productList:Product[]=[];

    constructor(private route: ActivatedRoute, private router:Router, private serviceProduct:ProductService ){}

    ngOnInit(){
       
      this.serviceProduct.showProduct().subscribe((data:Product[])=>this.productList=data);
console.log(this.productList);
    }

    modifyProduct(productId:number){
      this.router.navigate(['/product/modify',productId]);

    }
 
 
    deleteProduct(productId:number):any{
 
      this.serviceProduct.deleteProduct(productId).subscribe();
      //location.reload();
 
     
    }


   







    

}