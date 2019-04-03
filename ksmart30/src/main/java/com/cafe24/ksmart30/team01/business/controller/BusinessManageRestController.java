package com.cafe24.ksmart30.team01.business.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.ksmart30.team01.business.service.BusinessManageService;
import com.cafe24.ksmart30.team01.business.vo.BusinessMarketVO;

@RestController
public class BusinessManageRestController {
	@Autowired
	BusinessManageService businessManageService;
	
	//사업성검토 List
	@PostMapping("/business/manage/list")
	public List<Map<String,Object>> businessManageList(BusinessMarketVO vo) {
		System.out.print("사업수행결정서list 검색 BusinessManageRestController 실행");
		System.out.print("BusinessMarketVO 담긴값 : "+vo);
		List<Map<String,Object>> re = businessManageService.businessManageSelect(vo);
		
		return re;
	}
	
	
}

