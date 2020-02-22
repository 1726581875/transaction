package com.smallchili.Transaction.dao;

import org.apache.ibatis.annotations.Param;

public interface PersonDao {

	/**
	 * @param outId 转账人Id
	 * @param money 金额
	 */
	public void outMoney(@Param("outId") int outId,@Param("money") int money);
    
	/**
	 * @param inId 收款方Id
	 * @param money 金额
	 */
	public void inMoney(@Param("inId") int inId,@Param("money") int money);
	
}
