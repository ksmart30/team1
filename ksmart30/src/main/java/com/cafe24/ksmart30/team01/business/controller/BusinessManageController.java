package com.cafe24.ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BusinessManageController {
	

	//사업수행 결정서
	@GetMapping("/business/manage/in")
	public String businessManageIn() {
		return "business/manage/in";
	}

	//사업수행 결정서 승인
	@GetMapping("/business/manage/seungin")
	public String businessManageSeungin() {
		return "business/manage/seungin";
	}
	

	//사업성검토 List
	@GetMapping("/business/manage/list")
	public String businessManageList() {
		return "business/manage/list";
	}

	
}

