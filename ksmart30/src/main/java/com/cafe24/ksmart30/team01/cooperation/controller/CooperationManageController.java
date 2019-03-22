package com.cafe24.ksmart30.team01.cooperation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CooperationManageController {
	
	//4.2.3 외주비 매입 예정 입력을 위한 프로젝트 검색 list
	@GetMapping("/cooperation/buy/search")
	public String cooperationBuySearch() {
		return "cooperation/buy/search";
	}
	
	//4.2.3 외주비 매입 예정 입력을 위한 프로젝트 검색 list
	@PostMapping("/cooperation/buy/search")
	public String cooperationBuySearch(Model model) {
		return "cooperation/buy/search";
	}
	
	//4.2.3 외주비 매입 예정 입력 화면
	@GetMapping("/cooperation/buy/yejeong_in")
	public String cooperationBuyYejeongIn() {
		return "cooperation/buy/yejeong_in";
	}
	
	//4.2.3 외주비 매입 예정 입력 처리
	@PostMapping("/cooperation/buy/yejeong_in")
	public String cooperationBuyYejeongIn(Model model) {
		return "cooperation/buy/yejeong_in";
	}
	
	//4.2.3 외주비 매입 예정 수정 화면
	@GetMapping("/cooperation/buy/yejeong_up")
	public String cooperationBuyYejeongUp() {
		return "cooperation/buy/yejeong_up";
	}
	
	//4.2.3 외주비 매입 예정 수정 처리
	@PostMapping("/cooperation/buy/yejeong_up")
	public String cooperationBuyYejeongUp(Model model) {
		return "cooperation/buy/yejeong_up";
	}
	
	//4.2.4 외주비 매입 예정 현황검색
	@GetMapping("/cooperation/buy/hyunhwang_list")
	public String cooperationBuyHyunhwangList() {
		return "cooperation/buy/hyunhwang_list";
	}
	
	//4.2.4 외주비 매입 예정 현황검색
	@PostMapping("/cooperation/buy/hyunhwang_list")
	public String cooperationBuyHyunhwangList(Model model) {
		return "cooperation/buy/hyunhwang_list";
	}
	
	//4.2.5 외주비 매입 전표
	@GetMapping("/cooperation/buy/slip")
	public String cooperationBuySlip() {
		return "cooperation/buy/slip";
	}
	
	//4.2.5 외주비 매입 전표
	@PostMapping("/cooperation/buy/slip")
	public String cooperationBuySlip(Model model) {
		return "cooperation/buy/slip";
	}
	
	//4.2.6 외주비 지급 예정 입력을 위한 프로젝트 검색 list
	@GetMapping("/cooperation/pay/search")
	public String cooperationPaySearch() {
		return "cooperation/pay/search";
	}
	
	//4.2.6 외주비 지급 예정 입력을 위한 프로젝트 검색 list
	@PostMapping("/cooperation/pay/search")
	public String cooperationPaySearch(Model model) {
		return "cooperation/pay/search";
	}
	
	//4.2.6 외주비 지급 예정 입력 화면
	@GetMapping("/cooperation/pay/yejeong_in")
	public String cooperationPayYejeongIn() {
		return "cooperation/pay/yejeong_in";
	}
	
	//4.2.6 외주비 지급 예정 입력 처리
	@PostMapping("/cooperation/pay/yejeong_in")
	public String cooperationPayYejeongIn(Model model) {
		return "cooperation/pay/yejeong_in";
	}
	
	//4.2.6 외주비 지급 예정 수정 화면
	@GetMapping("/cooperation/pay/yejeong_up")
	public String cooperationPayYejeongUp() {
		return "cooperation/pay/yejeong_up";
	}
	
	//4.2.6 외주비 지급 예정 수정 처리
	@PostMapping("/cooperation/pay/yejeong_up")
	public String cooperationPayYejeongUp(Model model) {
		return "cooperation/pay/yejeong_up";
	}
	
	//4.2.7 외주비 지급 예정 현황검색
	@GetMapping("/cooperation/pay/hyunhwang_list")
	public String cooperationPayHyunhwangList() {
		return "cooperation/pay/hyunhwang_list";
	}
	
	//4.2.7 외주비 지급 예정 현황검색
	@PostMapping("/cooperation/pay/hyunhwang_list")
	public String cooperationPayHyunhwangList(Model model) {
		return "cooperation/pay/hyunhwang_list";
	}
	
	//4.2.8 외주비 지급 전표
	@GetMapping("/cooperation/pay/slip")
	public String cooperationPaySlip() {
		return "cooperation/pay/slip";
	}
	
	//4.2.8 외주비 지급 전표
	@PostMapping("/cooperation/pay/slip")
	public String cooperationPaySlip(Model model) {
		return "cooperation/pay/slip";
	}
	
	
}
