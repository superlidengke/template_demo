package com.pickshell.mock

import org.junit.Test
import static org.mockito.Mockito.*;

/**
 * Created by uc212310 on 12/5/2017.
 */
class SpyExampleTest {
    @Test
    public void spyExampleTest() {
        Map<String, String> hashMap = new HashMap<String, String>();
        Map<String, String> hashMapSpy = spy(hashMap);
        System.out.println(hashMapSpy.get("key")); // Will print null.
        hashMapSpy.put("key", "A value");
        System.out.println(hashMapSpy.get("key")); // Will print "A value".
        when(hashMapSpy.get("key")).thenReturn("Another value");
        System.out.println(hashMapSpy.get("key")); // Will print "Another value".
    }
}
