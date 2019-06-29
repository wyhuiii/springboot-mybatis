package com.wyh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyh.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public int insertUser(String name, Integer age) {
		int insertResult = userMapper.insert(name, age);
		return insertResult;
	}

}
