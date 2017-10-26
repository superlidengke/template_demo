package com.pickshell.springdi.service;

import static org.junit.Assert.*;

import com.pickshell.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CDPlayer cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }
}