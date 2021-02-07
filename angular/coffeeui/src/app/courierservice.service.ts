import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CourierserviceService {

  constructor(private http:HttpClient) { }


  public courierReports(){
    return this.http.get("http://localhost:8080/rest/v2/courier");
  }
}
