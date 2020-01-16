package cn.blackbulb.factory;

import cn.blackbulb.conf.AppConfig;
import cn.blackbulb.dao.*;
import cn.blackbulb.factorybean.OtherDaoBean;
import cn.blackbulb.factorybean.TestDaoFactoryBean;
import cn.blackbulb.imports.ExtendImportConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangcan
 */

public class FactoryBeanTest {
	private AnnotationConfigApplicationContext ac;

	@Before
	public void initApplicationContext() {
		this.ac = new AnnotationConfigApplicationContext(AppConfig.class);
	}

	@Test
	public void factoryBeanTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//		TestDaoFactoryBean testDaoFactory = (TestDaoFactoryBean) ac.getBean("testDaoFactoryBean");
		TestDaoFactoryBean testDaoFactory = (TestDaoFactoryBean) ac.getBean("&testDaoFactoryBean");
		OtherDaoBean otherDaoBean = (OtherDaoBean) ac.getBean("testDaoFactoryBean");
		otherDaoBean.printOtherDaoInfo();
		System.out.println(testDaoFactory);
	}

	@Test
	public void annotationNOAnnoBeanTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DaoTestImpl1.class);
		DaoTest bean = ac.getBean(DaoTest.class);
		bean.daoPrint();

	}

	@Test
	public void importSelectorProxyTest() {
		ImportDao dao = (ImportDao) ac.getBean("importDaoImpl");
		//		ImportDao dao = ac.getBean(ImportDaoImpl.class);
		dao.printOunt();

	}

	@Test
	public void configurationFactoryBeanTest() {
		System.out.println(ac.getBean("testDaoFactoryBean"));
		System.out.println(ac.getBean("&testDaoFactoryBean"));
		((TestDaoFactoryBean) ac.getBean("&testDaoFactoryBean")).printMsg();
	}

	@Test
	public void importAwareTest() {
		ExtendImportConfig bean = ac.getBean(ExtendImportConfig.class);
		System.out.println(bean.toString());

	}
}
