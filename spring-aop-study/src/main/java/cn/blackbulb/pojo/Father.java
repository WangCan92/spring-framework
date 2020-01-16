package cn.blackbulb.pojo;

/**
 * @author wangcan
 */
public abstract class Father extends GrandFater {
	public void fatherSay(){
		System.out.println("我是爸爸！");
	}
	public abstract void sonSay();
}
