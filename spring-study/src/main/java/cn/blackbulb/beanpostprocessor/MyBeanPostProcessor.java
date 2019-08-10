package cn.blackbulb.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author wangcan
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor,PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("serviceTest")){
			System.out.println("serviceTest before......");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("serviceTest")){
			System.out.println("serviceTest after......");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
