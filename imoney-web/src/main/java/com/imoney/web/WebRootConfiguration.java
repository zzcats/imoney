package com.imoney.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


@Configuration
@Import({WebAppConfiguration.class})
@ImportResource({"classpath:applicationContext-shiro.xml"})
@ComponentScan({"com.imoney.web","com.imoney.mongodb"})
public class WebRootConfiguration {

}
