package com.firstapplication.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prodct_managment")
public class productDetails {
	
	@Id
	@Column(name="pId")
	private int productId;
	
	@Column(name="pName")
	private String productName;
	
	@Column(name="pPrice")
	private double productPrice;
	
	@Column(name="customerId")
	private int ordered;

	public int getProductId() {
		return productId;
	}
	
	

	public productDetails() {
			super();
		}
	
	




public productDetails(int productId, String productName, double productPrice, int ordered) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.ordered = ordered;
	}



//	public void setProductId(int productId) {
//		this.productId = productId;
//	}

	public String getProductName() {
		return productName;
	}

//	public void setProductName(String productName) {
//		this.productName = productName;
//	}

	public double getProductPrice() {
		return productPrice;
	}
	
	public int getOrdered() {
		return ordered;
	}

//	public void setProductPrice(double productPrice) {
//		this.productPrice = productPrice;
//	}
	
	

}
