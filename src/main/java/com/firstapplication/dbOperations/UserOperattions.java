package com.firstapplication.dbOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstapplication.jpa.userInformation;
import com.firstapplication.repo.UserInfo;

import jakarta.validation.constraints.AssertFalse.List;

@Component
public class UserOperattions {
	
	@Autowired
	private UserInfo userInfo;
	
	public void addUserInfo() {
		
		
		
		
		userInformation ui=new userInformation(1,"Madhu","+91 122");
	
//		ui.setUserId(11);
//		ui.setUserName("Madhu");
//		ui.setUserContact("+91 2241");
//		
		userInfo.save(ui);
	}

}
