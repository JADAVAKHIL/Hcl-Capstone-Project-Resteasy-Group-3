import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Address } from 'src/Address';

@Injectable({
  providedIn: 'root'
})
export class AddressService {

  constructor(private http:HttpClient) { }
  baseUrl:string="http://localhost:8081/address"
  saveAddress(address:Address):Observable<Address>{
    return this.http.post<Address>(`${this.baseUrl}/add`,address);
  }


}
