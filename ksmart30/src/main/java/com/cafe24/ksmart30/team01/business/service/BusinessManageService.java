package com.cafe24.ksmart30.team01.business.service;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.ksmart30.team01.business.mapper.BusinessManageMapper;
import com.cafe24.ksmart30.team01.business.vo.BusinessMarketVO;

@Service
public class BusinessManageService {
	@Autowired
	BusinessManageMapper businessManageMapper;
	
	public List<Map<String,Object>> businessManageSelect(BusinessMarketVO vo){
		return businessManageMapper.getBusinessManageList(vo);
		
	}

}
