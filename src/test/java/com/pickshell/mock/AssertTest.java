package com.pickshell.mock;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

/**
 * Created by UC212310 on 12/14/2017.
 */
public class AssertTest {
    @Test
    public void assert_boolean_conditions() throws Exception
    {
        Assert.assertTrue(true);
        Assert.assertFalse(false);
    }
    @Test
    public void assert_null_and_not_null_object_values()
            throws Exception {
        Object object = null;
        Assert.assertNull(object);
        object = new String("String value");
        Assert.assertNotNull(object);
    }
    @Test
    public void assert_equals_test() throws Exception {
        Integer anInteger = 5;
        Integer anotherInteger = 5;
        assertEquals(anInteger, anotherInteger);
        assertSame(anInteger,anotherInteger);
    }
    @Test
    public void assert_not_same_test() throws Exception {
        Integer anInt = new Integer("5");
        Integer anotherInt = new Integer("5");
        assertNotSame(anInt , anotherInt);
    }
    @Test(expected=RuntimeException.class)
    public void test_exception_condition() {
        throw new RuntimeException();
    }
}
