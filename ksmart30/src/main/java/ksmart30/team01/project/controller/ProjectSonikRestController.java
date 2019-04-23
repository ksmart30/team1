package ksmart30.team01.project.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team01.project.domain.SonikProjectCodeSearch;
import ksmart30.team01.project.service.ProjectSonikService;

@RestController
public class ProjectSonikRestController {
	@Autowired ProjectSonikService projectSonikService;
	
	
	//프로젝트 예산,실적대비표 리스트화면을 보여주기위한 메서드
	@PostMapping("/project/projectSonikList")
	public List<Map<String,Object>> projectSonikList(String PJT_CD){
		System.out.println("projectSonikList확인");
		System.out.println("pjt_cd="+PJT_CD);
		return projectSonikService.projectSonikList(PJT_CD);
		
	}
	
	
	//상단의 검색기능에서 코드를 조건별로 검색하는 메서드
	@PostMapping("/project/projectSonikSearch")
	public List<Map<String,Object>> projectSonikSearch(SonikProjectCodeSearch jogun) {
		System.out.println("projectSonikSearch확인");
		System.out.println("확인 : "+jogun.toString());
		return projectSonikService.projectSonikSearch(jogun);
	}
	
	
	
	/*
	 * //제조경비2 상세화면을 위한 메서드(계정과목, 예산)
	 * 
	 * @PostMapping("/project/projectSonikContrastJejo2View") public
	 * List<Map<String,Object>> projectSonikContrastJejo2View(String jejo2) {
	 * System.out.println("projectSonikContrastJejo2View확인"); return
	 * projectSonikService.projectSonikContrastJejo2View(jejo2); }
	 */
	
}
