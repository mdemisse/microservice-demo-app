package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.UserDao;
import com.app.model.User;

@RestController
public class UserController {

	@Autowired UserDao userDao;
	
	@RequestMapping("/userList")
	public List<User> getUsers() {
		return userDao.findAll();
	}
	
	@RequestMapping("/hi")
	public String hi() {
		return "Hello from Emplyee Data API";
	}
	
}
