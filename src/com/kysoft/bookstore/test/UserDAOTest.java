package com.kysoft.bookstore.test;

import com.kysoft.bookstore.dao.UserDAO;
import com.kysoft.bookstore.dao.impl.UserDAOImpl;
import com.kysoft.bookstore.domain.User;
import org.junit.Test;



public class UserDAOTest {

	private UserDAO userDAO = new UserDAOImpl();
	
	@Test
	public void testGetUser() {
		User user = userDAO.getUser("AAA");
		System.out.println(user); 
	}

}
