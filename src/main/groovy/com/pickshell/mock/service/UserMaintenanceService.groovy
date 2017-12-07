package com.pickshell.mock.service

import com.pickshell.mock.dao.UserDao
import com.pickshell.mock.domain.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Uc212310 on 12/7/2017.
 */
@Component
class UserMaintenanceService {
    @Autowired
    private UserDao userDao;
    
    public User findUserById(Long userId) {
        // Do business validations.
        return userDao.findUserById(userId);
    }
}
