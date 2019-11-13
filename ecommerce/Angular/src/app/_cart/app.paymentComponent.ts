import { Component} from '@angular/core';
import { Router } from '@angular/router';
import { AccountsService } from '../_service/app.accountsService';
import { Order } from '../_model/app.order';

@Component({
    selector: 'payment',
    templateUrl: 'app.payment.html'
})

export class PaymentComponent  {

  totalAmount:Number;


    ngOnInit() {
      this.serviceAccount.totalAmount().subscribe((data:Number)=>this.totalAmount=data);
     
    }

  constructor(private router:Router,private serviceAccount:AccountsService){

    
      



  }   




}