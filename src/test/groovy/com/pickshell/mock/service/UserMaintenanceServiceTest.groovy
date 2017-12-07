package com.pickshell.mock.service

import com.pickshell.mock.dao.UserDao
import com.pickshell.mock.domain.User
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations

import static junit.framework.Assert.assertNotNull
import static org.junit.Assert.assertEquals
import static org.junit.Assert.fail
import static org.mockito.Mockito.when

/**
 * Created by Uc212310 on 12/7/2017.
 */
class UserMaintenanceServiceTest {
    @InjectMocks
    private UserMaintenanceService userMaintenanceService;
    @Mock
    private UserDao userDao;//it can't be class,only work for interface

    @Test
    public void testFindUserByIdPositive() {
        MockitoAnnotations.initMocks(this);
        when(userDao.findUserById(1000L)).thenReturn(getMeTestUser());
        User user = userMaintenanceService.findUserById(1000L);
        assertNotNull(user);
        assertEquals("Test first name", user.getFirstName());
        assertEquals("Test surname", user.getSurname())
    }
    @Test (expected = NullPointerException.class)
    public void testFindUserByIdNegetive() {
        userMaintenanceService = new UserMaintenanceService();
        userMaintenanceService.findUserById(1000L);
        fail();
    }
    private User getMeTestUser() {
        User user = new User();
        user.setUserId(1000L);
        user.setFirstName("Test first name");
        user.setSurname("Test surname");
        user.setDateOfBirth(new Date());
        return user;
    }

}