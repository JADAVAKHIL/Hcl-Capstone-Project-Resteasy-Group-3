import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from 'src/Customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }
  submitted:boolean=false;
customer = new Customer();
userName:string=''
  private baseUrl:string='http://localhost:8081';
  public register(customer:Customer):Observable<Object>{
    console.log(customer);
    return this.http.post<Object>(`${this.baseUrl}/customer/registerCustomer/`,customer);
  }

  public displayProfile(email:string):Observable<any>{
    return this.http.get(`${this.baseUrl}/customer/profile/${email}`)
  }

 public login(customerDetails:Customer):Observable<Object>{
   return this.http.post<Object>(`${this.baseUrl}/customer/loginaccount/`,customerDetails);
 }
  public searchCustomer(email:string):Observable<Boolean>{
    return this.http.get<Boolean>(`${this.baseUrl}/customer/searchCustomer/${email}`)
  }

  public delete(email:string):Observable<Boolean>{
    return this.http.delete<Boolean>(`${this.baseUrl}/customer/deleteCustomer/${email}`)
  }

  authenticate(customername: string, password: string): Observable<any> {
    console.log(customername);
    return this.http.get(`${this.baseUrl}/customer/loginaccount/${customername}`);
  }

  isUserLoggedIn() {
    let firstName= sessionStorage.getItem('firstName');
    this.customer.firstName = firstName || '{}';
    return !(firstName === null);
  }

  logOut() {
    sessionStorage.removeItem('firstName');
    sessionStorage.removeItem('password');
  }

  getCurrentUserName(){
    return this.customer.firstName;
  }

}
