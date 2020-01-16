package cn.blackbulb.aspect;

import cn.blackbulb.Config;
import cn.blackbulb.service.Skill;
import cn.blackbulb.service.impl.MathDiv;
import cn.blackbulb.service.impl.Run;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangcan
 */
public class WithInAdviceTest {
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

	@Test
	public void withTest(){
		Skill bean = applicationContext.getBean(Skill.class);
		bean.run();
		applicationContext.getBean(MathDiv.class).div(1,2);
	}
}
