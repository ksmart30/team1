package ksmart30.team01.business.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team01.business.domain.BusinessMarket;
import ksmart30.team01.business.service.BusinessManageService;

@RestController
public class BusinessManageRestController {
	@Autowired
	BusinessManageService businessManageService;
	
	//사업성검토 List
	@PostMapping("/business/businessManageListView")
	public List<Map<String,Object>> businessManageListView(BusinessMarket vo) {
		System.out.print("사업수행결정서list 검색 BusinessManageRestController 실행");
		System.out.print("BusinessMarket 담긴값 : "+vo);
		List<Map<String,Object>> re = businessManageService.businessManageSelect(vo);
		
		return re;
	}
	
	
}

