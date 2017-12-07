package com.pickshell.mock.service

/**
 * Created by Uc212310 on 12/7/2017.
 */
class VoidMethodClass {
    public void voidMethodThrowingExcetion(boolean check) {
        if (check) {
            throw new IllegalArgumentException();
        }
    }
}
