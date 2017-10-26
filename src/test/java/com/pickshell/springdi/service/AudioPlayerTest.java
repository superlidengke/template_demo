package com.pickshell.springdi.service;

import com.pickshell.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by uc212310 on 10/26/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class AudioPlayerTest {
    @Autowired
    private MediaPlayer player;

    @Test
    public void playerShouldNotBeNull(){
        assertNotNull(player);
    }

    @Test
    public void play() {
        player.play();
    }
}
