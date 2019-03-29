package com.cafe24.ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectYesanController {
	
	//2.2.1 승인된 용역계약서 입력
	@GetMapping("/project/yesan/in")
	public String projectYesanIn() {
		return "project/yesan/in";
	}
	
	//2.2.1.1 승인된 용역계약서 일정계획 입력(수정) 화면
	@GetMapping("/project/yesan/sangse/schedule_up")
	public String projectYesanSangseScheduleUp() {
		return "project/yesan/sangse/schedule_up";
	}
	
	//2.2.1.2 승인된 용역계약서 M/H 입력(수정) 화면
	@GetMapping("/project/yesan/sangse/mh_up")
	public String projectYesanSangseMhUp() {
		return "project/yesan/sangse/mh_up";
	}	
	
	//2.2.1.3 승인된 용역계약서 제조경비1 입력(수정) 화면
	@GetMapping("/project/yesan/sangse/jejo_one_up")
	public String projectYesanSangseJejoOneUp() {
		return "project/yesan/sangse/jejo_one_up";
	}	

	//2.2.1.4 승인된 용역계약서 제조경비2 입력 화면
	@GetMapping("/project/yesan/sangse/jejo_two_in")
	public String projectYesanSangseJejoTwoIn() {
		return "project/yesan/sangse/jejo_two_in";
	}		
	
	//2.2.2 프로젝트예산 승인
	@GetMapping("/project/yesan/seungin")
	public String projectYesanSeungin() {
		return "project/yesan/seungin";
	}
	
	//2.2.3 프로젝트예산 출력
	@GetMapping("/project/yesan/output")
	public String projectYesanOutput() {
		return "project/yesan/output";
	}
	
	//2.2.4 프로젝트예산 검색
	@GetMapping("/project/yesan/search")
	public String projectYesanSearch() {
		return "project/yesan/search";
	}
	
	//2.2.5 계약프로젝트List
	@GetMapping("/project/yesan/list")
	public String projectYesanList() {
		return "project/yesan/list";
	}	
	
	
}
