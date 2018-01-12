package cn.zju.visualization.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.zju.visualization.pojo.Patent;
import zn.zju.visualization.vo.PatentVo;

public interface PatentService {
	
	public Patent selectPatentById(Integer id);
	
	public List<PatentVo> findPublicityDateAndNumber();
	
	public Map<String, ArrayList<Integer>> findPublicityCodeAndNumber();
	
	public Map<String, Object> getAllPatenterNum(Integer[] months,List<String> query2015);
	
	public List<Patent> getInventManList(String query);
	
	public List<String> getInventNumByQuery(List<String> querys);
	
}
