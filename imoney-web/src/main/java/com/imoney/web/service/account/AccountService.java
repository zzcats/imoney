package com.imoney.web.service.account;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.imoney.mongodb.entity.User;
import com.imoney.mongodb.repository.BasicRepository;


public class AccountService {

	BasicRepository<User> userDao;

	public User getUser(ObjectId id) {
		return userDao.findById(id);
	}

	public User findUserByLoginName(String loginName) {
		return userDao.findOneByName(loginName, "loginName");
	}


	public void setUserDao(BasicRepository<User> userDao) {
		this.userDao = userDao;
	}
	

}
