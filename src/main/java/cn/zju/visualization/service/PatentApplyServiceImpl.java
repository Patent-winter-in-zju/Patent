package cn.zju.visualization.service;

import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;

import cn.zju.visualization.mapper.PatentApplyMapper;
import cn.zju.visualization.mapper.PatentMapper;
import cn.zju.visualization.mapper.PatentVoMapper;
import cn.zju.visualization.pojo.Patent;
import zn.zju.visualization.vo.PatentApply;
import zn.zju.visualization.vo.PatentType;
import zn.zju.visualization.vo.PatentVo;

@Service
public class PatentApplyServiceImpl implements PatentApplyService {

	@Autowired
	private PatentMapper patentMapper;
	
	@Autowired
	private PatentApplyMapper patentApplyMapper;

	/**
	 * 根据年份和月份获取专利数
	 * @param date
	 * @return
	 */
	@Override
	public Map<String, Integer> findApplyAndNumber() {
		LinkedList<PatentApply> rest = patentApplyMapper.findNumberByDate();
		Map<String, Integer> result = new HashMap<String, Integer>();
		Integer count = 0;
		for(PatentApply patentApply : rest) {
			String date=patentApply.getPublicityDate();
			count = patentApply.getCount();
			result.put(date, count);
		}
		return result;
	}
	
}
