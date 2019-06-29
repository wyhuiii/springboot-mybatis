package com.wyh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wyh.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/insertUser")
	public Integer insertUser(String name, Integer age) {
		int insertUser = userService.insertUser(name, age);
		return insertUser;
	}

}
