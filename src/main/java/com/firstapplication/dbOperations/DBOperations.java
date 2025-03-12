package com.firstapplication.dbOperations;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstapplication.jpa.productDetails;
import com.firstapplication.repo.ProductJPA;



@Component
public class DBOperations {
	
	@Autowired
	private ProductJPA productJPA;
	
	public void addProductInfo() {
		
		List<productDetails> list = new ArrayList<>();
//		list.add(new productDetails(111,"iphone",52448.0,1));
		list.add(new productDetails(111,"iphone",52448,1));
		list.add(new productDetails(1236,"cpu",144881,2));
		list.add(new productDetails(1445,"keyboard",48881,1));
		productDetails p1=new productDetails();
		
//		p1.setProductId(1111);
//		p1.setProductName("Iqqo Z6 Mobile");
//		p1.setProductPrice(25999.00);
		
		productJPA.saveAll(list);
	}

}
