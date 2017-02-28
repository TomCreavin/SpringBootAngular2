import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MaterialModule } from '@angular/material';
import { Routing } from './app.routing';
import 'hammerjs';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home.component';
import { NavBar } from './components/nav-bar.component';
import { Register } from './components/register.component';
import { Login } from './components/login.component';

import { RegisterService } from './services/register.service';
import { LoginService } from './services/login.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavBar,
    Register,
    Login
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    Routing,
    MaterialModule
  ],
  providers: [
    RegisterService,
    LoginService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
