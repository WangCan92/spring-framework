package cn.blackbulb.advice;

/**
 * @author wangcan
 */
public class DivLogAdvice {
	public void divbefore(){
		System.out.println("div before..........");
	}

	public void divAfter(){
		System.out.println("div after..........");
	}

	public void divReturn(){
		System.out.println("div return...........");
	}
	public void divException(){
		System.out.println("div exception..........");
	}
}
