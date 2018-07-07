package com.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.moder.User;

@FeignClient(name = "user-data-service")
public interface ISignup {

	@RequestMapping(method = RequestMethod.POST, value = "/signup", consumes = "application/json")
	boolean update(@RequestBody User u);
	
	// test
	@RequestMapping(method = RequestMethod.GET, value = "/hi")
	String Test();

}
