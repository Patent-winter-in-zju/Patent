package zn.zju.visualization.vo;

import java.io.Serializable;

public class PatentApply implements Serializable {
	private String publicityDate;
	private Integer count;


	@Override
	public String toString() {
		return "PatentApply [publicityDate=" + publicityDate + ", count=" + count + "]";
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
