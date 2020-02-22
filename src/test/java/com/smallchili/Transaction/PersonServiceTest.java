package com.smallchili.Transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smallchili.Transaction.service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext1.xml")//配置1，注解
//@ContextConfiguration("classpath:applicationContext2.xml")//配置2，xml
//@ContextConfiguration("classpath:applicationContext3.xml")//配置3，aspectJ

public class PersonServiceTest {
	//@Resource(name="personServiceProxy")//配置2,要代理类
	@Resource
	PersonService personService;
	
	@Test
	public void transferTest(){
		int outId = 2;
		int inId = 1;
		int money = 10000;
		personService.transfer(outId, inId, 10000);
	}
	
}
