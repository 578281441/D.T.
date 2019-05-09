package mapper;

import org.junit.Before;
import org.junit.Test;

import dt.library.entity.Library;
import dt.library.entity.User;
import dt.library.mapper.LibraryMapper;
import dt.library.mapper.UserMapper;
import test.BaseTestCase;

public class LibraryMapperTests extends BaseTestCase{
	LibraryMapper libraryMapper;
	@Before
	public void doBefore() {
		super.doBefore();
		libraryMapper=ac.getBean("libraryMapper",LibraryMapper.class);
	}
	@Test
	public void find() {
		Library l=libraryMapper.find();
		System.out.println(l);
	}
}
