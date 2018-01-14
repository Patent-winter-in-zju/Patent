package cn.zju.visualization.service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;

import cn.zju.visualization.mapper.PatentApplyMapper;
import cn.zju.visualization.mapper.PatentMapper;
import cn.zju.visualization.mapper.PatentTypeMapper;
import cn.zju.visualization.mapper.PatentVoMapper;
import cn.zju.visualization.pojo.Patent;
import zn.zju.visualization.vo.PatentApply;
import zn.zju.visualization.vo.PatentType;
import zn.zju.visualization.vo.PatentVo;

@Service
public class PatentTypeServiceImpl implements PatentTypeService {

	@Autowired
	private PatentMapper patentMapper;
	
	@Autowired
	private PatentTypeMapper patentTypeMapper;

	@Override
	public Map<String, Integer> findTypeAndNumber() {
		List<PatentType> rest = patentTypeMapper.findTypeAndCount();
		Map<String, Integer> result = new HashMap<String, Integer>();
		Integer count = 0;
		for(PatentType patentType : rest) {
			String typeName=patentType.getType();
			count = patentType.getCount();
			result.put(typeName, count);
		}
		return result;
	}

	
	
	
}
