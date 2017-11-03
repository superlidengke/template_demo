package com.pickshell.spring.service

import com.pickshell.spring.SpringConfig
import com.pickshell.spring.domain.User
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by uc212310 on 11/1/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
@ActiveProfiles("prod")
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:test-data.sql")
class UserServiceTest {
    @Autowired
    UserService service;
    @Test
    public void queryUser(){
        User user = service.queryUser(1)
        assert user.id == 1 && user.name == 'tom'
    }
}
