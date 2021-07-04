import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, UrlSegment } from '@angular/router';
import { Customer } from 'src/Customer';
import { Menu } from 'src/Menu';
import { CartService } from '../cart.service';
import { CustomerService } from '../customer.service';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  menu: Array<Menu> = [];
  restaurantName: string = '';
 customer:Customer=new Customer();
  constructor(private service:MenuService,private router:ActivatedRoute,private customerService:CustomerService, private cartService:CartService) { }

  ngOnInit(): void {
  }
  getMenu(restaurant:string){
    this.restaurantName=restaurant;
    this.service.getMenuList(restaurant).subscribe((data)=>{
      this.menu=data;
      console.log(this.menu);
    },
    e=>{
      console.log(e);
    }
    )
      }

      getAllItems(){
        this.service.getItems().subscribe((data)=>{
          this.menu=data;
          
          console.log(this.menu);
        })
      }
     

    
      search:String=""
      public storeData(item:string):void{
        this.search=item;
      }
      
      //regarding cart
    
        totalPrice:number=0;
    quantity:number=0;
      total(obj:any){​​​​​​​
         this.total=obj.price+this.totalPrice;
         this.service.totalCost=this.totalPrice;
         this.quantity=this.quantity+1;
         this.service.emit<number>(this.totalPrice);
         this.service.emit1<number>(this.quantity);
         console.log(this.service.totalCost)
     
    }​​​​​​​
    
    addToCart(obj:Menu){
      this.cartService.cartArray.push(obj)
      console.log(this.cartService.cartArray)
      
    }

    displayProfile(){
      this.customerService.displayProfile(this.customer.email).subscribe(data=>
       console.log(data))
    }

    getStatus():boolean{
     return this.service.submitted
    }


}
