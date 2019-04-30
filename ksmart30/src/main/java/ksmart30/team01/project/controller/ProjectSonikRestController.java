package ksmart30.team01.project.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team01.project.domain.ProjectSonikIngun;
import ksmart30.team01.project.domain.ProjectSonikList;
import ksmart30.team01.project.domain.SonikProjectCodeSearch;
import ksmart30.team01.project.service.ProjectSonikService;

@RestController
public class ProjectSonikRestController {
	@Autowired ProjectSonikService projectSonikService;
	
	
	// 2.3.4 프로젝트 예산,실적대비표 리스트화면을 보여주기위한 메서드 (예산,실적,차이 구분)
	@PostMapping("/project/projectSonikList")
	public List<Map<String,Object>> projectSonikList(ProjectSonikList ProjectSonik){
		System.out.println("projectSonikList확인");
		System.out.println("pjt_cd="+ProjectSonik);
		return projectSonikService.projectSonikList(ProjectSonik);
		
	}
	
	
	//2.3.4 프로젝트 예산,실적대비표 상단의 검색기능에서 코드를 조건별로 검색하는 메서드(프로젝트코드로 검색)
	@PostMapping("/project/projectSonikSearch")
	public List<Map<String,Object>> projectSonikSearch(SonikProjectCodeSearch jogun) {
		System.out.println("projectSonikSearch확인");
		System.out.println("확인 : "+jogun.toString());
		return projectSonikService.projectSonikSearch(jogun);
	}
	
	
	
	//2.3.2 프로젝트 인건비 입력
	@PostMapping("project/projectSonikIngunbi") 
	public List<Map<String,Object>> projectSonikIngunbi(ProjectSonikIngun ingun) {
	System.out.println("projectSonikIngun확인"); 
	  
	return projectSonikService.projectSonikIngunbi(ingun); 
	}
	
}
