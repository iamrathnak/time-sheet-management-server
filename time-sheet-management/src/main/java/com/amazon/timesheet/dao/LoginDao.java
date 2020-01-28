package com.amazon.timesheet.dao;

import com.amazon.timesheet.model.User;
/**
 * 
 * @author rathanakumark
 *
 */
public interface LoginDao {

	boolean authenticateuser(User user);

}
