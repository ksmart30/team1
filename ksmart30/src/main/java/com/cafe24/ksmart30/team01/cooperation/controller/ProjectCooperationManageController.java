package com.cafe24.ksmart30.team01.cooperation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectCooperationManageController {
	
	//4.1.1 용도별 분석현황 get
	@GetMapping("/project/cooperation/dragon_hyunhwang")
	public String projectCooperationDragonHyunhwang() {		
		return "project/cooperation/dragon_hyunhwang";		
	}
	//4.1.1 용도별 분석현황 post
	@PostMapping("/project/cooperation/dragon_hyunhwang")
	public String projectCooperationDragonHyunhwang(Model model) {		
		return "redirect:/project/cooperation/dragon_hyunhwang";		
	}
	//4.1.2 프로젝트별 분석현황 get
	@GetMapping("/project/cooperation/pjt_hyunhwang")
	public String projectCooperationPjtHyunhwang() {		
		return "project/cooperation/pjt_hyunhwang";		
	}
	//4.1.2 프로젝트별 분석현황 post
	@PostMapping("/project/cooperation/pjt_hyunhwang")
	public String projectCooperationPjtHyunhwang(Model model) {		
		return "redirect:/project/cooperation/pjt_hyunhwang";		
	}
	//4.2.1 완료된 프로젝트 검색 list get
	@GetMapping("/project/last/search")
	public String projectLastSearch() {		
		return "/project/last/search";		
	}
	//4.2.1 완료된 프로젝트 검색 list Post
	@PostMapping("/project/last/search")
	public String projectLastSearch(Model model) {		
		return "redirect:/project/last/search";		
	}
	//4.2.1 외주계약서 기본정보 입력 화면 get
	@GetMapping("/project/cooperation/in")
	public String projectCooperationIn() {		
		return "project/cooperation/in";		
	}
	//4.2.1 외주계약서 기본정보 입력 처리 post
	@PostMapping("/project/cooperation/in")
	public String projectCooperationIn(Model model) {		
		return "redirect:/project/cooperation/in";		
	}
	//4.2.1 외주계약서 매입기성 입력 화면 get
	@GetMapping("/project/cooperation/giseung_in")
	public String projectCooperationGiseungIn() {		
		return "project/cooperation/giseung_in";		
	}
	//4.2.1 외주계약서 매입기성 입력 처리 Post
	@PostMapping("/project/cooperation/giseung_in")
	public String projectCooperationGiseungIn(Model model) {		
		return "redirect:/project/cooperation/giseung_in";		
	}
	//4.2.1 외주계약서 매입기성 수정 화면 get
	@GetMapping("/project/cooperation/giseung_up")
	public String projectCooperationGiseungUp() {		
		return "project/cooperation/giseung_up";		
	}
	//4.2.1 외주계약서 매입기성 수정 처리 post
	@PostMapping("/project/cooperation/giseung_up")
	public String projectCooperationGiseungUp(Model model) {		
		return "redirect:/project/cooperation/giseung_up";		
	}
	//4.2.1 외주계약서 매입기성 삭제 처리 post
	@PostMapping("/project/cooperation/giseung_del")
	public String projectCooperationGiseungDel(Model model) {		
		return "redirect:/project/last/search";	//삭제후 검색 리스트로 이동	
	}
	//4.2.1 외주계약서 용역내용 입력 화면 get
	@GetMapping("/project/cooperation/yong_in")
	public String projectCooperationYongIn() {		
		return "project/cooperation/yong_in";		
	}
	//4.2.1 외주계약서 용역내용 입력 처리 post
	@PostMapping("/project/cooperation/yong_in")
	public String projectCooperationYongIn(Model model) {		
		return "redirect:/project/cooperation/yong_in";		
	}
	//4.2.1 외주계약서 용역내용 수정 화면 get
	@GetMapping("/project/cooperation/yong_up")
	public String projectCooperationYongUp() {		
		return "project/cooperation/yong_up";		
	}
	//4.2.1 외주계약서 용역내용 수정 처리 post
	@PostMapping("/project/cooperation/yong_up")
	public String projectCooperationYongUp(Model model) {		
		return "redirect:/project/cooperation/yong_up";		
	}
	//4.2.1 외주계약서 용역내용 수정 처리 post
	@PostMapping("/project/cooperation/yong_del")
	public String projectCooperationYongDel(Model model) {		
		return "redirect:/project/cooperation/yong_del";		
	}
	//4.2.1 입력된 외주계약서 수정 화면 get
	@GetMapping("/project/cooperation/in/up")
	public String projectCooperationInUp() {		
		return "project/cooperation/in/up";		
	}
	//4.2.1 입력된 외주계약서 수정 처리
	@PostMapping("/project/cooperation/in/up")
	public String projectCooperationInUp(Model model) {		
		return "redirect:/project/cooperation/in/up";		
	}
	//4.2.1 입력된 외주계약서 매입기성 수정 화면
	@GetMapping("/project/cooperation/in/giseung_up")
	public String projectCooperationInGiseungUp() {		
		return "project/cooperation/in/giseung_up";		
	}
	//4.2.1 입력된 외주계약서 매입기성 수정 처리
	@PostMapping("/project/cooperation/in/giseung_up")
	public String projectCooperationInGiseungUp(Model model) {		
		return "redirect:/project/cooperation/in/giseung_up";		
	}
	//4.2.1 입력된 외주계약서 매입기성 추가 화면
	@GetMapping("/project/cooperation/in/giseung_in")
	public String projectCooperationInGiseungIn() {		
		return "project/cooperation/in/giseung_in";		
	}
	//4.2.1 입력된 외주계약서 매입기성 추가 처리
	@PostMapping("/project/cooperation/in/giseung_in")
	public String projectCooperationInGiseungIn(Model model) {		
		return "redirect:/project/cooperation/in/giseung_in";		
	}
	//4.2.1 입력된 외주계약서 매입기성 삭제 처리
	@PostMapping("/project/cooperation/in/giseung_del")
	public String projectCooperationInGiseungDel(Model model) {		
		return "redirect:/project/cooperation/in/giseung_up";	//삭제후 입력된 외주계약서 매입기성 수정 화면 으로 리다이렉트	
	}
	//4.2.1 입력된 외주계약서 용역내용 수정 화면
	@GetMapping("/project/cooperation/in/yong_up")
	public String projectCooperationInYongUp() {		
		return "project/cooperation/in/yong_up";		
	}
	//4.2.1 입력된 외주계약서 용역내용 수정 처리
	@PostMapping("/project/cooperation/in/yong_up")
	public String projectCooperationInYongUp(Model model) {		
		return "redirect:/project/cooperation/in/yong_up";		
	}
	//4.2.1 입력된 외주계약서 용역내용 추가 화면
	@GetMapping("/project/cooperation/in/yong_in")
	public String projectCooperationInYongIn() {		
		return "project/cooperation/in/yong_in";		
	}
	//4.2.1 입력된 외주계약서 용역내용 추가 처리
	@PostMapping("/project/cooperation/in/yong_in")
	public String projectCooperationInYongIn(Model model) {		
		return "redirect:/project/cooperation/in/yong_in";		
	}
	//4.2.1 입력된 외주계약서 용역내용 삭제 처리
	@PostMapping("/project/cooperation/in/yong_del")
	public String projectCooperationInYongDel(Model model) {		
		return "redirect:/project/cooperation/in/yong_up"; //삭제후 입력된 외주계약서 용역내용 수정 화면 리다이렉트
	}
	//4.2.2 입력된 외주계약서 검색 get
	@GetMapping("/project/cooperation/list")
	public String projectCooperationList() {		
		return "project/cooperation/list";
	}
	//4.2.2 입력된 외주계약서 검색 post
	@PostMapping("/project/cooperation/list")
	public String projectCooperationList(Model model) {		
		return "redirect:/project/cooperation/list";
	}
	
}
