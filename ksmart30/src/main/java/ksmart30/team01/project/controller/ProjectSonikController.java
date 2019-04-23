package ksmart30.team01.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart30.team01.project.service.ProjectSonikService;

@Controller
public class ProjectSonikController {
	
	@Autowired ProjectSonikService projectSonikService;

	//3.4 프로젝트 예산, 실적 대비표 화면
	@GetMapping("project/projectSonikContrastView")
	public String projectSonikContrastView() {
		return "/project/projectSonikContrastView";
	}
	
	//3.4.1 상세페이지 상세 화면 
	@GetMapping("project/projectSonikContrastSangseView")
	public String projectSonikContrastSangseView(Model model, String PJT_CD) {
		System.out.println("projectSonikContrastSangseView왔나"+PJT_CD);
		Map<String, Object> data = projectSonikService.projectSonikContrastSangseView(PJT_CD);
		model.addAttribute("data", data );
		System.out.println(data);
		return "/project/projectSonikContrastSangseView";
	}
		
	//3.4.2 인건비 상세 화면
	@GetMapping("project/projectSonikContrastPayView")
	public String projectSonikContrastPayView() {
		return "/project/projectSonikContrastPayView";
	}	
	
	//3.4.3 제조경비1 상세 화면 
	@GetMapping("project/projectSonikContrastJejo1View")
	public String projectSonikContrastJejo1View(Model model, String PJT_CD) {
		System.out.println("projectSonikContrastJejo1View");
		model.addAttribute("data", projectSonikService.projectSonikContrastJejo1View(PJT_CD));
		System.out.println("model=" + model);
		return "/project/projectSonikContrastJejo1View";
	}
	
	//3.4.4 제조경비2 상세 화면 
	@GetMapping("project/projectSonikContrastJejo2View")
	public String projectSonikContrastJejo2View(Model model, String PJT_CD) {
		System.out.println("projectSonikContrastJejo2View확인");
		List<Map<String,Object>> data = projectSonikService.projectSonikContrastJejo2View(PJT_CD);
		model.addAttribute("data", data);
		System.out.println("model = "+ model);
		return "/project/projectSonikContrastJejo2View";
	}
	
	//3.4.5 배부비용 화면 
	@GetMapping("project/projectSonikContrastBebooView")
	public String projectSonikContrastBebooView() {
		return "/project/projectSonikContrastJejo2View";
	}	
}