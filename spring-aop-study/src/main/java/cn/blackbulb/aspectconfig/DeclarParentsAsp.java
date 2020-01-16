package cn.blackbulb.aspectconfig;

import cn.blackbulb.service.Skill;
import cn.blackbulb.service.impl.Run;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author wangcan
 */
//@Aspect
//@Component
public class DeclarParentsAsp {
	/**
	 * 为person类增加方法，+表示他的子类都会增加
	 */
	@DeclareParents(value = "cn.blackbulb.pojo.Person+",defaultImpl = Run.class)
	public Skill skill;
}
