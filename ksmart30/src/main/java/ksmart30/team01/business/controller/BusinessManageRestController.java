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

	// 사업수행결정 승인 현황
	@PostMapping("/business/businessManageListView")
	public List<Map<String, Object>> businessManageListView(BusinessMarket vo) {
		System.out.println("사업수행결정 승인 현황 BusinessManageRestController 실행");
		System.out.println("BusinessMarket 담긴값 : " + vo);
		List<Map<String, Object>> re = businessManageService.businessManageSelect(vo);

		return re;
	}

	// 사업수행결정서(승인) 프로젝트 목록
	@PostMapping("/business/businessManageViewList")
	public List<Map<String, Object>> businessManageViewList(BusinessMarket vo) {
		System.out.println("사업수행결정서 프로젝트 목록BusinessManageRestController 실행");
		System.out.println("BusinessMarket 담긴값 : " + vo);
		List<Map<String, Object>> re = businessManageService.businessManageViewSelect(vo);

		return re;
	}

	// 사업수행결정서(승인)프로젝트목록 클릭시 우측에 검색
	@PostMapping("/business/businessManageView")
	public Map<String, Object> businessManageView(BusinessMarket vo) {
		System.out.println("사업수행결정서 프로젝트 목록BusinessManageRestController 실행");
		System.out.println("BusinessMarket 담긴값 : " + vo);
		Map<String,Object> re = businessManageService.businessManageView(vo);
		
		return re;
	}
}
