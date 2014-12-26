package com.imoney.web.service.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.imoney.mongodb.entity.Record;
import com.imoney.mongodb.repository.BasicRepository;

public class RecordService {
	@Autowired
	@Qualifier("recordDao")
	BasicRepository<Record> recordDao;
	public void addRecord(){
		
	}
}
