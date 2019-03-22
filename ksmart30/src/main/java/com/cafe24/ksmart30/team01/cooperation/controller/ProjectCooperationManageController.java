package com.cafe24.ksmart30.team01.cooperation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectCooperationManageController {

	@GetMapping("project/cooperation/dragon/hyunhwang")
	public String projectCooperationDragonHyunhwang() {
		
		return "project/cooperation/dragon/hyunhwang";
		
	}
}
