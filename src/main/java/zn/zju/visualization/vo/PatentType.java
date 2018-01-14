package zn.zju.visualization.vo;

import java.io.Serializable;

public class PatentType implements Serializable {
	private Integer count;
	private String type;

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "PatentType [count=" + count + ", type=" + type + "]";
	}
	
	
}
