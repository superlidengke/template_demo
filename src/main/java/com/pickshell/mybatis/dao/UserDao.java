package com.pickshell.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import com.pickshell.domain.User;

public interface UserDao {
	String MQL_GET_USER_BY_ID = "select * from users where user_id = #{id}";

	@Select(MQL_GET_USER_BY_ID)
	public User getUserById(String id);
}
