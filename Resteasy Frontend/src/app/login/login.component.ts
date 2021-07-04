import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from 'src/Customer';
import { NgForm } from '@angular/forms';
import { CustomerService } from '../customer.service';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router, private service: CustomerService, private menuService: MenuService) { }

  ngOnInit(): void {

  }
  customer = new Customer();

  model: any = {}
  loginStatus: boolean = false
  msg: string = ""
  user: string = ''
  message: string = ""
  loginUser() {
    this.service.login(this.customer).subscribe(data => {
      console.log("response Received");
      this.menuService.submitted = true;
      this.loginStatus = true;
      this.service.userName = this.customer.email

      this.router.navigateByUrl("/Adigas")
    },
      (error) => {
        console.log("Exception occured")
        this.msg = "Invalid credentials";
      }
    )
  }


}
