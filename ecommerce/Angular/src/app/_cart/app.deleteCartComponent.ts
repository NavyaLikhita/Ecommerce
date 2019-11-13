import {Component, OnInit, ɵConsole} from '@angular/core';


import { Router } from '@angular/router';

import { Product } from '../_model/app.product';
import { ProductService } from '../_service/app.productService';
import { AccountsService } from '../_service/app.accountsService';
import { Order } from '../_model/app.order';
import { OrderService } from '../_service/app.orderService';


//Author: Navya
//Description: 
//Created On: 

@Component({
    selector: 'deleteCart',
  templateUrl: 'app.deleteCart.html'
})

export class DeleteCartComponent implements OnInit {
     
order:Order;
addOrders:Order
    productList:Product[]=[];
      // myForm: FormGroup;
     
    ngOnInit() {
      
      this.serviceAccount.viewCart().subscribe((data:Product[])=>this.productList=data);

      }

    constructor(private serviceProduct:ProductService,private router:Router,private serviceAccount:AccountsService,private serviceOrder:OrderService){


        


    }   

addToCart(product:Product){

this.serviceAccount.addToCart(product).subscribe();

}
deleteFromCart(product:Product){
    this.serviceAccount.deleteFromCart(product).subscribe();
    
    }
   
addOrder(){

this.serviceOrder.addOrder(this.order).subscribe((data)=> this.addOrders=data); ;

}








      

}
