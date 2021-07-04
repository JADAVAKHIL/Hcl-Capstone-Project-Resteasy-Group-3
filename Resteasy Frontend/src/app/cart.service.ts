import { Injectable } from '@angular/core';
import { Menu } from 'src/Menu';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor() { }
  cartArray:Array<Menu>=[];
}
