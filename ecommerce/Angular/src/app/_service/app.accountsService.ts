import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Product } from '../_model/app.product';
import { Observable } from 'rxjs';
import { Order } from '../_model/app.order';



@Injectable({
    providedIn: 'root'
})



export class AccountsService{


    constructor(private myhttp:HttpClient){}

    addToCart(product:Product){



        return this.myhttp.post<Product>('http://localhost:9088/account/cart/add',product);
    
    }
    viewCart(){
        console.log("hello");
    return this.myhttp.get('http://localhost:9088/account/cart/view');   
    }

    deleteFromCart(product:Product){

        return this.myhttp.post<Product>('http://localhost:9088/account/cart/remove',product);
    }
    
    addOrder(order:Order){

        return this.myhttp.post<Order>('http://localhost:9088/order/add',order);

    }
    
    myOrders(){

        return this.myhttp.get('http://localhost:9088/account/view'); 

    }

    totalAmount(){

        return this.myhttp.get<Number>('http://localhost:9088/account/payment'); 

    }

}