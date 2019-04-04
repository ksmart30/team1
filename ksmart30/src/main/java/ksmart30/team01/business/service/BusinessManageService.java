package ksmart30.team01.business.service;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.business.domain.BusinessMarket;
import ksmart30.team01.business.mapper.BusinessManageMapper;

@Service
public class BusinessManageService {
	@Autowired
	BusinessManageMapper businessManageMapper;
	
	public List<Map<String,Object>> businessManageSelect(BusinessMarket vo){
		return businessManageMapper.getBusinessManageList(vo);
		
	}

}
