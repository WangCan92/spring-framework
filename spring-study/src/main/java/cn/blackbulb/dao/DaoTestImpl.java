package cn.blackbulb.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author wangcan
 */
@Repository
@Primary
@Scope("prototype")
//@Profile("dev")
public class DaoTestImpl implements DaoTest, InitializingBean, DisposableBean {

	public DaoTestImpl() {
		System.out.println("dao construct…………………………");
	}

	@Override
	public void daoPrint() {
		System.out.println("dao print ………………");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("dao init after ………………");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("dao destroy…………………………");
	}
}
