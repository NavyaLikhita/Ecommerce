import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { Order } from '../_model/app.order';
import { OrderService } from '../_service/app.orderService';

@Component({
    selector: 'viewAllOrderInSpcifiedTime',
    templateUrl: 'app.viewAllOrderInSpcifiedTime.html'
})

export class ViewAllOrderInSpcifiedTimeComponent  implements OnInit{

    orderList:Order[]=[];

    ngOnInit() {
      
        this.serviceOrder.getAllOrdersInSpecifiedTime().subscribe((data:Order[])=>this.orderList=data);
    }


    constructor(private router:Router, private serviceOrder:OrderService){
        
}



    
}