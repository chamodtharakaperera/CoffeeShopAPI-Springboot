package com.pearson.coffee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

	@Id
	private Long productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "productDescription")
	private String productDescription;
	@Column(name = "prod_Price")
	private Double prod_Price;
	@Column(name = "prod_QtyInStock")
	private Integer prod_QtyInStock;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Double getProd_Price() {
		return prod_Price;
	}
	public void setProd_Price(Double prod_Price) {
		this.prod_Price = prod_Price;
	}
	public Integer getProd_QtyInStock() {
		return prod_QtyInStock;
	}
	public void setProd_QtyInStock(Integer prod_QtyInStock) {
		this.prod_QtyInStock = prod_QtyInStock;
	}
	
	
}
