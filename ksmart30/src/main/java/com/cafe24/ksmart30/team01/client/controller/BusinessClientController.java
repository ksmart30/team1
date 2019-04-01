package com.cafe24.ksmart30.team01.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import groovyjarjarpicocli.CommandLine.Model;

@Controller
public class BusinessClientController {
	
	
	//0.1 거래처코드 등록
	@GetMapping("/baseinfo/client/in")
	public String baseInfoClientIn() {
		return "baseInfo/client/in";
	}
	
	//0.2 거래처코드 리스트 출력
	@GetMapping("/baseinfo/client/list")
	public String baseInfoClientList() {
		return "baseInfo/client/list";
	}
	
	
	//0.2 거래처코드 리스트 출력
	@PostMapping("/baseinfo/client/list")
	public String baseInfoClientList(Model model) {
		return "baseInfo/client/list";
	}

	
/*	//1.2 거래처 입력 처리
	@PostMapping("/baseInfo/client/in")
	public String baseInfoClientIn(Model model) {
		return "baseInfo/client/in";
	}
	
	//1.3 거래처 수정 화면
	@GetMapping("/baseInfo/client/up")
	public String baseInfoClientUp() {
		return "/baseInfo/client/up";
	}
	
	//1.3 거래처 수정 처리
	@PostMapping("/baseInfo/client/up")
	public String baseInfoClientUp(Model model) {
		return "/baseInfo/client/up";
	}
	
	//1.4 거래처 삭제 처리
	@GetMapping("/baseInfo/client/del")
	public String baseInfoClientDel() {
		return "baseInfo/client/del";
		
		}
		*/
	
}
