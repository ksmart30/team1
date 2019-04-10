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

	// 1.1.3 사업수행 승인현황
	public List<Map<String, Object>> businessManageSelect(BusinessMarket vo) {
		return businessManageMapper.getBusinessManageList(vo);

	}

	// 1.1.1사업수행결정서 프로젝트 리스트 좌측
	public List<Map<String, Object>> businessManageViewSelect(BusinessMarket vo) {
		return businessManageMapper.getBusinessManageViewList(vo);

	}

	// 1.1.1사업수행결정서(승인)프로젝트목록 클릭시 우측에 검색
	public Map<String, Object> businessManageView(BusinessMarket vo) {
		return businessManageMapper.getBusinessManageView(vo);
	}

}
