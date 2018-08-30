import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProfessorComponent } from './professor/professor.component';
import {AppRoutingModule} from './app.routing.module';
import {ProfessorService} from './professor/professor.service';
import {HttpClientModule} from '@angular/common/http';



@NgModule({
  declarations: [
    AppComponent,
    ProfessorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ProfessorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
