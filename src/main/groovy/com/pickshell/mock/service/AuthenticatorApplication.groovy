package com.pickshell.mock.service

/**
 * Created by uc212310 on 12/4/2017.
 */
class AuthenticatorApplication {
    private AuthenticatorInterface authenticator

    AuthenticatorApplication(AuthenticatorInterface authenticator) {
        this.authenticator = authenticator
    }
    public boolean authenticate(String username, String password) {
        this.authenticator.authenticateUser(username,password)
    }
}
