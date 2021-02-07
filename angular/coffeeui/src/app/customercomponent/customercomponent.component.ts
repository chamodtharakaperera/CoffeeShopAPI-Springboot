import { Component, Input, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { cusReport } from 'src/cusReports';
import { CustomerservService } from '../customerserv.service';




@Component({
  selector: 'app-customercomponent',
  templateUrl: './customercomponent.component.html',
  styleUrls: ['./customercomponent.component.css']
})
export class CustomercomponentComponent implements OnInit {

  @Input('ELEMENT_DATA') ELEMENT_DATA!: cusReport[];
  displayedColumns: string[] = ['cusAddress', 'cusCity', 'cusFName', 'cusId','cusLName','cusPostalCode','cusState','cusTel'];
  dataSource = new MatTableDataSource<cusReport>(this.ELEMENT_DATA);

  constructor(private service:CustomerservService) { }

  ngOnInit(): void {
    this.getAllCustomers();
  }

  public getAllCustomers(){
    let resp = this.service.customerreports();
    resp.subscribe(report=>this.dataSource.data=report as cusReport[]);
  }
}
