
import {Component, OnInit} from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";
import { ProductService } from '../_service/app.productService';
import { Product } from '../_model/app.product';



@Component({
    selector: 'modifyProduct',
  templateUrl: 'app.modifyProduct.html'
   
})
export class ModifyProductComponent implements OnInit{

  searchNumber:any;

  currProduct:Product={"productId": 0 ,"productName":"", "productDescription":"", "productPrice":0};
   

    constructor(private route: ActivatedRoute, private router:Router,private serviceProduct:ProductService ){}

    ngOnInit(){
      this.searchNumber=this.route.snapshot.paramMap.get("productId");
        console.log(this.searchNumber);
      this.serviceProduct.searchProduct(this.searchNumber).subscribe((product:Product)=> this.currProduct=product);
    }

   

    modifyProduct(){

      this.serviceProduct.modifyProduct(this.currProduct).subscribe();
      console.log(this.currProduct);
      this.router.navigate(['/product/show']);

     }
   







    

}