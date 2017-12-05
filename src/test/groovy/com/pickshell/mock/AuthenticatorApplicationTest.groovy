package com.pickshell.mock

import com.pickshell.mock.service.AuthenticatorApplication
import com.pickshell.mock.service.AuthenticatorInterface
import org.junit.Test
import org.mockito.Mockito
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
/**
 * Created by uc212310 on 12/5/2017.
 */
class AuthenticatorApplicationTest {
    @Test
    public void testAuthenticate() {
        AuthenticatorInterface authenticatorMock;
        AuthenticatorApplication authenticator;
        String username = "JavaCodeGeeks";
        String password = "unsafePassword";
        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);
        when(authenticatorMock.authenticateUser(username, password))
                .thenReturn(false);
        verify(authenticatorMock, never()).authenticateUser(username, password);
        boolean actual = authenticator.authenticate(username, password);
        assertFalse(actual);
        //verify the method of the mock object has been called by the expected arguments
        verify(authenticatorMock).authenticateUser(username, password);
        //Verify that method has been called n times
        verify(authenticatorMock, times(1)).authenticateUser(username, password);
        verify(authenticatorMock, atLeastOnce()).authenticateUser(username, password);
        verify(authenticatorMock, atLeast(1)).authenticateUser(username, password);
        verify(authenticatorMock, atMost(1)).authenticateUser(username, password);
        //timeout
        verify(authenticatorMock, timeout(100)).authenticateUser(username, password);
        //timeout for n method calls
        verify(authenticatorMock, timeout(100).times(1)).authenticateUser(username, password);
    }
}
