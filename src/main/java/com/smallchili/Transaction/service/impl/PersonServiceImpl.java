package com.smallchili.Transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.smallchili.Transaction.dao.PersonDao;
import com.smallchili.Transaction.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao personDao;
	
	@Override
	/**
	 * @Transactional的注解属性:
	 * propagation:事务的传播行为
	 * isolation  :事务隔离级别
	 * readOnly   :只读
	 * rollbackFor:发生哪些异常要回滚
	 * noRollbackFor:发生哪些异常不回滚
	 * */
	//@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false)
	
	public void transfer(int outId, int inId, int money) {		
		personDao.outMoney(outId, money);
		int a = 1/0;//制造异常
		personDao.inMoney(inId,money);		
	}

	
	
}
