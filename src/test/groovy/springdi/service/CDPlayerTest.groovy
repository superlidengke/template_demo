package springdi.service;

import com.pickshell.CDPlayerConfig;
import com.pickshell.springdi.service.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

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