package com.pickshell.mybatis.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.pickshell.domain.User;

public class UserServiceTest {
	UserService userService;

	@Before
	public void setUp() throws Exception {
		userService = new UserService();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUserById() {
		User user = userService.getUserById("1");
		System.out.println(user);
	}

}
