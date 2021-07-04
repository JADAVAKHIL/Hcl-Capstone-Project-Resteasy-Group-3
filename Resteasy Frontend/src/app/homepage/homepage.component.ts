import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, UrlSegment } from '@angular/router';
import { Menu } from 'src/Menu';
import { CartService } from '../cart.service';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  constructor(private menuService:MenuService,private cartService:CartService) { }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  menu: Array<Menu> = [];
  menuArray:Array<Menu>=[]
  getAllItems(){
    this.menuService.getItems().subscribe((data)=>{
      this.menu=data;
      
      console.log(this.menu);
    })
  }
 
  totalPrice:number=0
  quantity:number=0
  total(obj: any) {
  
    this.total = obj.price + this.totalPrice;
    this.menuService.totalCost = this.totalPrice;
    this.quantity = this.quantity + 1;
    this.menuService.emit<number>(this.totalPrice);
    this.menuService.emit1<number>(this.quantity);
    console.log(this.menuService.totalCost)

  }

  addToCart(obj:Menu){
    this.cartService.cartArray.push(obj)
    console.log(this.cartService.cartArray)
  }

}
