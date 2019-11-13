import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Product } from '../_model/app.product';
import { Router } from '@angular/router';



@Injectable({
    providedIn: 'root'
})



export class ProductService{

  


    constructor(private myhttp:HttpClient,private router:Router){}

    addProduct(product:Product){
        console.log(product);
        return this.myhttp.post<Product>('http://localhost:9088/product/add',product)
    }

    showProduct(){

        return this.myhttp.get('http://localhost:9088/product/show');
    }

searchProduct(productId:number){

    return this.myhttp.get('http://localhost:9088/product/search?productId='+productId);
}

    modifyProduct(product:any){
    console.log(product);
        return this.myhttp.put('http://localhost:9088/product/modify',product);

    }

    deleteProduct(productId:number){
        return this.myhttp.delete('http://localhost:9088/product/delete?productId='+productId);

    }

    


}