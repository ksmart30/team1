package com.cafe24.ksmart30.team01.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import groovyjarjarpicocli.CommandLine.Model;

@Controller
public class BusinessClientController {
	
	//1.1 거래처 화면
	@GetMapping("/baseInfo/client")
	public String baseInfoClient() {
		return "baseInfo/client";
	}
	
	//1.2 거래처 입력 화면
	@GetMapping("/baseInfo/client/in")
	public String baseInfoClientIn() {
		return "baseInfo/client/in";
	}
	
	//1.2 거래처 입력 처리
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
	
	//1.5 거래처 검색 화면
	@GetMapping("/baseInfo/client/list")
	public String baseInfoClientList() {
		return "baseInfo/client/list";
	}
	
	//1.5 거래처 검색 처리
	@PostMapping("/baseInfo/client/list")
	public String baseInfoClientList(Model model) {
		return "baseInfo/client/list";
	}

}
