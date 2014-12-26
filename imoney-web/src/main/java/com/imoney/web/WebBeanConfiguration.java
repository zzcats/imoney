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
		System.out.println("创建：create accountService");
		AccountService accountService = new AccountService();
		BasicRepository<User> userDao = (BasicRepository<User>) SpringConfigSingleton.getBean("userDao");
		System.out.println(userDao);
		System.out.println("ha"+userDao.findOneByName("v11yu", "loginName"));
		accountService.setUserDao(userDao);
		return new AccountService();
		
	}
}
