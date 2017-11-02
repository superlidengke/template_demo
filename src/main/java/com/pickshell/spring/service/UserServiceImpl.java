package com.pickshell.spring.service;


import com.pickshell.spring.dao.UserDao;
import com.pickshell.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by uc212310 on 11/1/2017.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userMapper;
    @Override
    public User queryUser(Integer id) {
        return this.userMapper.getUser(id);
    }
}
