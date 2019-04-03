package com.cafe24.ksmart30.team01.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.ksmart30.team01.project.service.ProjectYesanService;

@RestController
public class ProjectYesanRestController {
	@Autowired
	private ProjectYesanService projectYesanService;
	
	//2.2.1 승인된 용역계약서 입력
	@PostMapping("/project/yesan/yesanIn")
	public List<Map<String, Object>> projectYesanIn() {	
		System.out.println("프로젝트예산입력을 위한 검색 화면 요청 RestController post");
		List<Map<String,Object>> resultList = projectYesanService.search();		
		return resultList;
	}	
		
	//2.2.1 승인된 용역계약서 상세
	@GetMapping("/project/yesan/sangse")	
	public String projectYesanSangse() {
		return 	"project/yesan/sangse";
	}
	
	//2.2.1 승인된 용역계약서 일정계획 입력(수정) 처리
	@PostMapping("/project/yesan/sangse/schedule_up")
	public String projectYesanSangseScheduleUp(Model model) {
		return "project/yesan/sangse/schedule_up";
	}
	
	//2.2.1 승인된 용역계약서 일정계획 삭제 처리
	@PostMapping("/project/yesan/sangse/schedule_del")
	public String projectYesanSangseScheduleDel(Model model) {
		return "project/yesan/sangse/schedule_del";
	}
	
	//2.2.1 승인된 용역계약서 M/H 입력(수정) 처리
	@PostMapping("/project/yesan/sangse/mh_up")
	public String projectYesanSangseMhUp(Model model) {
		return "project/yesan/sangse/mh_up";
	}
	
	//2.2.1 승인된 용역계약서 제조경비1 입력(수정) 처리
	@PostMapping("project/yesan/sangse/jejo_one_up") 
	public String projectYesanSangseJejoOneUp(Model model) {
		return "project/yesan/sangse/jejo_one_up";
	}
	
	//2.2.1 승인된 용역계약서 제조경비2 입력 처리
	@PostMapping("/project/yesan/sangse/jejo_two_in")
	public String projectYesanSangseJejoTwoIn(Model model) {
		return "project/yesan/sangse/jejo_two_in";
	}
	
	//2.2.1 승인된 용역계약서 제조경비2 수정 화면
	@GetMapping("/project/yesan/sangse/jejo_two_up")
	public String projectYesanSangseJejoTwoUp() {
		return "project/yesan/sangse/jejo_two_up";
	}
	
	//2.2.1 승인된 용역계약서 제조경비2 수정 처리
	@PostMapping("/project/yesan/sangse/jejo_two_up")
	public String projectYesanSangseJejoTwoUp(Model model) {
		return "project/yesan/sangse/jejo_two_up";
	}
	
	//2.2.1 승인된 용역계약서 제조경비2 삭제 처리
	@GetMapping("/project/yesan/sangse/jejo_two_del")
	public String projectYesanSangseJejoTwoDel(Model model) {
		return "project/yesan/sangse/jejo_two_del";
	}	

	//2.2.3 예산 승인된 용역계약서 출력
	@PostMapping("/project/yesan/output")
	public String projectYesanOutput(Model model) {
		return "project/yesan/output";
	}	

	//2.2.4 예산 입력한 용역계약서 검색 list
	@PostMapping("/project/yesan/search")
	public String projectYesanSearch(Model model) {
		return "project/yesan/search";
	}

	//2.2.5 예산 승인된 용역계약서 검색
	@PostMapping("/project/yesan/list")
	public String projectYesanList(Model model) {
		return "project/yesan/list";
	}

	
}
