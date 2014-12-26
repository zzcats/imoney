package com.imoney.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.imoney.mongodb.MongoBeansConfiguration;
import com.imoney.mongodb.MongoConfiguration;
import com.imoney.mongodb.MongoRootConfiguration;


@Configuration
@ComponentScan({"com.imoney.web","com.imoney.mongodb"})
@ImportResource({"classpath:applicationContext-shiro.xml"})
@Import({MongoBeansConfiguration.class,MongoConfiguration.class,WebAppConfiguration.class,WebBeanConfiguration.class})
public class WebRootConfiguration {

}
