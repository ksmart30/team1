package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import groovyjarjarpicocli.CommandLine.Model;

@Controller
public class ClientController {

	
	//0.1 거래처코드 등록
	@GetMapping("/baseInfo/clientView")
	public String clientView() {
		return "baseInfo/clientView";
	}
	
	//0.2 거래처코드 리스트 출력
	@GetMapping("/baseInfo/clientListView")
	public String clientListView() {
		return "baseInfo/clientListView";
	}
	
	
	//0.2 거래처코드 리스트 출력
	@PostMapping("/baseinfo/ClientService/list")
	public String baseInfoClientList(Model model) {
		return "baseInfo/ClientService/list";
	}

	
/*	//1.2 거래처 입력 처리
	@PostMapping("/baseInfo/ClientService/in")
	public String baseInfoClientIn(Model model) {
		return "baseInfo/ClientService/in";
	}
	
	//1.3 거래처 수정 화면
	@GetMapping("/baseInfo/ClientService/up")
	public String baseInfoClientUp() {
		return "/baseInfo/ClientService/up";
	}
	
	//1.3 거래처 수정 처리
	@PostMapping("/baseInfo/ClientService/up")
	public String baseInfoClientUp(Model model) {
		return "/baseInfo/ClientService/up";
	}
	
	//1.4 거래처 삭제 처리
	@GetMapping("/baseInfo/ClientService/del")
	public String baseInfoClientDel() {
		return "baseInfo/ClientService/del";
		
		}
		*/
	
}
