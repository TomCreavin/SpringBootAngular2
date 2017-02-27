import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './components/home.component';
import { Register } from './components/register.component';

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
  }

];

export const Routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);