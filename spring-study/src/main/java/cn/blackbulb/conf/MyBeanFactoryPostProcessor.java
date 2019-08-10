package cn.blackbulb.conf;

import cn.blackbulb.service.Example1;
import cn.blackbulb.service.Example2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author wangcan
 */
//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("example1");
		genericBeanDefinition.setBeanClass(Example2.class);
	}
}
