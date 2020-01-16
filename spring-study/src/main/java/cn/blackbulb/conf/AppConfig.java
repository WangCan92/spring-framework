package cn.blackbulb.conf;

import cn.blackbulb.anno.EnableImportConfig;
import cn.blackbulb.anno.EnableMyImportDao;
import cn.blackbulb.dao.DaoTestImpl;
import cn.blackbulb.dao.DaoTestImpl1;
import cn.blackbulb.dao.ImportDaoImpl;
import cn.blackbulb.factorybean.TestDaoFactoryBean;
import cn.blackbulb.service.ServiceTest;
import org.springframework.context.annotation.*;

/**
 * @author wangcan
 */
//@ImportResource("classpath:spring-aop.xml")
@EnableMyImportDao
//@ImportResource("classpath:factorybean.xml")
@ComponentScan("cn.blackbulb")
@Configuration
@EnableImportConfig(name = "${extend.config.name}",code = "${extend.config.code}")
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//@ComponentScan(value = "cn.blackbulb",excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX,pattern = "cn.blackbulb.service.*")},includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = ServiceTest.class)})
public class AppConfig {
	@Bean
	@Primary
	public DaoTestImpl daoTestImpl() {
		return new DaoTestImpl();
	}

	@Bean
	public DaoTestImpl1 daoTestImpl1() {
		testDaoFactoryBean();
		return new DaoTestImpl1();
	}

	@Bean
	public ImportDaoImpl importDaoImpl() {
		return new ImportDaoImpl();
	}

	@Bean
	public TestDaoFactoryBean testDaoFactoryBean() {
		TestDaoFactoryBean testDaoFactoryBean = new TestDaoFactoryBean();
		testDaoFactoryBean.setMsg("msg1,msg2,msg3");
		return testDaoFactoryBean;
	}
}
