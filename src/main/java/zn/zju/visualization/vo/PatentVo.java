package zn.zju.visualization.vo;

import java.io.Serializable;

public class PatentVo implements Serializable {
	private String publicityDate;
	private Integer count;
	private String classifyCode;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClassifyCode() {
		return classifyCode;
	}

	public void setClassifyCode(String classifyCode) {
		this.classifyCode = classifyCode;
	}

	@Override
	public String toString() {
		return "PatentVo [publicityDate=" + publicityDate + ", count=" + count + "]";
	}

	public String getPublicityDate() {
		return publicityDate;
	}

	public void setPublicityDate(String publicityDate) {
		this.publicityDate = publicityDate;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
