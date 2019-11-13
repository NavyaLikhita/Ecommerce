import { Product } from "./app.product";
import { Order } from "./app.order";

export class Accounts{

    accountId:Number;
    username:String;
    password:String;
    accountType:String;
    firstName:String;
    lastName:String;
    phoneNumber:Number;
    emailId:String

    cart:Product[];
    order:Order[];


}