package com.pickshell.mock

import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentCaptor
import org.mockito.Captor
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

import static org.junit.Assert.assertEquals

/**
 * Created by Uc212310 on 12/7/2017.
 */
class MockitoCaptorExample {
    @Mock Stack<String> stack;
    @Captor ArgumentCaptor<String> argumentCaptor;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void test() throws Exception {
        stack.add("Java Code Geeks");
        Mockito.verify(stack).add(argumentCaptor.capture());
        assertEquals("Java Code Geeks", argumentCaptor.getValue());
    }
}
