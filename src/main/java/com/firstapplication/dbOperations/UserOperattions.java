package com.firstapplication.dbOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstapplication.jpa.userInformation;
import com.firstapplication.repo.UserInfo;

@Component
public class UserOperattions {
	
	@Autowired
	private UserInfo userInfo;
	
	public void addUserInfo() {
		userInformation ui=new userInformation();
		ui.setUserId(122111);
		ui.setUserName("Madhu");
		ui.setUserContact("+91 2241");
		
		userInfo.save(ui);
	}

}
