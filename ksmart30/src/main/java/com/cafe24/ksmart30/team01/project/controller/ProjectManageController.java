/*
 * @file	ProjectManageController.java
 * @brief   용역계약서 Controller
 * @author  ksmart30 YDE
 */
package com.cafe24.ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectManageController {
	//3.1.1 용역계약서 입력
	@GetMapping("/project/manage/in")
	public String projectManageIn() {
		return "project/manage/in";
	}
	
	//3.1.1 용역계약서 발주처 입력 화면
	@GetMapping("/project/manage/owner_in")
	public String projectManageOwnerIn() {
		return "project/manage/owner_in";
	}
	
	//3.1.1 용역계약서 기성단계 입력 화면
	@GetMapping("/project/manage/giseong_in")
	public String projectManageGiseongIn() {
		return "project/manage/giseong_in";
	}
	
	//3.1.2 용역계약서 변경 입력 화면
	@GetMapping("/project/manage/change/in")
	public String projectManageChangeIn() {
		return "project/manage/change/in";
	}

	//3.1.3 용역계약서 변경 조회
	@GetMapping("/project/manage/change/search")
	public String projectManageChange() {
		return "project/manage/change/search";
	}
	
	//3.1.4 용역계약서 검색(부서)
	@GetMapping("/project/manage/depart_search")
	public String projectManageDepartSearch() {
		return "project/manage/depart_search";
	}

	//3.1.5 용역계약서 검색(발주처)
	@GetMapping("/project/manage/client_search")
	public String projectManageClientSearch() {
		return "project/manage/client_search";
	}

	//3.1.6 용역계약서 현황
	@GetMapping("/project/manage/hyunhwang")
	public String projectManageHyunhwang() {
		return "project/manage/hyunhwang";
	}
}
