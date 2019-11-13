import {Component, OnInit, ɵConsole} from '@angular/core';


import { Router } from '@angular/router';

import { Product } from '../_model/app.product';
import { ProductService } from '../_service/app.productService';
import { AccountsService } from '../_service/app.accountsService';

// import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
// import { AbstractControl } from '@angular/forms';

//Author: Navya
//Description: Adding the flight 
//Created On: 21/10/2019

@Component({
    selector: 'displayCustomerProducts',
  templateUrl: 'app.displayCustomerProducts.html'
})

export class DisplayCustomerProductsComponent implements OnInit {
     

    productList:Product[]=[];
      // myForm: FormGroup;
     
    ngOnInit() {
      
      this.serviceProduct.showProduct().subscribe((data:Product[])=>this.productList=data);
      }

    constructor(private serviceProduct:ProductService,private router:Router,private serviceAccount:AccountsService){


        



    }   

addToCart(product:Product){
  console.log(product);
this.serviceAccount.addToCart(product).subscribe();


}










      

}
