package cn.zju.visualization.mapper;

import java.util.List;

import com.github.abel533.mapper.Mapper;

import zn.zju.visualization.vo.PatentVo;

public interface PatentVoMapper extends Mapper<PatentVo> {
	public List<PatentVo> findNumberByDay();
	
	public List<PatentVo> findClassifyCodesAndCnount();
}
