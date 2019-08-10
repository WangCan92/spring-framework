package cn.blackbulb.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author wangcan
 * 继承FactoryBean的对象被Spring容器实例话后有两个对象，一个是这个类本身他的name是类名加一个&
 * 另一个类是getObject方法返回的对象，他的名字是这个类的名字不用加&
 * FactoryBean的作用是为了方便第三方类的配置
 */
public class TestDaoFactoryBean implements FactoryBean {
	private String msg;

	@Override
	public Object getObject() throws Exception {
		OtherDaoBean daoBean = new OtherDaoBean();
		String mesg[] = this.msg.split(",");
		daoBean.setMsg1(mesg[0]);
		daoBean.setMsg2(mesg[1]);
		daoBean.setMsg3(mesg[2]);
		return daoBean;
	}

	@Override
	public Class<?> getObjectType() {
		return OtherDaoBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
