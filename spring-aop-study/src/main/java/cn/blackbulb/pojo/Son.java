package cn.blackbulb.pojo;

import org.springframework.stereotype.Component;

/**
 * @author wangcan
 */
@Component
public class Son extends Father {
	@Override
	public void sonSay() {
		System.out.println("我是儿子");
	}

	public void play(){
		System.out.println("儿子玩耍");
	}
}
