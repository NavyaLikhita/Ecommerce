import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { Order } from '../_model/app.order';
import { OrderService } from '../_service/app.orderService';

@Component({
    selector: 'viewOrdersPending',
    templateUrl: 'app.viewOrdersPending.html'
})

export class ViewOrdersPendingComponent implements OnInit {

    orderList:Order[]=[];


    ngOnInit() {
        this.serviceOrder.getAllOrdersPending().subscribe((data:Order[])=>this.orderList=data);
     
    }


    constructor(private router:Router, private serviceOrder:OrderService){
        
}








}