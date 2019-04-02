package com.cafe24.ksmart30.team01.business.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusinessManageMapper {
	
	List<Map<String,Object>> businessManageList();

}
