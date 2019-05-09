package service;

import org.junit.Before;
import org.junit.Test;

import dt.library.entity.User;
import dt.library.service.IUserService;
import dt.library.service.ex.ServiceException;
import dt.library.service.impl.UserServiceImpl;
import test.BaseTestCase;

public class IUserServiceTests extends BaseTestCase {
	IUserService userService;

	@Before
	public void doBefore() {
		super.doBefore();
		userService = ac.getBean("userServiceImpl", UserServiceImpl.class);
	}

	@Test
	public void add() {
		try {
			User user = new User("service", "0000", "123", 1, 1, 1, 1, 1);
			userService.add(user);
			System.out.println("ok");
		} catch (ServiceException e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void login() {
		try {
			User user=userService.login("admin","123");
			System.out.println(user);
		} catch (ServiceException e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
		}
	}
}
