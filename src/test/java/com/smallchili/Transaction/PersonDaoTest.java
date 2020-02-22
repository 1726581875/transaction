package com.smallchili.Transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smallchili.Transaction.dao.PersonDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PersonDaoTest {

	@Autowired
	private PersonDao personDao;

	@Test
	public void testOutMoney(){
		int id = 1;
		int money = 1000;
		personDao.outMoney(id, money);
	}
	@Test
	public void testInMoney(){
		int id = 1;
		int money = 1000;
		personDao.inMoney(id, money);
	}
	
}
