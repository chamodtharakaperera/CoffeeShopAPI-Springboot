import { Input } from '@angular/core';
import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { CourierReports } from 'src/courierReports';
import { CourierserviceService } from '../courierservice.service';


@Component({
  selector: 'app-couriercomp',
  templateUrl: './couriercomp.component.html',
  styleUrls: ['./couriercomp.component.css']
})
export class CouriercompComponent implements OnInit {

  @Input('ELEMENT_DATA') ELEMENT_DATA!: CourierReports[];
  displayedColumns: string[] = ['compAddress', 'compName', 'comptelNo', 'couriercompId'];
  dataSource = new MatTableDataSource<CourierReports>(this.ELEMENT_DATA);

  constructor(private service:CourierserviceService) { }

  ngOnInit(): void {
    this.getCourierReports();
  }


  public getCourierReports() {
    let resp=this.service.courierReports();
    resp.subscribe(report=>this.dataSource.data=report as CourierReports[]);
  }

}
