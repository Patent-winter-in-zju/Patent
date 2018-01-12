package cn.zju.visualization.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zju.visualization.service.PatentService;
import zn.zju.visualization.vo.PatentVo;

@Controller
@RequestMapping("/patent")
public class PatentController {

	@Autowired
	private PatentService patentService;
	
	@RequestMapping("/{id}")
	@ResponseBody
	public Object getBookById(@PathVariable int id, HttpServletRequest request) {
		return patentService.selectPatentById(id);
    }
	
	@RequestMapping("/getPublicityDateAndNumber")
	@ResponseBody
	public Object getPublicityDateAndNumber(HttpServletRequest request) {
		List<PatentVo> rest = patentService.findPublicityDateAndNumber();
		Map<String,List<Integer>> map = new HashMap<String, List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		for(PatentVo ele: rest) {
			list.add(ele.getCount());
		}
		map.put("number", list);
		return map;
	}
	
	@RequestMapping("/getPublicityCodeAndNumber")
	@ResponseBody
	public Object getPublicityCodeAndNumber(HttpServletRequest request) {
		Map<String,List<Integer>> map = new HashMap<String, List<Integer>>();
		List<Integer> type1List = new ArrayList<Integer>();
		List<Integer> type2List = new ArrayList<Integer>();
		Map<String, ArrayList<Integer>> rest = patentService.findPublicityCodeAndNumber();
		for(String key : rest.keySet()) {
			type1List.add(rest.get(key).get(0));
			type2List.add(rest.get(key).get(1));
		}
		map.put("发明专利", type1List);
		map.put("实用新型", type2List);
		return map;
	}
	
	@RequestMapping("/getInventManNum")
	@ResponseBody
	public Object getInventManNum(HttpServletRequest request) {
		Integer[] months = {2013,2014};
		List<String> query2015 = new LinkedList<>();
		for(int i=1;i<=6;i++) {
			query2015.add("2015.0"+i);
		}
		return patentService.getAllPatenterNum(months,query2015);
    }
	
}
