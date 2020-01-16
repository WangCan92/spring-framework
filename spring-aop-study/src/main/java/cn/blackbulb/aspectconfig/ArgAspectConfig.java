package cn.blackbulb.aspectconfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wangcan
 */
@Aspect
@Component
public class ArgAspectConfig {

	@Pointcut("target(cn.blackbulb.service.impl.ArgTestService)&&args(cn.blackbulb.pojo.Son)")
	public void argPointcut(){}

//	@Pointcut("target(cn.blackbulb.service.impl.ArgTestService)&&execution(* *(cn.blackbulb.pojo.Son))")
//	public void argPointcut(){}

	@Before("argPointcut()")
	public void argAdviceBefore(JoinPoint jp){
		Object[] args = jp.getArgs();
		Signature signature = jp.getSignature();
		String kind = jp.getKind();
		jp.toString();
		System.out.println("arg advice before ---------");
	}
}
