package ksmart30.team01.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team01.project.service.ProjectSonikService;

@RestController
public class ProjectSonikRestController {
	@Autowired ProjectSonikService projectSonikService;
	
	
	
	
	
	/*
	 * 제조경비2 상세화면을 위한 메서드(계정과목, 예산)
	 * @PostMapping("/project/projectSonikContrastJejo2View") public String
	 * projectSonikContrastJejo2View(String jejo2) {
	 * 
	 * return projectSonikService.projectSonikContrastJejo2View(jejo2); }
	 */
}
