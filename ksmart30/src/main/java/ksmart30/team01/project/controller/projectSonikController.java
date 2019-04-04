package ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class projectSonikController {

	//3.4 프로젝트 예산, 실적 대비표 화면
	@GetMapping("project/projectSonikContrastView")
	public String projectSonikContrastView() {
		return "/project/projectSonikContrastView";
	}
	
	//3.4.1 상세페이지 상세 화면 
	@GetMapping("project/projectSonikContrastSangseView")
	public String projectSonikContrastSangseView() {
		return "/project/projectSonikContrastSangseView";
	}
	
	//3.4.2 인건비 상세 화면
	@GetMapping("project/projectSonikContrastPayView")
	public String projectSonikContrastPayView() {
		return "/project/projectSonikContrastPayView";
	}	
	
	//3.4.3 제조경비1 상세 화면 
	@GetMapping("project/projectSonikContrastJejo1View")
	public String projectSonikContrastJejo1View() {
		return "/project/projectSonikContrastJejo1View";
	}
	
	//3.4.4 제조경비2 상세 화면 
	@GetMapping("project/projectSonikContrastJejo2View")
	public String projectSonikContrastJejo2View() {
		return "/project/projectSonikContrastJejo2View";
	}
	
	//3.4.5 배부비용 화면 
	@GetMapping("project/projectSonikContrastBebooView")
	public String projectSonikContrastBebooView() {
		return "/project/projectSonikContrastBebooView";
	}	
}