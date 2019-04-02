package com.cafe24.ksmart30.team01.cooperation.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.ksmart30.team01.cooperation.Mapper.ProjectCooperationManageMapper;
import com.cafe24.ksmart30.team01.cooperation.vo.CooperationSearchRequestVo;

@Service
public class ProjectCooperationManageService {
	@Autowired ProjectCooperationManageMapper projectCooperationManageMapper;
	
	public List<Map<String,Object>> cooperationListSearch(CooperationSearchRequestVo vo){
		return projectCooperationManageMapper.cooperationList(vo);
		
	}
}
