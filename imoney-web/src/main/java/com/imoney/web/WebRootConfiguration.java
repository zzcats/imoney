package com.imoney.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.imoney.mongodb.MongoBeansConfiguration;
import com.imoney.mongodb.MongoConfiguration;
import com.imoney.mongodb.MongoRootConfiguration;


@Configuration
@Import({WebAppConfiguration.class,MongoBeansConfiguration.class,MongoConfiguration.class})
@ImportResource({"classpath:applicationContext-shiro.xml"})
@ComponentScan({"com.imoney.web","com.imoney.mongodb"})
public class WebRootConfiguration {

}
