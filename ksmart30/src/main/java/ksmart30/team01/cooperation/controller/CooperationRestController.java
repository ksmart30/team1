/*
 * @file     ksmart30.team01.cooperation.controller.CooperationRestController.java
 * @brief    cooperation controller
 * @author   ksmart30 김동열
 */
package ksmart30.team01.cooperation.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team01.cooperation.domain.CooperationSearchRequest;
import ksmart30.team01.cooperation.service.CooperationService;

@RestController
public class CooperationRestController {
	//비동기 방식 구현시 post 로 구분 해볼까?
	@Autowired CooperationService cooperationService;
	
	@PostMapping("/project/cooperation/in_search")
	public List<Map<String,Object>> projectCooperationInSearch(){
		
		return null;
	}
	
	// 외주관리 - 외주계약서관리 - 외주계약서 검색 - 리스트 요청
	/* /project/cooperation/search url을 POST로 호출시 실행
	 * @param  POST CooperationSearchRequest 객체로 검색 조건 들을 받는다.(문자열)
	 * @brief    projectCooperationManageService객체의 cooperationListSearch 메서드 호출
	 * @return  List<Map<String,Object>> re - json방식
	 */	
	@PostMapping("/project/cooperation/search")
	public List<Map<String,Object>> projectCooperationSearch(CooperationSearchRequest vo) {
		System.out.print("용역계약서 검색 CooperationRestController 실행");
		System.out.print("cooperationSearch 담긴값 : "+vo);
		List<Map<String,Object>> re = cooperationService.cooperationSelect(vo);
		System.out.print("re 담긴값 : "+re);
		return re;	
	}
	

	
}
