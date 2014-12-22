package com.imoney.web.service.account;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.imoney.mongodb.entity.User;
import com.imoney.mongodb.repository.BasicRepository;

@Component
public class AccountService {
	@Qualifier("userDao")
	BasicRepository<User> userDao;
	public User getUser(ObjectId id) {
		return userDao.findById(id);
	}

	public User findUserByLoginName(String loginName) {
		return userDao.findOneByName(loginName,"loginName");
	}
}
