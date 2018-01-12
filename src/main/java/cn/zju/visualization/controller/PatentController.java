package cn.zju.visualization.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zju.visualization.service.PatentService;

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
	
	@RequestMapping("/test")
	@ResponseBody
	public Object getPublicityDateAndNumber(HttpServletRequest request) {
		return patentService.findPublicityCodeAndNumber();
//		return patentService.findPublicityDateAndNumber();
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
