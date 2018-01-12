package cn.zju.visualization.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zju.visualization.service.PatentApplyService;
import cn.zju.visualization.service.PatentService;
import cn.zju.visualization.service.PatentTypeService;

@Controller
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private PatentTypeService patentTypeService;
	
	
	@RequestMapping("/test")
	@ResponseBody
	public Object getCountByType(HttpServletRequest request) {
		return patentTypeService.findTypeAndNumber();
    }
	
	
}
