package trey.xmless.bootstrap;

import static junit.framework.Assert.assertFalse;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import trey.xmless.dao.PlanetDao;

public class TestWebAppInitializer {

	@Test
	public void test() throws SQLException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);

		// verify that variable substitution is working
		DriverManagerDataSource dataSource = context.getBean(DriverManagerDataSource.class);
		assertFalse("${db.url}".equals(dataSource.getUrl()));

		PlanetDao dao = context.getBean(PlanetDao.class);
		assertFalse("${db.url}".equals(((DriverManagerDataSource)dao.getDataSource()).getUrl()));
	}

}
