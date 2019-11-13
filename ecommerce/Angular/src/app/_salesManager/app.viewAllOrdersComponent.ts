import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { OrderService } from '../_service/app.orderService';
import { Order } from '../_model/app.order';

@Component({
    selector: 'viewAllOrders',
    templateUrl: 'app.viewAllOrders.html'
})

export class ViewAllOrdersComponent implements OnInit  {

orderList:Order[]=[];

    ngOnInit() {
        this.serviceOrder. getAllOrders().subscribe((data:Order[])=>this.orderList=data);
     
    }


    constructor(private router:Router, private serviceOrder:OrderService){
       

    }



   

}