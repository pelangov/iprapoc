import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {rightPanelComponent} from './right-panel/right-panel.component';

// Route Configuration

export const routes: Routes = [
  {path: 'right-panel', component: rightPanelComponent}
];
export const routing: ModuleWithProviders = RouterModule.forRoot(routes);
