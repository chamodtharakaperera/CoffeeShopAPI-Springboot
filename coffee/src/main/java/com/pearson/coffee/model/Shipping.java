package com.pearson.coffee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="Shipping")
public class Shipping {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long shippingId;
	private Long couriercompId;
	private Long orderId;
	@CreationTimestamp
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
