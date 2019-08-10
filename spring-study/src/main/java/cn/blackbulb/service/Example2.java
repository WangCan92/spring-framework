package cn.blackbulb.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author wangcan
 */
@Component
public class Example2 implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	public void printOut() {
		System.out.println("example2 printing ***********");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
//		System.out.println(applicationContext);
	}
}
