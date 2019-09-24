import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './components/first.component';
import { DatabindingComponent } from './components/databinding/databinding.component';
import { UserprofileComponent } from './components/userprofile/userprofile.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { DirectivetestComponent } from './components/directivetest/directivetest.component';
import { ADirectivesComponent } from './components/a-directives/a-directives.component';
import { PipesComponent } from './components/pipes/pipes.component';
import { ConvertToSpacePipe } from './pipes/convert-to-space.pipe';
import { SDirectivesComponent } from './components/s-directives/s-directives.component';
import { HighlighterComponent } from './components/highlighter/highlighter.component';




@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    DatabindingComponent,
    UserprofileComponent,
    NavbarComponent,
    DirectivetestComponent,
    ADirectivesComponent,
    PipesComponent,
    ConvertToSpacePipe,
    SDirectivesComponent,
    HighlighterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
