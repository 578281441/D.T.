package mapper;

import org.junit.Before;
import org.junit.Test;

import dt.library.entity.User;
import dt.library.mapper.UserMapper;
import test.BaseTestCase;

public class UserMapperTests extends BaseTestCase{
	UserMapper userMapper;
	@Before
	public void doBefore() {
		super.doBefore();
		userMapper=ac.getBean("userMapper",UserMapper.class);
	}
	@Test
	public void addnew() {
		User m=new User("db1","0000","123",1,1,1,1,1);
		Integer rows=userMapper.addnew(m);
		System.out.println(rows);
	}
	@Test
	public void findByUsername() {
		User m=userMapper.findByUsername("db1");
		System.out.println(m);
	}
	@Test
	public void findById() {
		User m=userMapper.findById(2);
		System.out.println(m);
	}
}
