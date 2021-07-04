import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Menu } from 'src/Menu';
import { CartService } from '../cart.service';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  itemName: string = '';

  constructor(private router: Router, private route: ActivatedRoute, private menuService: MenuService, private cartService: CartService) {
    

  }

  ngOnInit(): void {
   
  }

  foodArr: Array<Menu> = [];

  method() {
    this.foodArr = this.menuService.foodArray;
    console.log("local search ts array" + this.foodArr)
    console.log("Service food array" + this.menuService.foodArray)
  }
  //regarding cart

  totalPrice: number = 0;
  quantity: number = 0;
  total(obj: any) {
    this.method()
    this.total = obj.price + this.totalPrice;
    this.menuService.totalCost = this.totalPrice;
    this.quantity = this.quantity + 1;
    this.menuService.emit<number>(this.totalPrice);
    this.menuService.emit1<number>(this.quantity);
    console.log(this.menuService.totalCost)

  }
  cartId: number = 0;
  
  isAdded(menu: Menu) {
    return menu.itemID === this.cartId;
  }
  isLoggedIn: boolean = false;

  getStatus() {
    this.isLoggedIn = this.menuService.submitted
    return this.isLoggedIn
  }
  addToCart(obj: Menu) {
    this.cartService.cartArray.push(obj)
    console.log(this.cartService.cartArray)
  }
}
