package com.imoney.mongodb.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.imoney.mongodb.MongoRootConfiguration;
import com.imoney.mongodb.entity.User;
import com.imoney.mongodb.repository.BasicRepository;
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MongoRootConfiguration.class})
public class UserRepositoryTest {
	@Autowired
	@Qualifier("userDao")
	BasicRepository<User> userDao;
	@Before
	public void init() {
		userDao.dropAll();
		User u = new User();
		u.setLoginName("v11yu");
		u.setName("v11");
		u.setPassword("123");
		userDao.saveAndUpdate(u);
	}
	@Test
	public void testUser(){
		int count = userDao.count(userDao.findByAll());
		assertEquals(count, 1);
		User u = userDao.findOne(userDao.findByAll());
		assertEquals(u.getLoginName(), "v11yu");
	}
}
