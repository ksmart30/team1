package com.cafe24.ksmart30.team01.cooperation.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.ksmart30.team01.cooperation.service.ProjectCooperationManageService;
import com.cafe24.ksmart30.team01.cooperation.vo.CooperationSearchRequestVo;

@RestController
public class ProjectCooperationManageRestController {
	//비동기 방식 구현시 post 로 구분 해볼까?
	@Autowired ProjectCooperationManageService projectCooperationManageService;
	//4.1.1 용도별 분석현황 post
	@PostMapping("/project/cooperation/search")
	public List<Map<String,Object>> projectCooperationSearch(CooperationSearchRequestVo vo) {
		System.out.print("용역계약서 검색 ProjectCooperationManageRestController 실행");
		System.out.print("cooperationSearch 담긴값 : "+vo);
		List<Map<String,Object>> re = projectCooperationManageService.cooperationListSearch(vo);
		System.out.print("re 담긴값 : "+re);
		return re;	
	}
	

	
}
