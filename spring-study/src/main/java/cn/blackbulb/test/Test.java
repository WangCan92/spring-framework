package cn.blackbulb.test;

import cn.blackbulb.conf.AppConfig;
import cn.blackbulb.dao.ImportDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangcan
 */
public class Test {
	public static void main(String[] args) {
		//准备spring的前提环境
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("classpath:factorybean.xml");
//		System.out.println(cc.getBean(TestDaoFactoryBean.class));

		//		ac.getEnvironment().setActiveProfiles("dev");
//		ac.register(AppConfig.class);
//		ac.refresh();
//		ac.register(Example2.class);
//		ServiceTest serviceTest = ac.getBean(ServiceTest.class);
//		serviceTest.printOut();
		//初始化spring容器
//		ac.refresh();
//		Example2 example2 = ac.getBean(Example2.class);
//		example2.printOut();
//		ac.getBean(DaoTest.class);
//		ac.close();
//		ServiceTest serviceTest = ac.getBean(ServiceTest.class);
//		ParamTest paramTest = new ParamTest();
//		paramTest.setSourceCode("123");
//		paramTest.setUserId("0987");
//		serviceTest.printParam(paramTest,12222);
//		serviceTest.printOut();
//		serviceTest.printOutStr("99999999999");
//		serviceTest.printOutAnno("8888888888888");
//		DaoTestImpl daoTestImpl = ac.getBean(DaoTestImpl.class);
//		daoTestImpl.daoPrint();
//		System.out.println("=====================");
//		DaoTest daoTest = (DaoTest) ac.getBean(Dao.class);
//		DaoTest daoTest1 = (DaoTest)ac.getBean(ServiceTest.class);
//		daoTest1.daoPrint();

//		DaoTest daoimpl = ac.getBean(DaoTest.class);
//		daoimpl.daoPrint();

//		ac.getBean(ImportDaoImpl.class).printOut();

	}
}