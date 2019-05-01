package ksmart30.team01.business.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

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
	
	// 거래처 검색 버튼
	@PostMapping("/custSearchListView1")
	public List<Map<String,String>> custSearchListView1(String cust){
		System.out.println("custSearch 호출");
		return businessManageService.CustCode(cust);
	}
	
	// 부서 검색 버튼
	@PostMapping("/deptSearchListView1")
	public List<Map<String,String>> deptSearchListView(String dept){
		System.out.println("deptSearch 호출");
		return businessManageService.DeptCode(dept);
	}
	
	// 사원 검색 버튼
	@PostMapping("/businessResultEmpList")
	public List<Map<String,String>> businessResultEmpList(@RequestBody Map<String,Object> searchMap){
		
		System.out.println("businessResultEmpList 호출");

		return businessManageService.ResultDeptList(searchMap);
	}
	//사업수행결정서 승인 저장 
	@PostMapping("/business/businessManageSeunginViewUpdate")
	public void businessManageSeunginViewUpdate(BusinessMarket vo) {
		System.out.println(vo.toString());
		System.out.println("businessManageSeunginViewUpdate 호출");
		businessManageService.businessManageSeunginViewUpdate(vo);
	}
	
	
	//사업수행결정서 저장
	@PostMapping("/business/businessManageViewInsert")
	public void businessManageViewInsert(BusinessMarket vo) {
		System.out.println(vo.toString());
		System.out.println("businessManageViewInsert 호출");
		businessManageService.businessManageViewInsert(vo);
	}
	
	@PostMapping("/business/businessManageViewDelete")
	public void businessManageViewDelete(BusinessMarket vo) {
		businessManageService.businessManageViewDelete(vo);
	}
}
