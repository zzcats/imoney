package com.imoney.web.service.account;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.imoney.mongodb.MongoRootConfiguration;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MongoRootConfiguration.class},
						locations = { "/applicationContext-shiro.xml" })
public class UserLoginTest {
	
}
