package com.pearson.coffee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Courier")
public class Courier {

	@Id
	private Long couriercompId;
	@Column(name = "compName")
	private String compName;
	@Column(name = "compAddress")
	private String compAddress;
	@Column(name = "comptelNo")
	private String comptelNo;
	
	public Long getCouriercompId() {
		return couriercompId;
	}
	public void setCouriercompId(Long couriercompId) {
		this.couriercompId = couriercompId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompAddress() {
		return compAddress;
	}
	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}
	public String getComptelNo() {
		return comptelNo;
	}
	public void setComptelNo(String comptelNo) {
		this.comptelNo = comptelNo;
	}
	
	
}
