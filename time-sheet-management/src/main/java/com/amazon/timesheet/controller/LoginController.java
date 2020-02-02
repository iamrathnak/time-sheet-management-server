package com.amazon.timesheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.timesheet.exception.ServiceException;
import com.amazon.timesheet.model.User;
import com.amazon.timesheet.service.LoginService;
import com.amazon.timesheet.utilities.ResponseBuilder;
/**
 * 
 * @author rathanakumark
 *
 */
@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public ResponseBuilder authenticateUser( User user) throws ServiceException {
		boolean userDetails = loginService.authenticateUser(user);
		if (!userDetails) {
			return new ResponseBuilder("F00", "Failed to login. Please try again!" );
		}

		return new ResponseBuilder("S00", "Login Success");
	}
}
