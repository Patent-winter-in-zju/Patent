package cn.zju.visualization.mapper;

import java.util.List;

import com.github.abel533.mapper.Mapper;

import zn.zju.visualization.vo.PatentApply;
import zn.zju.visualization.vo.PatentType;
import zn.zju.visualization.vo.PatentVo;

public interface PatentTypeMapper extends Mapper<PatentApply> {
	public List<PatentType> findTypeAndCount();
}
