import { Component, OnInit } from '@angular/core';
import { Menu } from 'src/Menu';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  subtotal1: number = 0;
  sum: any;
  totalqty: number = 0;
  subtotal: number = 0;
  price: number = 0
  constructor(private cartService: CartService) { }
  quantity: number = 1;
  cartArray: Array<Menu> = [];
  ngOnInit(): void {
    this.cartItemsDisplay()
  }

  isDisplay: boolean = false;
  cartEmptyMsg: string = "";
  cartItemsDisplay() {
    this.cartArray = this.cartService.cartArray
    console.log("from cart arry", this.cartArray)
    if (this.cartArray.length === 0) {
      this.cartEmptyMsg = "Your Cart is Empty!"
      this.isDisplay = true;
    }
  }

  removeCartItem(obj: any) {
    this.cartService.cartArray.splice;
    this.cartService.cartArray = this.cartArray.filter((i1) => i1 != obj)
    this.cartItemsDisplay();


  }

  addQuantity(obj: any) {
    console.log("obj:  ", obj.quantity)
    console.log("this:  ", this.quantity)
    this.quantity = this.quantity + 1

    obj.quantity = this.quantity

  }
  decreaseQuantity(obj: any) {
    this.quantity = this.quantity - 1
    obj.quantity = this.quantity
  }

}
