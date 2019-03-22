package com.cafe24.ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectYesanController {
	
	//3.2.1 승인된 용역계약서 검색 List
	@GetMapping("/project/manage/seungin_search")
	public String projectManageSeunginSearch() {
		return "project/manage/seungin_search";
	}
	
	//3.2.1 승인된 용역계약서 검색 List
	@PostMapping("/project/manage/seungin_search")
	public String projectManageSeunginSearch(Model model) {
		return "project/manage/seungin_search";
	}	
		
	//3.2.1 승인된 용역계약서 상세
	@GetMapping("/project/yesan/sangse")	
	public String projectYesanSangse() {
		return 	"project/yesan/sangse";
	}
	
	//3.2.1 승인된 용역계약서 일정계획 입력(수정) 화면
	@GetMapping("/project/yesan/sangse/schedule_up")
	public String projectYesanSangseScheduleUp() {
		return "project/yesan/sangse/schedule_up";
	}
	
	//3.2.1 승인된 용역계약서 일정계획 입력(수정) 처리
	@PostMapping("/project/yesan/sangse/schedule_up")
	public String projectYesanSangseScheduleUp(Model model) {
		return "project/yesan/sangse/schedule_up";
	}
	
	//3.2.1 승인된 용역계약서 일정계획 삭제 처리
	@GetMapping("/project/yesan/sangse/schedule_del")
	public String projectYesanSangseScheduleDel() {
		return "project/yesan/sangse/schedule_del";
	}

	//3.2.1 승인된 용역계약서 M/H 입력(수정) 화면
	@GetMapping("/project/yesan/sangse/mh_up")
	public String projectYesanSangseMhUp() {
		return "project/yesan/sangse/mh_up";
	}
	
	//3.2.1 승인된 용역계약서 M/H 입력(수정) 처리
	@PostMapping("/project/yesan/sangse/mh_up")
	public String projectYesanSangseMhUp(Model model) {
		return "project/yesan/sangse/mh_up";
	}
	
	//3.2.1 승인된 용역계약서 제조경비1 입력(수정) 화면
	@GetMapping("/project/yesan/sangse/jejo_one_up")
	public String projectYesanSangseJejoOneUp() {
		return "project/yesan/sangse/jejo_one_up";
	}
	
	//3.2.1 승인된 용역계약서 제조경비1 입력(수정) 처리
	@PostMapping("project/yesan/sangse/jejo_one_up") 
	public String projectYesanSangseJejoOneUp(Model model) {
		return "project/yesan/sangse/jejo_one_up";
	}
	
	//3.2.1 승인된 용역계약서 제조경비2 입력 화면
	@GetMapping("/project/yesan/sangse/jejo_two_in")
	public String projectYesanSangseJejoTwoIn() {
		return "project/yesan/sangse/jejo_two_in";
	}
	
	//3.2.1 승인된 용역계약서 제조경비2 입력 처리
	@PostMapping("/project/yesan/sangse/jejo_two_in")
	public String projectYesanSangseJejoTwoIn(Model model) {
		return "project/yesan/sangse/jejo_two_in";
	}
	
	//3.2.1 승인된 용역계약서 제조경비2 수정 화면
	@GetMapping("/project/yesan/sangse/jejo_two_up")
	public String projectYesanSangseJejoTwoUp() {
		return "project/yesan/sangse/jejo_two_up";
	}
	
	//3.2.1 승인된 용역계약서 제조경비2 수정 처리
	@PostMapping("/project/yesan/sangse/jejo_two_up")
	public String projectYesanSangseJejoTwoUp(Model model) {
		return "project/yesan/sangse/jejo_two_up";
	}
	
	//3.2.1 승인된 용역계약서 제조경비2 삭제 처리
	@GetMapping("/project/yesan/sangse/jejo_two_del")
	public String projectYesanSangseJejoTwoDel() {
		return "project/yesan/sangse/jejo_two_del";
	}
	
	//3.2.2 예산 입력한 용역계약서 검색 list
	@GetMapping("/project/yesan/search")
	public String projectYesanSearch() {
		return "project/yesan/search";
	}
	
	//3.2.2 예산 입력한 용역계약서 검색 list
	@PostMapping("/project/yesan/search")
	public String projectYesanSearch(Model model) {
		return "project/yesan/search";
	}
	
	//3.2.2 예산 입력한 용역계약서 승인 처리
	@PostMapping("/project/yesan/seungin")
	public String projectYesanSeungin() {
		return "project/yesan/seungin";
	}
	
	//3.2.3 예산 승인된 용역계약서 출력
	@GetMapping("/project/yesan/output")
	public String projectYesanOutput() {
		return "project/yesan/output";
	}
	
	//3.2.3 예산 승인된 용역계약서 출력
	@PostMapping("/project/yesan/output")
	public String projectYesanOutput(Model model) {
		return "project/yesan/output";
	}
	
	//3.2.4 예산 승인된 용역계약서 검색
	@GetMapping("/project/yesan/list")
	public String projectYesanList() {
		return "project/yesan/list";
	}
	
	//3.2.4 예산 승인된 용역계약서 검색
	@PostMapping("/project/yesan/list")
	public String projectYesanList(Model model) {
		return "project/yesan/list";
	}
	
	
}
