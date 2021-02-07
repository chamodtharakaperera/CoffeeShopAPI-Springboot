import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatTableModule} from '@angular/material/table';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CouriercompComponent } from './couriercomp/couriercomp.component';
import { HttpClientModule } from '@angular/common/http';
import { CustomercomponentComponent } from './customercomponent/customercomponent.component';


@NgModule({
  declarations: [
    AppComponent,
    CouriercompComponent,
    CustomercomponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatTableModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
