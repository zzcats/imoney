package com.imoney.web.service.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.imoney.web.WebRootConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfiguration.class})
public class AccountServiceTest {
	@Autowired
	AccountService accountService;

	@Test
	public void testUser(){
		if(accountService.userDao == null)
			System.out.println("空 userDao is null");
		else 
			System.out.println(accountService.findUserByLoginName("v11yu"));
	}

}
