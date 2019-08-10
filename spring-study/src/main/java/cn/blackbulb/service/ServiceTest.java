package cn.blackbulb.service;

import cn.blackbulb.anno.MyAnnotation;
import cn.blackbulb.dao.DaoTest;
import cn.blackbulb.pojo.request.ParamTest;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wangcan
 */
@Component
public class ServiceTest {
	@Autowired
//	@Qualifier("daoTestImpl1")
	DaoTest daoTest;

	public ServiceTest() {
		System.out.println("ServiceTest 构造方法。。。。。");
	}

	@PostConstruct
	public void init() {
		System.out.println("ServiceTest 初始化。。。。");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("ServiceTest 销毁。。。");
	}

	public void printOut() {
		System.out.println("*************serviceTest printOut***********");
	}

	public void printOutStr(String str) {
		System.out.println("*************serviceTest printOut***********"+str);
	}

	@MyAnnotation(name = "sdfsdf")
	public void printOutAnno(String str) {
		System.out.println("*************serviceTest anno printOut***********"+str);
	}

	public void printParam(ParamTest paramTest,Integer a){
		System.out.println(String.format("参数1为："+JSON.toJSONString(paramTest)+",参数2为："+a));
	}

}
