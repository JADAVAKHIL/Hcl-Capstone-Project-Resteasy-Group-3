import { componentFactoryName } from '@angular/compiler';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddressComponent } from './address/address.component';
import { CartComponent } from './cart/cart.component';
import { HeaderComponent } from './header/header.component';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
// import { PaymentComponent } from './payment/payment.component';
import { SearchComponent } from './search/search.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  { path: '', redirectTo: 'Adigas', pathMatch: 'full' }, 
       { path: 'Adigas', component: MenuComponent },
       { path: 'Udipi', component: MenuComponent },
       { path: 'Rotighar', component: MenuComponent },
       { path: 'PunjabiRasoi', component:MenuComponent },
       { path: 'search', component: HeaderComponent },
       { path: 'searchresult', component: SearchComponent },
       { path: 'register', component: SignupComponent },
       { path: 'login', component: LoginComponent },
       {path:'cart',component:CartComponent},
       {path:'address', component:AddressComponent},
       {path:'home',component:HeaderComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
