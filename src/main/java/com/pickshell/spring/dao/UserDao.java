package com.pickshell.spring.dao;


import com.pickshell.spring.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
  //@Select("SELECT * FROM user WHERE id = #{userId}")
  User getUser(@Param("userId") Integer userId);
} 