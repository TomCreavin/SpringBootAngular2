import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './components/home.component';
import { Register } from './components/register.component';
import { Login } from './components/login.component';

const appRoutes: Routes = [
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },
  {
    path: 'register',
    component: Register
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'login',
    component: Login
  }

];

export const Routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);