package com.cafe24.ksmart30.team01.cooperation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectCooperationManageController {
	//동기식 view 단은 get 방식을 기본으로 해볼까?
	
	//3.1.1 외주계약서 입력 화면
	@GetMapping("project/cooperation/in")
	public String projectLastSearch() {		
		return "/project/cooperation/in";		
	}
	
	//3.1.2 입력된 외주계약서 검색
	@GetMapping("/project/cooperation/search")
	public String projectCooperationList() {		
		return "project/cooperation/search";
	}
		
	//3.2.1 용도별 분석현황
	@GetMapping("/project/cooperation/dragon_hyunhwang")
	public String projectCooperationDragonHyunhwang() {		
		return "project/cooperation/dragon_hyunhwang";		
	}
	
	//3.2.2 프로젝트별 분석현황
	@GetMapping("/project/cooperation/pjt_hyunhwang")
	public String projectCooperationPjtHyunhwang() {		
		return "project/cooperation/pjt_hyunhwang";		
	}
	
	

	
}
