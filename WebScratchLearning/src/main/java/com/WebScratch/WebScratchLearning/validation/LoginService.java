package com.WebScratch.WebScratchLearning.validation;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String username, String password) {
		return username.equalsIgnoreCase("krishna") && password.equalsIgnoreCase("ll");
	}

}
