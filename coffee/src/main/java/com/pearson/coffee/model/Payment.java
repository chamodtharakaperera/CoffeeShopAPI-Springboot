package com.pearson.coffee.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Payment")
public class Payment {

	@Id
	private Long paymentId;
	private Long cusId;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date paymentDate;
	@Column(name = "payment_Amount")
	private Double payment_Amount;
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Long getCusId() {
		return cusId;
	}
	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Double getPayment_Amount() {
		return payment_Amount;
	}
	public void setPayment_Amount(Double payment_Amount) {
		this.payment_Amount = payment_Amount;
	}
	
	
}
