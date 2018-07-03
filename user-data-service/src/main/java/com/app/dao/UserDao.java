package com.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.model.User;

public interface UserDao extends CrudRepository<User, Long> {

	List<User> findByfName(String fName);
	 User save(User user);
	 List<User> findByFNameAndLName(String fName, String lName);
	 List<User> findAll();
}
