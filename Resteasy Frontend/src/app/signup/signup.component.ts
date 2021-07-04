import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Customer } from 'src/Customer';
import { CustomerService } from '../customer.service';

function passwordsMatchValidator(form: any) {
  const password = form.get('password')
  const confirmPassword = form.get('confirmPassword')

  if (password.value !== confirmPassword.value) {
    confirmPassword.setErrors({ passwordsMatch: true })
  } else {
    confirmPassword.setErrors(null)
  }

  return null
}

function symbolValidator(control: any) { //control = registerForm.get('password')
  if (control.hasError('required')) return null;
  if (control.hasError('minlength')) return null;

  if (control.value.indexOf('@') > -1) {
    return null
  } else {
    return { symbol: true }
  }
}
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  customer: Customer = new Customer();


  responseMessage: string = '';
  registerForm: any;


  //Used for sending the data to the Register service 
  constructor(private builder: FormBuilder, private router: Router, private service: CustomerService) { }

  ngOnInit() {
    this.buildForm()
  }

  buildForm() {
    this.registerForm = this.builder.group({
      firstName: ['', [Validators.required, Validators.minLength(3)]],
      lastName: ['', [Validators.required, Validators.minLength(3)]],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, symbolValidator, Validators.minLength(6), Validators.maxLength(15)]],
      confirmPassword: ''
    }, {
      validators: passwordsMatchValidator
    })
  }
  //To register Customer
  register() {
    console.log(this.customer)
    this.service.register(this.customer).subscribe(data => {
      this.service.submitted = true;
      console.log(data);
      this.router.navigateByUrl("/login")
    }
    )
  }

}


