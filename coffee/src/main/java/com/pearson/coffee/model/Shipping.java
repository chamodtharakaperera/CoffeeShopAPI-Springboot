package com.pearson.coffee.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Shipping")
public class Shipping {

	@Id
	private Long shippingId;
	private Long couriercompId;
	private Long orderId;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date shipped_Date;
	@Column(name = "shipping_Status")
	private String shipping_Status;
	public Long getShippingId() {
		return shippingId;
	}
	public void setShippingId(Long shippingId) {
		this.shippingId = shippingId;
	}
	public Long getCouriercompId() {
		return couriercompId;
	}
	public void setCouriercompId(Long couriercompId) {
		this.couriercompId = couriercompId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Date getShipped_Date() {
		return shipped_Date;
	}
	public void setShipped_Date(Date shipped_Date) {
		this.shipped_Date = shipped_Date;
	}
	public String getShipping_Status() {
		return shipping_Status;
	}
	public void setShipping_Status(String shipping_Status) {
		this.shipping_Status = shipping_Status;
	}
	
	
}
