package com.pickshell.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan //scan bean in the same package or sub
@ImportResource({"classpath:spring_bean.xml","classpath:profile_bean.xml"})
public class SpringConfig {
}