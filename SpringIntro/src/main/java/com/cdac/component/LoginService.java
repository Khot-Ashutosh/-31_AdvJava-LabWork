package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("loginServ")
public class LoginService {

	public boolean isValidUser(String username, String password) {
		if(username.equals("Ashutosh") && password.equals("123"))
			return true;
		return false;
	}
}
