package com.amazon.timesheet.service;

import com.amazon.timesheet.model.User;
/**
 * 
 * @author rathanakumark
 *
 */
public interface LoginService {

	boolean authenticateUser(User user);

}
