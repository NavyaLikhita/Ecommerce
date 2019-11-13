import {Component, OnInit} from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";
import { ProductService } from '../_service/app.productService';
import { Product } from '../_model/app.product';



@Component({
    selector: 'addProduct',
  templateUrl: 'app.addProduct.html'
   
})
export class AddProductComponent implements OnInit{

   addProducts:Product;
   product:Product;

    constructor(private route: ActivatedRoute, private router:Router, private serviceProduct:ProductService){}

    ngOnInit(){
       

      this.addProducts=new Product();
      this.product=new Product();
    }

   


   

addProduct(){


  this.serviceProduct.addProduct(this.addProducts).subscribe((data)=> this.product=data);  
  
  this.router.navigate(['/product/show']);
    
}






    

}