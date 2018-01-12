package cn.zju.visualization.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zju.visualization.service.PatentApplyService;
import cn.zju.visualization.service.PatentService;

@Controller
@RequestMapping("/apply")
public class ApplyController {

	@Autowired
	private PatentApplyService patentApplyService;
	
	@RequestMapping("/test")
	@ResponseBody
	public Object getPatentNum(HttpServletRequest request) {
		return patentApplyService.findApplyAndNumber();
    }
	
	
	
}
