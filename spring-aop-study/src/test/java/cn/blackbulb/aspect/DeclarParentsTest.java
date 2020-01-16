package cn.blackbulb.aspect;

import cn.blackbulb.Config;
import cn.blackbulb.pojo.Person;
import cn.blackbulb.service.Skill;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangcann
 */
public class DeclarParentsTest {
	@Test
	public void personTest(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Object person = applicationContext.getBean("person");
		((Person)person).introduce();
		((Skill)person).run();
	}
}
