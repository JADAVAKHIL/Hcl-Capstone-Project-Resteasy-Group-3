import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Menu } from 'src/Menu';

@Injectable({
  providedIn: 'root'
})
export class MenuService {

  private baseUrl:string="http://localhost:8081"
  constructor(private http:HttpClient) { }
  food:Array<Menu>=[];
   b:boolean=false;
   submitted:boolean=false;
   //to display all menu  details
   getMenuList(rname:string):Observable<any>
   {
     return this.http.get<any>(`${this.baseUrl}/menu/getByRestaurantName/${rname}`)
   }
   getItemByName(itemName:string):Observable<any>
   {
    return this.http.get<any>(`${this.baseUrl}/menu/searchitem/${itemName}`)
   }

   getItems():Observable<any>{
     return this.http.get<any>(`${this.baseUrl}/menu/display`)

   }
   //To search Food
   public subject = new BehaviorSubject<any>('');
   public subject1 = new BehaviorSubject<any>('');
  emit<T> (data :T)
  {
    this.subject.next(data);
  }
  emit1<T> (data :T)
  {
    this.subject1.next(data);
  }
  on<T>() : Observable<T>
  {
    return this.subject.asObservable();
  }
  on1<T>() : Observable<T>
  {
    return this.subject1.asObservable();
  }
  foodArray:Array<Menu>=[];
  totalCost:number=0;
search:string=""
  public storeData(item:string):string{
    this.search=item;
    return this.search
  }
  
}
