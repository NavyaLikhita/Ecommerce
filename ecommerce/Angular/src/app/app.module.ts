

import { NgxPaginationModule } from 'ngx-pagination';


import { ModalModule } from 'ngx-bootstrap/modal';
import { AddProductComponent } from './_admin/app.addProductComponent';









import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from '@angular/common/http';
import { Routes, RouterModule } from '@angular/router';

import { DeleteCartComponent } from './_cart/app.deleteCartComponent';
import { MyOrdersComponent } from './_cart/app.myOrdersComponent';
import { DisplayCustomerProductsComponent } from './_displayProducts/app.displayCustomerProductsComponent';
import { ViewAllOrderInSpcifiedTimeComponent } from './_salesManager/app.viewOrderInSpecifiedTimeComponent';
import { ViewAllOrdersComponent } from './_salesManager/app.viewAllOrdersComponent';
import { ModifyProductComponent } from './_admin/app.modifyProductComponent';
import { PaymentComponent } from './_cart/app.paymentComponent';
import { OrderDetailsComponent } from './_salesManager/app.orderDetailsComponent';
import { DisplayAllProductsComponent } from './_admin/app.displayAllProductsComponent';
import { ViewOrdersPendingComponent } from './_salesManager/app.viewOrdersPendingComponent';



const eCommerceRoutes:Routes=[

    {path: 'home', component: DisplayCustomerProductsComponent},
    {path: 'account/cart', component: DeleteCartComponent},
    {path: 'account/view', component: MyOrdersComponent},
    {path: 'account/payment', component: PaymentComponent},
    {path: 'product/add', component: AddProductComponent},
    {path: 'product/show', component: DisplayAllProductsComponent},
    {path: 'product/modify/:productId', component: ModifyProductComponent},
    
    
    



]

@NgModule({
    imports: [
        BrowserModule,
        HttpClientModule,
        FormsModule,
        RouterModule.forRoot(eCommerceRoutes),
        NgxPaginationModule,
        ModalModule.forRoot(),
        
    ],
    declarations: [
        AppComponent,
        AddProductComponent,
        
        DisplayAllProductsComponent,
        ModifyProductComponent,
        DeleteCartComponent,
        MyOrdersComponent,
        PaymentComponent,
        DisplayCustomerProductsComponent,
        OrderDetailsComponent
        // ViewAllOrderInSpcifiedTimeComponent,
        // ViewAllOrdersComponent,
        // ViewOrdersPendingComponent
		],
    providers: [  
     ],
    bootstrap: [AppComponent]
})

export class AppModule { }