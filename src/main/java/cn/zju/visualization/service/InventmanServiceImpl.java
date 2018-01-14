/**  
 * Project Name:Patent  
 * File Name:InventmanServiceImpl.java  
 * Package Name:cn.zju.visualization.service  
 * Date:2018年1月13日下午3:45:33  
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package cn.zju.visualization.service;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zju.visualization.mapper.InventmanMapper;
import cn.zju.visualization.pojo.Inventman;

/**  
 * ClassName:InventmanServiceImpl <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年1月13日 下午3:45:33 <br/>  
 * @author   john-lin  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
@Service
public class InventmanServiceImpl implements InventmanService {
	
	@Autowired
	private InventmanMapper inventmanMapper;

	@Override
	public Map<String, Object> getAllPatenterNum() {
		List<Inventman> InventmanList = inventmanMapper.selectByExample(null);
		Map<String, Object> result = new LinkedHashMap<String, Object>(); 
		for(Inventman inventman :InventmanList) {
			List<String> list = new LinkedList<String>();
			String[] strArr = inventman.getNum().split(",");
			for(String temp:strArr) {
				list.add(temp);
			}
			result.put(inventman.getYear(), list);
		}
		return result;
	}
	
	

}
  
