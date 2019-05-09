package test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTestCase {

	protected ClassPathXmlApplicationContext ac;
	@Before
	public void doBefore() {
		ac=new ClassPathXmlApplicationContext("spring.xml");
	}
	@After
	public void doAfter() {
		ac.close();
	}
}
