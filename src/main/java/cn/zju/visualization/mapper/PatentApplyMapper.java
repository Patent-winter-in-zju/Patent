package cn.zju.visualization.mapper;

import java.util.LinkedList;
import java.util.List;

import com.github.abel533.mapper.Mapper;

import zn.zju.visualization.vo.PatentApply;
import zn.zju.visualization.vo.PatentVo;

public interface PatentApplyMapper extends Mapper<PatentApply> {
	public LinkedList<PatentApply> findNumberByDate();
}
