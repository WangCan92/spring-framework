package cn.blackbulb.imports;

import cn.blackbulb.dao.ImportDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * @author wangcan
 */
public class ImportDaoBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("importDaoImpl")){
			bean = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),new Class[]{ImportDao.class},new ImportDaoInvocationHandler(bean));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
