package service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dt.library.entity.Library;
import dt.library.entity.User;
import dt.library.service.IBookVOService;
import dt.library.service.ILibraryService;
import dt.library.service.IUserService;
import dt.library.service.ex.ServiceException;
import dt.library.service.impl.BookVOServiceImpl;
import dt.library.service.impl.LibraryServiceImpl;
import dt.library.service.impl.UserServiceImpl;
import dt.library.vo.BookVO;
import test.BaseTestCase;

public class IBookVOServiceTests extends BaseTestCase {
	IBookVOService service;

	@Before
	public void doBefore() {
		super.doBefore();
		service = ac.getBean("bookVOServiceImpl", BookVOServiceImpl.class);
	}
	
	@Test
	public void sort(){
		List<BookVO> list=service.sort();
		System.out.println(list);
	}

}
