package cn.blackbulb.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author wangcan
 */
//@Repository
//@Lazy
//@Profile("pro")
public class DaoTestImpl1 implements DaoTest, InitializingBean, DisposableBean {

	public DaoTestImpl1() {
		System.out.println("dao1 construct…………………………");
	}

	@Override
	public void daoPrint() {
		System.out.println("dao1 print ………………");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("dao1 init after ………………");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("dao1 destroy…………………………");
	}
}
