package com.pickshell.mybatis.service;

import org.apache.ibatis.session.SqlSession;

import com.pickshell.domain.User;
import com.pickshell.mybatis.dao.UserDao;
import com.pickshell.mybatis.util.ConnectionFactory;

public class UserService {

	public User getUserById(String id) {
		SqlSession session = ConnectionFactory.getSession().openSession();
		UserDao dao = session.getMapper(UserDao.class);
		User user = dao.getUserById(id);
		session.close();
		return user;
	}
}
