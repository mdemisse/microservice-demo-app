package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.moder.User;

@RestController
public class SignUpController {

	@Autowired ISignup signup;
	
	
	@RequestMapping("/signup")
	public boolean save(@RequestBody User user) {
		return signup.update(user);
	}
	

	// test end point
	@RequestMapping("/hi")
	public String hi() {
		return signup.Test();
	}
}
