package com.zby.ssmspringboot2.controller;

import com.zby.ssmspringboot2.domain.User;
import com.zby.ssmspringboot2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/showUser",method ={RequestMethod.POST,RequestMethod.GET})
	public User showUser(){
		User user=userService.getUserById(1);
		return user;
	}
}
