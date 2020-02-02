package com.amazon.timesheet.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
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
	

@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public boolean authenticateuser(User user) {
	String query="select email from user";
	String email=jdbcTemplate.queryForObject(query, String.class);
			System.out.println(email);
	if(user.getEmail().equalsIgnoreCase(email)) {
		return true;
	}
		return false;
	}

}
