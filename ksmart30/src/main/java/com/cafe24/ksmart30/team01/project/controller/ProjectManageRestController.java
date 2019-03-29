package com.cafe24.ksmart30.team01.project.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectManageRestController {
	//3.1.1 용역계약서 입력 처리
	@PostMapping("/project/manage/in")
	public String projectManageIn() {
		return "project/manage/in";
	}
	
	//3.1.1 용역계약서 발주처 입력 처리
	@PostMapping("/project/manage/owner_in")
	public String projectManageOwnerIn(Model model) {
		return "project/manage/owner_in";
	}

	//3.1.1 용역계약서 발주처 삭제 처리
	@PostMapping("/project/manage/owner_del")
	public String projectManageOwnerDel() {
		return "project/manage/owner_del";
	}
	
	//3.1.1 용역계약서 기성단계 입력 처리
	@PostMapping("/project/manage/giseong_in")
	public String projectManageGiseongIn(Model model) {
		return "project/manage/giseong/in";
	}
	
	//3.1.1 용역계약서 기성단계 삭제 처리
	@PostMapping("/project/manage/giseong_del")
	public String projectManageGiseongDel() {
		return "project/manage/giseong/del";
	}
	
	//3.1.1 용역계약서 세부사항 입력 처리
	@PostMapping("/project/manage/sebu_in")
	public String projectManageSebuIn(Model model) {
		return "project/manage/sebu_in";
	}
	
	//3.1.2 용역계약서 변경 입력 처리
	@PostMapping("/project/manage/change/in")
	public String projectManageChangeIn() {
		return "project/manage/change/in";
	}
	
	//3.1.2 용역계약서 발주처 변경 입력 처리
	@PostMapping("/project/manage/change/owner_in")
	public String projectManageChangeOwnerIn(Model model) {
		return "project/manage/change/owner_in";
	}
	
	//3.1.2 용역계약서 발주처 변경 수정 처리
	@PostMapping("/project/manage/change/owner_up")
	public String projectManageChangeOwnerUp(Model model) {
		return "project/manage/change/owner_up";
	}
	
	//3.1.2 용역계약서 발주처 변경 삭제 처리
	@PostMapping("/project/manage/change/owner_del")
	public String projectManageChangeOwnerDel() {
		return "project/manage/change/owner_del";
	}
	
	//3.1.2 용역계약서 기성단계 변경 입력 처리
	@PostMapping("/project/manage/change/giseong_in")
	public String projectManageChangeGiseongIn(Model model) {
		return "project/manage/change/giseong_in";
	}
	
	//3.1.2 용역계약서 기성단계 변경 수정 처리
	@PostMapping("/project/manage/change/giseong_up")
	public String projectManageChangeGiseongUp(Model model) {
		return "project/manage/change/giseong_up";
	}
	
	//3.1.2 용역계약서 기성단계 변경 삭제 처리
	@PostMapping("/project/manage/change/giseong_del")
	public String projectManageChangeGiseongDel() {
		return "project/manage/change/giseong_del";
	}
	
	//3.1.4 용역계약서 검색(부서)
	@PostMapping("/project/manage/depart_search")
	public String projectManageDepartSearch(Model model) {
		return "project/manage/depart_search";
	}
	
	//3.1.4 용역계약서 검색(발주처)
	@PostMapping("/project/manage/client_search")
	public String projectManageClientSearch(Model model) {
		return "project/manage/client_search";
	}
	
	//3.1.6 용역계약서 현황
	@PostMapping("/project/manage/hyunhwang")
	public String projectManageHyunhwang(Model model) {
		return "project/manage/hyunhwang";
	}
}
