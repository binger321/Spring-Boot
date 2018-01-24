package com.zby.ssmspringboot2.service.impl;

import com.zby.ssmspringboot2.dao.UserMapper;
import com.zby.ssmspringboot2.domain.User;
import com.zby.ssmspringboot2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}

}
