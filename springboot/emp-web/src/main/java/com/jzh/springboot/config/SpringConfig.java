package com.jzh.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by jzh on 2017/4/7.
 */
@Configuration
@ImportResource(locations = {"classpath:spring-jmx.xml"})
public class SpringConfig {
}
