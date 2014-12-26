package com.imoney.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.imoney.mongodb.entity.User;
import com.imoney.mongodb.repository.BasicRepository;
import com.imoney.mongodb.utils.SpringConfigSingleton;
import com.imoney.web.service.account.AccountService;

@Configuration
public class WebBeanConfiguration {
	// @Bean
	// ShiroDbRealm shiroDbRealm(){
	// ShiroDbRealm res = new ShiroDbRealm();
	// return res;
	// }
	@Bean
	AccountService accountService(){
		AccountService accountService = new AccountService();
		BasicRepository<User> userDao = (BasicRepository<User>) SpringConfigSingleton.getBean("userDao");
		accountService.setUserDao(userDao);
		return accountService;
		
	}
}
