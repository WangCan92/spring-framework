package cn.blackbulb.service.impl;

import cn.blackbulb.service.Skill;
import org.springframework.stereotype.Service;

/**
 * @author wangcan
 */
@Service
public class Run implements Skill {
	@Override
	public void run() {
		System.out.println("我会走路。。。。。。。。。。");
	}
}
