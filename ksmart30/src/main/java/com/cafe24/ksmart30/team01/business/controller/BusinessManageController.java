package com.cafe24.ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BusinessManageController {
	
	//2.1.1 사업수행 결정서 검색 List
	@GetMapping("/business/manage/search")
	public String businessManageSearch() {
		return "business/manage/search";
	}

	//2.1.1 사업수행 결정서 검색 List
	@PostMapping("/business/manage/search")
	public String businessManageSearch(Model model) {
		return "business/manage/search";
	}
	
	//2.1.1 사업수행 결정서 입력 화면
	@GetMapping("/business/manage/in")
	public String businessManageIn() {
		return "business/manage/in";
	}
	
	//2.1.1 사업수행 결정서 입력 처리
	@PostMapping("/business/manage/in")
	public String businessManageIn(Model model) {
		return "business/manage/in";
	}
	
	//2.1.1 사업수행 결정서 상세(수정) 화면
	@GetMapping("/business/manage/up")
	public String businessManageUp() {
		return "business/manage/up";
	}
	
	//2.1.1 사업수행 결정서 수정 처리
	@PostMapping("/business/manage/up")
	public String businessManageUp(Model model) {
		return "business/manage/up";
	}
	
	//2.1.1 사업수행 결정서 삭제
	@GetMapping("/business/manage/del")
	public String businessManageDel() {
		return "business/manage/del";
	}
	
	//2.1.2 사업수행 결정서 승인 검색 List
	@GetMapping("/business/manage/seungin_search")
	public String businessManageSeunginSearch() {
		return "business/manage/seungin_search";
	}
	
	//2.1.2 사업수행 결정서 승인 검색 List
	@PostMapping("/business/manage/seungin_search")
	public String businessManageSeunginSearch(Model model) {
		return "business/manage/seungin_search";
	}
	
	//2.1.2 사업수행 결정서 승인 화면
	@GetMapping("/business/manage/seungin")
	public String businessManageSeungin() {
		return "business/manage/seungin";
	}
	
	//2.1.2 사업수행 결정서 승인 처리
	@PostMapping("/business/manage/seungin")
	public String businessManageSeungin(Model model) {
		return "business/manage/seungin";
	}
	
	//2.1.3 사업성검토 진행 일정
	@GetMapping("/business/manage/schedule_list")
	public String businessManageScheduleList() {
		return "business/manage/schedule_list";
	}
	
	//2.1.3 사업성검토 진행 일정
	@PostMapping("/business/manage/schedule_list")
	public String businessManageScheduleList(Model model) {
		return "business/manage/schedule_list";
	}
	
	//2.1.4 사업성검토 List
	@GetMapping("/business/manage/list")
	public String businessManageList() {
		return "business/manage/list";
	}
	
	//2.1.4 사업성검토 List
	@PostMapping("/business/manage/list")
	public String businessManageList(Model model) {
		return "business/manage/list";
	}
	
	
}

