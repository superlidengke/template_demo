package com.pickshell.mock

import com.pickshell.mock.service.AuthenticatorApplication
import com.pickshell.mock.service.AuthenticatorInterface
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.runners.MockitoJUnitRunner

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
/**
 * Created by uc212310 on 12/5/2017.
 */
@RunWith(MockitoJUnitRunner.class)
class AuthenticatorApplicationTest {
    @Mock
    private AuthenticatorInterface authenticatorMock;
    @InjectMocks
    private AuthenticatorApplication authenticator;
    @Test
    public void testAuthenticateMockInjection() {
        String username = "javacodegeeks";
        String password = "s4f3 p4ssw0rd";
        when(this.authenticatorMock.authenticateUser(username, password))
                .thenReturn(true);
        boolean actual = this.authenticator.authenticate("javacodegeeks", "s4f3 p4ssw0rd");
        assertTrue(actual);
    }
}
