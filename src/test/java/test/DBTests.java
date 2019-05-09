package test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBTests extends BaseTestCase{

	DataSource ds;
	@Test
	public void test() throws SQLException {
		ds=ac.getBean("dataSource",BasicDataSource.class);
		System.out.println(ds.getConnection());
	}
}
