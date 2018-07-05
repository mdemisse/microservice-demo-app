package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.UserDao;
import com.app.model.User;

@RestController
public class UserController {

	@Autowired UserDao userDao;
	
	// test service
	@RequestMapping("/hi")
	public String hi() {
		return "Hello from Emplyee Data API";
	} 
	
	// gets the list of users
	@RequestMapping("/userList")
	public List<User> getUsers() {
		return userDao.findAll();
	}
	
	// saves new users
	@RequestMapping(value= "/signup", method = RequestMethod.POST)
	public boolean save(@RequestBody User user) {
		userDao.save(user);
		return true;
	}
}
