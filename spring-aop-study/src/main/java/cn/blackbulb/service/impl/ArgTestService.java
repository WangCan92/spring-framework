package cn.blackbulb.service.impl;

import cn.blackbulb.pojo.Father;
import org.springframework.stereotype.Service;

/**
 * @author wangcan
 */
@Service
public class ArgTestService {
	public void say(Father father){
		father.say();
	}
}
