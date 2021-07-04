import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BehaviorSubject, Observable } from 'rxjs';
import { Customer } from 'src/Customer';
import { Menu } from 'src/Menu';
import { CartService } from '../cart.service';
import { CustomerService } from '../customer.service';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  total_price: number = 0;
  total_quantity: number = 0;
  itemName: string = "";
  item: Array<Menu> = [];
  items: Array<Menu> = [];
  d1: Array<any> = [];
  responseMessage: string = "";
  customer: Customer = new Customer();
  totalCost1: number = 0;
  totalQuantity: number = 0;
  userName: string = ''
  isLoggedIn: boolean = false;
  message: string = ""
  name: string = ''

  constructor(private service: MenuService, private cartService: CartService, private customerService: CustomerService, private router: Router, private route: ActivatedRoute) {

  }



  ngOnInit(): void {

    this.cartAmount();

  }

  // onEnter(value:string)
  // { 
  //   this.itemName= this.service.storeData(value);
  //   this.searchItem($event);

  // }


  searchItem(name: string) {

    this.service.getItemByName(name).subscribe((data) => {
      this.service.b = true;
      this.items.push(data);
      console.log(data)
      this.item = this.items
      this.service.food.push(data);
      this.service.foodArray = data;
      console.log("itemsList", this.service.foodArray);
      this.router.navigate(['/searchresult'])
    },
      e => {
        console.log(e);
      })
  }


  cartAmount() {
    this.service.on<number>().subscribe(
      data => {
        this.total_price = data;

      }
    )
    this.service.on1<number>().subscribe(
      data => {
        this.total_quantity = data
      }
    )
  }

  onClickToCart() {
    this.router.navigateByUrl("/cart")
  }

  search() {
    this.router.navigate(['/searchresult']);
  }

  addToCart(obj: Menu) {
    this.cartService.cartArray.push(obj)
    console.log(this.cartService.cartArray)
  }
 

  getStatus() {
    this.isLoggedIn = this.service.submitted
    console.log(this.isLoggedIn)
    this.userName = this.customerService.userName
    this.message = "Welcome " + this.userName
    return this.isLoggedIn;


  }
  logout(){
    this.service.submitted=false
  }

}
