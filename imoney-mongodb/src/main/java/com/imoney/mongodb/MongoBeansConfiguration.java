package com.imoney.mongodb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.imoney.mongodb.entity.*;
import com.imoney.mongodb.repository.*;



@Configuration
public class MongoBeansConfiguration {
	/*
	 * topic
	 */
	@Bean
	public DBConvertor<User> userConvertor(){
		return new DBConvertor<>(User.class);
	}
	@Bean
	public BasicRepository<User> userDao(){
		return new BasicRepository<User>(User.class,userConvertor());
	}
}
