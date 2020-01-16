package cn.blackbulb.aspect;

import cn.blackbulb.Config;
import cn.blackbulb.pojo.Son;
import cn.blackbulb.service.Skill;
import cn.blackbulb.service.impl.MathDiv;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangcan
 */
public class ThisTargetAdviceTest {
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

	@Test
	public void withTest(){
		Son bean = applicationContext.getBean(Son.class);
		bean.say();
		bean.fatherSay();
		bean.sonSay();
		bean.play();

	}

	@Test
	public void thisTest(){
		Skill bean = applicationContext.getBean(Skill.class);
		bean.run();

	}
}
