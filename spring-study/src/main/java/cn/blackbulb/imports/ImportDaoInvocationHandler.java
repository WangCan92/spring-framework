package cn.blackbulb.imports;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangcan
 */
public class ImportDaoInvocationHandler implements InvocationHandler {
	private Object target;

	public ImportDaoInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("importDaoImpl 代理内容。。。。。");
		return method.invoke(target,args);
	}
}
