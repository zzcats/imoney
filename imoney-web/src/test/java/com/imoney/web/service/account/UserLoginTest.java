package com.imoney.web.service.account;

import junit.framework.Assert;

import org.apache.shiro.SecurityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imoney.web.WebRootConfiguration;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebRootConfiguration.class})
public class UserLoginTest {
	
	@Autowired
	SecurityManager securityManager;
	
	@Test
	public void LoginTest(){
		SecurityUtils.setSecurityManager(securityManager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("v11yu", "123");
        subject.login(token);
        assertTrue(subject.isAuthenticated());
	}
	
}
