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
public class ThisTargetAspect {

	@Pointcut("this(cn.blackbulb.pojo.Son)")
	public void thisPoincut(){}

	@Before("thisPoincut()")
	public void thisBeforeAdvice(){
		System.out.println("this before advice");
	}

//	@Pointcut("target(cn.blackbulb.service.impl.Run)")
//	public void thisRunPoincut(){}
//
//	@Before("thisRunPoincut()")
//	public void thisRunPointcutAdvice(){
//		System.out.println("before thisRunPointcutAdvice--------");
//	}
}
