package com.pickshell.mock.environment


import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.core.env.Environment

import javax.annotation.Resource

/**
 * Created by UC212310 on 12/15/2017.
 */
@Configuration
@PropertySource(['classpath:myProp.properties'])
class MyConfig {
    @Resource
    private Environment environment;
    @Bean(name="message")
    public String getMessage() {
        return environment.getProperty("message");
    }
}
