import { NgModule } from '@angular/core';
import { Routes, RouterModule, ChildrenOutletContexts } from '@angular/router';
import { AppComponent } from './app.component';
import { FirstComponent } from './components/first.component';
import { DatabindingComponent } from './components/databinding/databinding.component';
import { UserprofileComponent } from './components/userprofile/userprofile.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ADirectivesComponent } from './components/a-directives/a-directives.component';
import { PipesComponent } from './components/pipes/pipes.component';
import { SDirectivesComponent } from './components/s-directives/s-directives.component';
import { DirectivetestComponent } from './components/directivetest/directivetest.component';

const routes: Routes = [{
  path: 'first',
  component: FirstComponent
},{
  path: 'databinding',
  component: DatabindingComponent
},{
  path: 'userprofile',
  component: UserprofileComponent
},{
  path: 'pipes',
  component: PipesComponent
},{
  path: 'adirectives',
  component: ADirectivesComponent
},{
  path: 'sdirectives',
  component: SDirectivesComponent
},{
  path: '**',
  pathMatch: 'full',
  redirectTo: ''
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
