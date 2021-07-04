import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Address } from 'src/Address';
import { AddressService } from '../address.service';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.css']
})
export class AddressComponent implements OnInit {
  registerForm: any;
  address:Address = new Address();
  country: string='';
  houseNo: string='';
  street: string='';
  pincode: number=0;
  state: string='';
  constructor(private builder:FormBuilder, private addressService:AddressService) { }

  ngOnInit(): void {
  }

  saveAddress(){
    this.address.country=this.country;
    this.address.houseNo=this.houseNo;
    this.address.street=this.street;
    this.address.pincode=this.pincode;
    this.address.state=this.state;
    this.addressService.saveAddress(this.address).subscribe((data)=>{
      console.log("Address is saved..")
      alert("Order is Placed")
    },
    (error)=>{
        console.log("Sorry..Cannot add address details")
    })
  }

  buildForm() {

    this.registerForm = this.builder.group({
      Name: ['', Validators.required, Validators.minLength(2)],
      email: ['', [Validators.required, Validators.email]],
      PhoneNumber: ['', Validators.required, Validators.minLength(10), Validators.maxLength(10),],
      House_no: ['', Validators.required],
      Country: ['', Validators.required],
      Street: ['', Validators.required, Validators.minLength(6)],
      City: ['', Validators.required, Validators.minLength(3)],
      State: ['', Validators.required],
      PinCode: ['', Validators.required, Validators.maxLength(6), Validators.minLength(6)],


    })
  }


}
