package ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectYesanBSController {

	//3.4.1 모든 승인이 완료된 계약프로젝트 List
	@GetMapping("/project/last/list")
	public String projectLastList() {
		
		return "project/last/list";
	}
	
	//3.4.1 모든 승인이 완료된 계약프로젝트 List
	@PostMapping("/project/last/list")
	public String projectLastList(Model model) {
		
		return "project/last/list";
	}
	
	//3.4.2 프로젝트 손익 관리
	@GetMapping("/project/sonik")
	public String projectSonik() {
		
		return "project/sonik";
	}
	
	//3.4.2 프로젝트 손익 관리
	@PostMapping("/project/sonik")
	public String projectSonik(Model model) {
		
		return "project/sonik";
	}
}
