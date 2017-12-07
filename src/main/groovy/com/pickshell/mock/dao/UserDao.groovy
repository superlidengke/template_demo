package com.pickshell.mock.dao

import com.pickshell.mock.domain.User
import org.springframework.stereotype.Component

/**
 * Created by Uc212310 on 12/7/2017.
 */
interface UserDao {
    public User findUserById(Long id);
}
