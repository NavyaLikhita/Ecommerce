import { Component} from '@angular/core';
import { Router } from '@angular/router';
import { AccountsService } from '../_service/app.accountsService';
import { Order } from '../_model/app.order';

@Component({
    selector: 'myOrders',
    templateUrl: 'app.myOrders.html'
})

export class MyOrdersComponent  {

  orderList:Order[]=[];


    ngOnInit() {
      
      this.serviceAccount.myOrders().subscribe((data:Order[])=>this.orderList=data);
      console.log(this.orderList)
    }

  constructor(private router:Router,private serviceAccount:AccountsService){

    
      



  }   




}