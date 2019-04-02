package com.cafe24.ksmart30.team01.business.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessManageRestController {
	

	//2.1.1 사업수행 결정서 검색 List
	@PostMapping("/business/manage/search")
	public String businessManageSearch(Model model) {
		return "business/manage/search";
	}


	//2.1.1 사업수행 결정서 입력 처리
	@PostMapping("/business/manage/in")
	public String businessManageIn(Model model) {
		return "business/manage/in";
	}



	//2.1.1 사업수행 결정서 수정 처리
	@PostMapping("/business/manage/up")
	public String businessManageUp(Model model) {
		return "business/manage/up";
	}


	//2.1.2 사업수행 결정서 승인 검색 List
	@PostMapping("/business/manage/seungin_search")
	public String businessManageSeunginSearch(Model model) {
		return "business/manage/seungin_search";
	}


	//사업수행 결정서 승인 처리
	@PostMapping("/business/manage/seungin")
	public String businessManageSeungin(Model model) {
		return "business/manage/seungin";
	}

	//사업성검토 List
	@PostMapping("/business/manage/list")
	public String businessManageList(Model model) {
		return "business/manage/list";
	}

	
}

