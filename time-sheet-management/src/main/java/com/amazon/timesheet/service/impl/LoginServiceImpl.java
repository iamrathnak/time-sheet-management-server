package com.amazon.timesheet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.timesheet.dao.LoginDao;
import com.amazon.timesheet.model.User;
import com.amazon.timesheet.service.LoginService;
/**
 * 
 * @author rathanakumark
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public boolean authenticateUser(User user) {
		return loginDao.authenticateuser(user);
	}

}
