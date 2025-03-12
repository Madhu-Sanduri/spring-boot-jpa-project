package com.firstapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.firstapplication.dbOperations.DBOperations;
import com.firstapplication.dbOperations.UserOperattions;

@SpringBootApplication
public class SpringBootJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(SpringBootJpaProjectApplication.class, args);
		
		DBOperations db=c.getBean(DBOperations.class);
		
		db.addProductInfo();
		
		UserOperattions uo=c.getBean(UserOperattions.class);
		uo.addUserInfo();
	}

}
