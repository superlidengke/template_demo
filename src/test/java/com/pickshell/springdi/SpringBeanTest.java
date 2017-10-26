package com.pickshell.springdi;

import com.pickshell.springdi.service.AudioPlayer;
import com.pickshell.springdi.service.MediaPlayer;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by uc212310 on 10/26/2017.
 */
public class SpringBeanTest {

    @Test
    public void getBean(){
        final String CONFIG_PACKAGE = "com.pickshell";
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()) {

            ctx.scan(CONFIG_PACKAGE);
            ctx.refresh();

            MediaPlayer player = ctx.getBean(AudioPlayer.class);
            assertNotNull(player);
            player.play();
        }
    }
}
