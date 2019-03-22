package com.cafe24.ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectManageController {
	//3.1.1 승인된 승인 사업수행 결정서 검색 List
	@GetMapping("/project/manage/search")
	public String projectManageSearch() {
		return "project/manage/search";
	}
	//3.1.1 승인된 승인 사업수행 결정서 검색 List
	@PostMapping("/project/manage/search")
	public String projectManageSearch(Model model) {
		return "project/manage/search";
	}
	
	//3.1.1 용역계약서 상세
	@GetMapping("/project/manage/sangse")
	public String projectManageSangse() {
		return "project/manage/sangse";
	}
	
	//3.1.1 용역계약서 발주처 입력 화면
	@GetMapping("/project/manage/owner_in")
	public String projectManageOwnerIn() {
		return "project/manage/owner_in";
	}
	//3.1.1 용역계약서 발주처 입력 처리
	@PostMapping("/project/manage/owner_in")
	public String projectManageOwnerIn(Model model) {
		return "project/manage/owner_in";
	}
	
	//3.1.1 용역계약서 발주처 삭제 처리
	@GetMapping("/project/manage/owner_del")
	public String projectManageOwnerDel() {
		return "project/manage/owner_del";
	}
	
	//3.1.1 용역계약서 기성단계 입력 화면
	@GetMapping("/project/manage/giseong_in")
	public String projectManageGiseongIn() {
		return "project/manage/giseong_in";
	}
	//3.1.1 용역계약서 기성단계 입력 처리
	@PostMapping("/project/manage/giseong_in")
	public String projectManageGiseongIn(Model model) {
		return "project/manage/giseong/in";
	}
	
	//3.1.1 용역계약서 기성단계 삭제 처리
	@GetMapping("/project/manage/giseong_del")
	public String projectManageGiseongDel() {
		return "project/manage/giseong/del";
	}
	
	//3.1.1 용역계약서 세부사항 입력 화면
	@GetMapping("/project/manage/sebu_in")
	public String projectManageSebuIn() {
		return "project/manage/sebu_in";
	}
	//3.1.1 용역계약서 세부사항 입력 처리
	@PostMapping("/project/manage/sebu_in")
	public String projectManageSebuIn(Model model) {
		return "project/manage/sebu_in";
	}
	
	//3.1.1 승인된 승인 사업수행 결정서 검색 List
	@GetMapping("/project/manage/change/search")
	public String projectManageChangeSearch() {
		return "project/manage/change/search";
	}
	//3.1.1 승인된 승인 사업수행 결정서 검색 List
	@PostMapping("/project/manage/change/search")
	public String projectManageChangeSearch(Model model) {
		return "project/manage/change/search";
	}
	
	//3.1.2 승인된 승인 사업수행 결정서 계약서 변경 현황 list
	@GetMapping("/project/manage/change/contract_list")
	public String projectManageChangeContractList() {
		return "project/manage/change/contract_list";
	}
	
	//3.1.2 용역계약서 변경 입력 화면
	@GetMapping("/project/manage/change/in")
	public String projectManageChangeIn() {
		return "project/manage/change/in";
	}
	//3.1.2 용역계약서 변경 입력 처리
	@PostMapping("/project/manage/change/in")
	public String projectManageChangeIn(Model model) {
		return "project/manage/change/in";
	}

	//3.1.2 용역계약서 발주처 변경 입력 처리
	@PostMapping("/project/manage/change/owner_in")
	public String projectManageChangeOwnerIn(Model model) {
		return "project/manage/change/owner_in";
	}
	
	//3.1.2 용역계약서 발주처 변경 삭제 처리
	@GetMapping("/project/manage/change/owner_del")
	public String projectManageChangeOwnerDel() {
		return "project/manage/change/owner_del";
	}
	
	//3.1.2 용역계약서 기성단계 변경 입력 처리
	@PostMapping("/project/manage/change/giseong_in")
	public String projectManageChangeGiseongIn(Model model) {
		return "project/manage/change/giseong_in";
	}
	
	//3.1.2 용역계약서 기성단계 변경 삭제 처리
	@GetMapping("/project/manage/change/giseong_del")
	public String projectManageChangeGiseongDel() {
		return "project/manage/change/giseong_del";
	}
	
	//3.1.2 용역계약서 변경 입력 수정 화면
	@GetMapping("/project/manage/change/up")
	public String projectManageChangeUp() {
		return "project/manage/change/up";
	}
	//3.1.2 용역계약서 변경 입력 수정 처리
	@PostMapping("/project/manage/change/up")
	public String projectManageChangeUp(Model model) {
		return "project/manage/change/up";
	}
	
	//3.1.2 용역계약서 발주처 변경 수정 화면
	@GetMapping("/project/manage/change/owner_up")
	public String projectManageChangeOwnerUp() {
		return "project/manage/change/owner_up";
	}
	//3.1.2 용역계약서 발주처 변경 수정 처리
	@PostMapping("/project/manage/change/owner_up")
	public String projectManageChangeOwnerUp(Model model) {
		return "project/manage/change/owner_up";
	}
	
	//3.1.2 용역계약서 기성단계 변경 수정 화면
	@GetMapping("/project/manage/change/giseong_up")
	public String projectManageChangeGiseongUp() {
		return "project/manage/change/giseong_up";
	}
	//3.1.2 용역계약서 기성단계 변경 수정 처리
	@PostMapping("/project/manage/change/giseong_up")
	public String projectManageChangeGiseongUp(Model model) {
		return "project/manage/change/giseong_up";
	}
	
	//3.1.3 변경된 용역계약서 검색 List
	@GetMapping("/project/manage/change/list")
	public String projectManageChangeList() {
		return "project/manage/change/list";
	}
	//3.1.3 변경된 용역계약서 검색 List
	@PostMapping("/project/manage/change/list")
	public String projectManageChangeList(Model model) {
		return "project/manage/change/list";
	}
	
	//3.1.3 변경된 용역계약서 변경 현황 List
	@GetMapping("/project/manage/change/hyunhwang_list")
	public String projectManageChangeHyunhwangList() {
		return "project/manage/change/hyunhwang_list";
	}
	
	//3.1.3 변경된 용역계약서 변경 상세
	@GetMapping("/project/manage/change/hyunhwang_sangse")
	public String projectManageChangeHyunhwangSangse() {
		return "project/manage/change/hyunhwang_sangse";
	}
	
	//3.1.4 용역계약서 검색
	@GetMapping("/project/manage/list")
	public String projectManageList() {
		return "project/manage/list";
	}
	//3.1.4 용역계약서 검색
	@PostMapping("/project/manage/list")
	public String projectManageList(Model model) {
		return "project/manage/list";
	}
	
	//3.1.5 부서별 용역계약서 검색
	@GetMapping("/project/manage/depart_list")
	public String projectManageDepart_list() {
		return "project/manage/depart_list";
	}
	//3.1.5 부서별 용역계약서 검색
	@PostMapping("/project/manage/depart_list")
	public String projectManageDepart_list(Model model) {
		return "project/manage/depart_list";
	}
	
	//3.1.6 용역계약서 현황
	@GetMapping("/project/manage/hyunhwang")
	public String projectManageHyunhwang() {
		return "project/manage/hyunhwang";
	}
	//3.1.6 용역계약서 현황
	@PostMapping("/project/manage/hyunhwang")
	public String projectManageHyunhwang(Model model) {
		return "project/manage/hyunhwang";
	}
}
