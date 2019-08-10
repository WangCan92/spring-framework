package cn.blackbulb.pojo.bo;

import java.io.Serializable;

/**
 * @author wangcan
 */
public class BaseParam implements Serializable {
	private String sourceCode;
	private String userId;

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
