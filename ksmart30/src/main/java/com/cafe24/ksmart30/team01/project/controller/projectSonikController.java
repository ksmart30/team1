package com.cafe24.ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class projectSonikController {

	//3.4 프로젝트 예산, 실적 대비표 화면
	@GetMapping("project/sonik/contrast")
	public String projectSonikContrast() {
		return "/project/sonik/contrast";
	}
	
	//3.4.1 상세페이지 화면 
	@GetMapping("project/sonik/sangse")
	public String projectSonikSanse() {
		return "/project/sonik/sangse";
	}
	
	//3.4.2 제조경비1 화면 
	@GetMapping("project/sonik/jejo1")
	public String projectSonikJejo1() {
		return "/project/sonik/jejo1";
	}
	
	//3.4.3 제조경비2 화면 
	@GetMapping("project/sonik/jejo2")
	public String projectSonikJejo2() {
		return "/project/sonik/jejo2";
	}
	
	//3.4.4 배부비용 화면 
	@GetMapping("project/sonik/beboo")
	public String projectSonikBecoo() {
		return "/project/sonik/beboo";
	}
	
	
}
