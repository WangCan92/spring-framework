package cn.blackbulb.factory;

import cn.blackbulb.conf.AppConfig;
import cn.blackbulb.dao.DaoTest;
import cn.blackbulb.dao.DaoTestImpl1;
import cn.blackbulb.factorybean.OtherDaoBean;
import cn.blackbulb.factorybean.TestDaoFactoryBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangcan
 */

public class FactoryBeanTest {

	@Test
	public void factoryBeanTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		TestDaoFactoryBean testDaoFactory = (TestDaoFactoryBean) ac.getBean("testDaoFactoryBean");
		TestDaoFactoryBean testDaoFactory = (TestDaoFactoryBean)ac.getBean("&testDaoFactoryBean");
		OtherDaoBean otherDaoBean = (OtherDaoBean)ac.getBean("testDaoFactoryBean");
		otherDaoBean.printOtherDaoInfo();
		System.out.println(testDaoFactory);
	}

	@Test
	public  void annotationNOAnnoBeanTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DaoTestImpl1.class);
		DaoTest bean = ac.getBean(DaoTest.class);
		bean.daoPrint();

	}
}
