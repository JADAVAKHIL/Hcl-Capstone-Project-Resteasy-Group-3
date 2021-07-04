import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Payment } from 'src/Payment';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {

  constructor(private http:HttpClient) { }
  payment:Payment=new Payment();

  baseUrl:string="http://localhost:8081/payment"

  savePayment(payment:Payment):Observable<Payment>{
    return this.http.post<Payment>(`${this.baseUrl}/makePayment`,payment);
  }

  

  
}
