package com.firstapplication.dbOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstapplication.jpa.productDetails;
import com.firstapplication.repo.ProductJPA;

@Component
public class DBOperations {
	
	@Autowired
	private ProductJPA productJPA;
	
	public void addProductInfo() {
		productDetails p1=new productDetails();
		
		p1.setProductId(1111);
		p1.setProductName("Iqqo Z6 Mobile");
		p1.setProductPrice(25999.00);
		
		productJPA.save(p1);
	}

}
