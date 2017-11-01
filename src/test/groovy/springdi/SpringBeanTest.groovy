package springdi;

import com.pickshell.springdi.service.AudioPlayer
import com.pickshell.springdi.service.CDPlayer;
import com.pickshell.springdi.service.MediaPlayer
import com.pickshell.springdi.service.Mp4Player;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext

import javax.sql.DataSource;

import static org.junit.Assert.assertNotNull;

/**
 * Created by uc212310 on 10/26/2017.
 */
public class SpringBeanTest {

    @Test
    public void getBean(){
        final String CONFIG_PACKAGE = "com.pickshell";
        try {
            AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()
            ctx.scan(CONFIG_PACKAGE);
            ctx.refresh();

            MediaPlayer player = ctx.getBean(AudioPlayer.class);
            assertNotNull(player);
            player.play();
            player = ctx.getBean(Mp4Player.class)
            assert player
            player.play()
            //unique implement class, use interface type
            CDPlayer cdPlayer = ctx.getBean(CDPlayer.class)
            assert cdPlayer
            cdPlayer.play()

            DataSource dataSource = ctx.getBean("dataSource");
            assert dataSource
        }catch (Exception e){
            e.printStackTrace()
        }
    }
}
