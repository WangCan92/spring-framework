package cn.blackbulb.aspect;

import cn.blackbulb.Config;
import cn.blackbulb.pojo.Son;
import cn.blackbulb.service.Skill;
import cn.blackbulb.service.impl.ArgTestService;
import cn.blackbulb.service.impl.MathDiv;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangcan
 */
public class ArgAspectTest {

	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

	@Test
	public void argTest(){
		ArgTestService bean = applicationContext.getBean(ArgTestService.class);
		bean.say(new Son());
	}
}
