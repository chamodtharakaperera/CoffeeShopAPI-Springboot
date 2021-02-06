package com.pearson.coffee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {


	@Id
	private Long cusId;
	
	@Column(name = "cusFName")
	private String cusFName;
	
	
	@Column(name = "cusLName")
	private String cusLName;
	
	
	@Column(name = "cusAddress")
	private String cusAddress;
	
	
	@Column(name = "cusCity")
	private String cusCity;
	
	
	@Column(name = "cusState")
	private String cusState;
	
	
	@Column(name = "cusPostalCode")
	private Integer cusPostalCode;
	
	
	@Column(name = "cusTel")
	private String cusTel;
	
	public Long getCusId() {
		return cusId;
	}
	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}
	public String getCusFName() {
		return cusFName;
	}
	public void setCusFName(String cusFName) {
		this.cusFName = cusFName;
	}
	public String getCusLName() {
		return cusLName;
	}
	public void setCusLName(String cusLName) {
		this.cusLName = cusLName;
	}
	public String getCusCity() {
		return cusCity;
	}
	public void setCusCity(String cusCity) {
		this.cusCity = cusCity;
	}
	public String getCusState() {
		return cusState;
	}
	public void setCusState(String cusState) {
		this.cusState = cusState;
	}
	public Integer getCusPostalCode() {
		return cusPostalCode;
	}
	public void setCusPostalCode(Integer cusPostalCode) {
		this.cusPostalCode = cusPostalCode;
	}
	public String getCusTel() {
		return cusTel;
	}
	public void setCusTel(String cusTel) {
		this.cusTel = cusTel;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	
	
}
