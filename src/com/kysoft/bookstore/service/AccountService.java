package com.kysoft.bookstore.service;


import com.kysoft.bookstore.dao.AccountDAO;
import com.kysoft.bookstore.dao.impl.AccountDAOIml;
import com.kysoft.bookstore.domain.Account;

public class AccountService {
	
	private AccountDAO accountDAO = (AccountDAO) new AccountDAOIml();
	
	public Account getAccount(int accountId){
		return accountDAO.get(accountId);
	}
	
}
