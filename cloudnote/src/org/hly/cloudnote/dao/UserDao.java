package org.hly.cloudnote.dao;

import org.hly.cloudnote.entity.User;

public interface UserDao {
	   
	public void save(User user);
	public User findByName(String name);
	

	
}