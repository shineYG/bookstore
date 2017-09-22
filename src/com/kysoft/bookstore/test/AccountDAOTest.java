package com.kysoft.bookstore.test;

import com.kysoft.bookstore.dao.AccountDAO;
import com.kysoft.bookstore.dao.impl.AccountDAOIml;
import com.kysoft.bookstore.domain.Account;
import org.junit.Test;



public class AccountDAOTest {

	AccountDAO accountDAO = (AccountDAO) new AccountDAOIml();
	
	@Test
	public void testGet() {
		Account account = accountDAO.get(1);
		System.out.println(account.getBalance()); 
	}

	@Test
	public void testUpdateBalance() {
		accountDAO.updateBalance(1, 50);
	}

}
