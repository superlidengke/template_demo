package com.pickshell.mock;

import com.pickshell.mock.service.VoidMethodClass;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class VoidMethodClassTest {
    private VoidMethodClass mock;

    /**
     * Can't run successfully in groovy
     */
    @Test
    public void testVoidMethodThrowingExcetion() {
        mock = Mockito.mock(VoidMethodClass.class);
        Mockito.doThrow(new IllegalArgumentException()).when(mock).voidMethodThrowingExcetion(false);
        mock.voidMethodThrowingExcetion(true);
        Mockito.doThrow(new IllegalArgumentException()).when(mock).voidMethodThrowingExcetion(true);
        try {
            mock.voidMethodThrowingExcetion(true);
            Assert.fail();
        } catch (IllegalArgumentException e) {
// Expected
        }
    }
}