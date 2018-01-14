package cn.zju.visualization.service;

import java.util.List;
import java.util.Map;

import cn.zju.visualization.pojo.Patent;
import zn.zju.visualization.vo.PatentApply;

public interface PatentTypeService {
	
	public Map<String, Integer> findTypeAndNumber();
}
