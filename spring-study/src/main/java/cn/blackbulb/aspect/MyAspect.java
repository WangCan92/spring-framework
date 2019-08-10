package cn.blackbulb.aspect;

import cn.blackbulb.dao.DaoTest;
import cn.blackbulb.dao.DaoTestImpl;
import cn.blackbulb.pojo.request.ParamTest;
import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wangcan
 */
@Component
@Aspect
//@Aspect("perthis(this(cn.blackbulb.dao.DaoTestImpl))")
//@Scope("prototype")
public class MyAspect {

	//	@DeclareParents(value = "cn.blackbulb.service.*",defaultImpl = DaoTestImpl.class)
	//	public static DaoTest dao;

	@Pointcut("execution(* cn.blackbulb.service.*.*(..))")
	public void poinCutExecution() {
	}

	@Pointcut("within(cn.blackbulb.service.*))")
	public void poinCutWithin() {
	}

	@Pointcut("args(java.lang.String)")
	public void poinCutArg() {
	}

	@Pointcut("@annotation(cn.blackbulb.anno.MyAnnotation)")
	public void pointCutAnno() {
	}

	@Pointcut("this(cn.blackbulb.dao.DaoTest)")
	public void pointCutThis() {
	}

	@Pointcut("target(cn.blackbulb.dao.DaoTestImpl)")
	public void pointCutTarget() {
	}

	@Before("poinCutExecution()")
	public void executionBefore() {
		System.out.println("=================servic execution before===========");
	}

	@Before("poinCutWithin()&&!poinCutArg()")
	public void withinBefore() {
		System.out.println("=================servic withIn before===========");
	}

	@Before("pointCutAnno()")
	public void annoBefore() {
		System.out.println("=================servic anno before===========");
	}

	//	@Before("pointCutThis()")
	//	public void thisBefore(){
	//		System.out.println("===================dao this before=============");
	//	}

	@Before("pointCutTarget()")
	public void targetBefore() {
		System.out.println("===================dao target before=============");
	}

	@Around("this(cn.blackbulb.dao.DaoTestImpl)")
	public void withinAround(ProceedingJoinPoint pjp) {
		System.out.println("切面hashCode:" + this.hashCode());
		//		System.out.println("当前类："+pjp.getThis());
		//
		//		System.out.println("目标类："+pjp.getTarget());
		System.out.println("00000000000000000 dao withIn around before===========");
		try {
			pjp.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("000000000000000000 dao withIn around after===========");
	}

	@Around("pointCutAnno()")
	public void annoAround(ProceedingJoinPoint pjp) {
		Object arg[] = pjp.getArgs();
		for (int i = 0; i < arg.length; i++) {
			arg[i] += "add add add add add";
		}
		try {
			pjp.proceed(arg);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}
	@Pointcut("execution(* cn.blackbulb.service.ServiceTest.*(..)) && args(paramTest,..)")
	public void argPointCut(ParamTest paramTest){

	}

	@Before("argPointCut( paramTest)")
	public void argBefore(ParamTest paramTest) {
		System.out.println("args ===============&&&&&&&&&&&&&&&&&before:::" + JSON.toJSONString(paramTest));
	}

}
