package service;

import org.junit.Before;
import org.junit.Test;

import dt.library.entity.Library;
import dt.library.entity.User;
import dt.library.service.ILibraryService;
import dt.library.service.IUserService;
import dt.library.service.ex.ServiceException;
import dt.library.service.impl.LibraryServiceImpl;
import dt.library.service.impl.UserServiceImpl;
import test.BaseTestCase;

public class ILibraryServiceTests extends BaseTestCase {
	ILibraryService libraryService;

	@Before
	public void doBefore() {
		super.doBefore();
		libraryService = ac.getBean("libraryServiceImpl", LibraryServiceImpl.class);
	}
	
	@Test
	public void show(){
		Library l=libraryService.show();
		System.out.println(l);
	}

}
