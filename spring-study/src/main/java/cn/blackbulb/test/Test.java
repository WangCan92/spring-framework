package cn.blackbulb.test;

import cn.blackbulb.conf.AppConfig;
import cn.blackbulb.service.ServiceTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangcan
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ServiceTest serviceTest = ac.getBean(ServiceTest.class);
		serviceTest.printOut();
	}
}
