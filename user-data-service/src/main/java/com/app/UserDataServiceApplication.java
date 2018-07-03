package com.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.app.dao.UserDao;
import com.app.model.User;

@SpringBootApplication
@EnableDiscoveryClient
public class UserDataServiceApplication {
	@Autowired UserDao userDao;
	public static void main(String[] args) {
		SpringApplication.run(UserDataServiceApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		User u1 = new User("John", "Smith", "email@email.com", "john.smith","pa$$w0rd");
		userDao.save(u1);
		
		User u2 = new User("Joe", "Joyce", "joe@email.com", "joe","pa$$w0rd");
		userDao.save(u2);
	}
}
