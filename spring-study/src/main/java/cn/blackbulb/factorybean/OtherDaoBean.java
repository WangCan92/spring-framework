package cn.blackbulb.factorybean;

/**
 * @author wangcan
 */
public class OtherDaoBean {
	private String msg1;
	private String msg2;
	private String msg3;

	public void printOtherDaoInfo() {
		System.out.println(msg1+":"+msg2+":"+msg3);
	}

	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}

	public void setMsg3(String msg3) {
		this.msg3 = msg3;
	}

}
