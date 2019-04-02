package com.cafe24.ksmart30.team01.cooperation.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.ksmart30.team01.cooperation.vo.CooperationSearchRequestVo;

@Mapper
public interface ProjectCooperationManageMapper {
	List<Map<String,Object>> cooperationList(CooperationSearchRequestVo vo);
}
