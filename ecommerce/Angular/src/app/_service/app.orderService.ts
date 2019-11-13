import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Order } from '../_model/app.order';




@Injectable({
    providedIn: 'root'
})



export class OrderService{


    constructor(private myhttp:HttpClient){}

    getAllOrders(){

        return this.myhttp.get('http://localhost:9088/order/view');

    }


    getAllOrdersInSpecifiedTime(){

        return this.myhttp.get('http://localhost:9088/order/view/time');
        
    }


    getAllOrdersPending(){

        return this.myhttp.get('http://localhost:9088/order/pending');
        
    }


    addOrder(order:Order){

        return this.myhttp.post<Order>('http://localhost:9088/order/add',order);
    }


}