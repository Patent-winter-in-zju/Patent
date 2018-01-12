package cn.zju.visualization.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;

import cn.zju.visualization.mapper.PatentMapper;
import cn.zju.visualization.mapper.PatentVoMapper;
import cn.zju.visualization.pojo.Patent;
import zn.zju.visualization.vo.PatentVo;

@Service
public class PatentServiceImpl implements PatentService {

	@Autowired
	private PatentMapper patentMapper;

	@Autowired
	private PatentVoMapper patentVoMapper;
	
	@Override
	public Patent selectPatentById(Integer id) {
		Patent patent = patentMapper.selectByPrimaryKey(id);
		return patent;
	}
	
	@Override
	public Map<String, Object> getAllPatenterNum(Integer[] months,List<String> query2015) {
		Map<String, Object> result = new LinkedHashMap<String, Object>();

		for(int i=0;i<months.length;i++) {
			List<String> list = new LinkedList<String>();
			List<String> querys = this.getMonthQuery(months[i]);
			list = this.getInventNumByQuery(querys);
			result.put(""+months[i], list);
		}
		List<String> list2015 = this.getInventNumByQuery(query2015);
		result.put(""+2015, list2015);
		return result;
	}
	@Override
	public  List<Patent> getInventManList(String query){
		Example example = new Example(Patent.class);
		example.createCriteria().andLike("publicityDate", query);
		return patentMapper.selectByExample(example);
	}
	
	private List<String> getMonthQuery(int month) {
		List<String> querys = new LinkedList<>();
		for(int i =1;i<=12;i++) {
			if(i<10) {
				querys.add(month+".0"+i);
			}else {
				querys.add(month+"."+i);
			}
		}
		return querys;
	}

	@Override
	public List<String> getInventNumByQuery(List<String> querys) {
		List<String> list = new LinkedList<>();
		//根据查询条件统计每月专利创造人数
		for(String query:querys) {
			int manNum = 0;
			Set<String> set = new HashSet<>();
			List<Patent> patents = this.getInventManList(query+"%");
			for( Patent patent : patents) {
				String inventManStr = patent.getInventeMan();
				String[] Arr = inventManStr.split(";");
				for(int j=0;j<Arr.length;j++) {
					if(!set.contains(Arr[j])) {
						set.add(Arr[j]);
						manNum++;
					}
				}
			}
			list.add(""+manNum);
		} 
		return list;
	}

	@Override
	public List<PatentVo> findPublicityDateAndNumber() {
		List<PatentVo> rest = patentVoMapper.findNumberByDay();
		return rest;
	}

	@Override
	public Map<String, ArrayList<Integer>> findPublicityCodeAndNumber() {
		List<PatentVo> rest = patentVoMapper.findClassifyCodesAndCnount();
		Map<String, ArrayList<Integer>> result = new HashMap<String, ArrayList<Integer>>();
		int count = 0;
		String type = null;
		Integer temp = null;
		for(PatentVo patentVo : rest) {
			List<String> codes = splitClassifyCode(patentVo.getClassifyCode());
			count = patentVo.getCount();
			type = patentVo.getType();
			for(String code : codes) {
				ArrayList<Integer> oldCount = result.get(code);
				if(oldCount == null) {
					oldCount = new ArrayList<Integer>();
					result.put(code, oldCount);
					oldCount.add(0);
					oldCount.add(0);
				}
				if(type.equals("发明专利")) {
					temp = oldCount.get(0);
					oldCount.set(0, temp + count);
				}
				else {
					temp = oldCount.get(1);
					oldCount.set(1, temp + count);
				}
			}
		}
		for(String key : result.keySet()) {
			System.out.println(key + "::" + result.get(key).get(0) + "::" + result.get(key).get(1));
		}
		System.out.println("__size " + result.size());
		return result;
	}
	
	private List<String> splitClassifyCode(String codes) {
		List<String> splits = new ArrayList<String>();
		int pos = 0;
		if (codes.contains(";")) {
			String[] split = codes.split(";");
			for(String ele : split) {
				pos = ele.indexOf("/");
				splits.add(ele.substring(0, 1));
			}
		} else {
			pos = codes.indexOf("/");
			splits.add(codes.substring(0, 1));
		}
		return splits;
	}

	
	

}
