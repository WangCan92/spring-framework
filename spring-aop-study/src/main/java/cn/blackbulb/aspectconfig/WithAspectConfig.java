package cn.blackbulb.aspectconfig;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wangcan
 */
//@Aspect
//@Component
public class WithAspectConfig {

	@Pointcut("within(cn.blackbulb.service..*)")
	public void withinPointcut(){}

	@Before("withinPointcut()")
	public void beforeAdvice(){
		System.out.println("commomn before advice----------------");
	}

}
