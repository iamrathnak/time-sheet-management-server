package com.amazon.timesheet.dao.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.amazon.timesheet.dao.LoginDao;
import com.amazon.timesheet.model.User;
/**
 * 
 * @author rathanakumark
 *
 */
@Repository
public class LoginDaoImpl implements LoginDao {
@Primary
public User userData() {
	User user = new User();
    user.setEmail("a648875@rat.com");
    user.setPassword("test@123");
	return user;
}
	
	@Override
	public boolean authenticateuser(User user) {

	if(user.getEmail().equalsIgnoreCase(userData().getEmail())) {
		return true;
	}
		return false;
	}

}
