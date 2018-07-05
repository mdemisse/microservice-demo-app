package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

	@Autowired SignUpService signUpService;
	@RequestMapping("/hi")
	public String hi() {
		//return signUpService.getEmployeesTest();
		return "Hi";
	}
}
