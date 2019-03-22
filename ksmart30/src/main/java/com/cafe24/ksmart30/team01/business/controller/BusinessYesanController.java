package com.cafe24.ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BusinessYesanController {
	
	//2.2.1 승인된 사업수행 결정서 검색 List
	@GetMapping("/business/yesan/search")
	public String businessYesanSearch() {
		
		
		return "business/yesan/search";	
	}
	
	//2.2.1 승인된 사업수행 결정서 검색 List
	@PostMapping("/business/yesan/search")
	public String businessYesanSearch(Model model) {
		
		return "business/yesan/search";
	}
	
	//2.2.1 승인된 사업수행 결정서 예산 입력 화면만 보여주는 메서드
	@GetMapping("/business/yesan/in")
	public String businessYesanIn() {
		
		return "business/yesan/in";	
	}
	
	//2.2.1 승인된 사업수행 결정서 일정계획 수정 처리
	@PostMapping("business/yesan/in_schedule_up")
	public String businessYesanInScheduleUp() {
		
		return "business/yesan/in_schedule_up";
	}
	
	//2.2.1 승인된 사업수행 결정서 제조경비1 입력 처리
	@PostMapping("/business/yesan/in_jejo_one_in")
	public String businessYesanInJejoOneIn() {
		
		return "bbusiness/yesan/in_jejo_one_in";
	}
	
	//2.2.1 승인된 사업수행 결정서 제조경비2 입력 처리
	@PostMapping("/business/yesan/in_jejo_two_in")
	public String businessYesanInJejoTwoIn() {
		
		return "business/yesan/in_jejo_two_in";
	}
	
	//2.2.1 승인된 사업수행 결정서 예산 승인을 위한 List
	@GetMapping("/business/yesan/seungin_search")
	public String businessYesanSeunginSearch() {
		
		return "business/yesan/seungin_search";
	}
	
	//2.2.1 승인된 사업수행 결정서 예산 승인을 위한 List
	@PostMapping("/business/yesan/seungin_search")
	public String businessYesanSeunginSearch(Model model) {
		
		return "business/yesan/seungin_search";	
	}
	
	
	//2.2.2 승인된 사업수행 결정서 예산 승인
	@GetMapping("/business/yesan/seungin")
	public String businessYesanSeungin() {
		
		return "business/yesan/seungin";
	}
	
	//2.2.2 승인된 사업수행 결정서 예산 승인
	@PostMapping("/business/yesan/seungin")
	public String businessYesanSeungin(Model model) {
		
		return "business/yesan/seungin";
	}
	
	//2.2.3 승인된 승인 사업수행 결정서 예산 출력
	@GetMapping("/business/yesan/output")
	public String businessYesanOutput() {
		
		return "business/yesan/output";
	}
	
	//2.2.3 승인된 승인 사업수행 결정서 예산 출력
	@PostMapping("/business/yesan/output")
	public String businessYesanOutput(Model model) {
		
		return "business/yesan/output";
	}
	
	//2.2.4 승인된 승인 사업성검토 검색 List
	@GetMapping("/business/yesan/list")
	public String businessYesanList() {
		
		return "business/yesan/list";
	}

	//2.2.4 승인된 승인 사업성검토 검색 List
	@PostMapping("/business/yesan/list")
	public String businessYesanList(Model model) {
		
		return "business/yesan/list";
	}
}




