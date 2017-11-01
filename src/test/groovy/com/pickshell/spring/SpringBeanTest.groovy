package com.pickshell.spring

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext

import javax.sql.DataSource

/**
 * Created by uc212310 on 10/26/2017.
 */
public class SpringBeanTest {

    @Test
    public void getBean(){
        final String CONFIG_PACKAGE = "com.pickshell.spring";
        try {
            AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()
            ctx.scan(CONFIG_PACKAGE);
            ctx.refresh();

            DataSource dataSource = ctx.getBean("dataSource");
            assert dataSource
        }catch (Exception e){
            e.printStackTrace()
        }
    }
}
