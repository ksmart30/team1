package ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectYesanCostController {

	//3.3 프로젝트 수익/비용
	//3.3.1 부서별 예산서 검색
	@GetMapping("/project/yesan/depart_list")
	public String projectYesanDepartList() {
		
		return "project/yesan/depart_list";
	}
	
	//3.3.1 부서별 예산서 검색
	@PostMapping("/project/yesan/depart_list")
	public String projectYesanDepartList(Model model) {
		
		return "project/yesan/depart_list";
	}
	
	//3.3.2 인건비 및 배부단가표 검색
	@GetMapping("/project/yesan/unit_price_list")
	public String projectYesanUnitPriceList() {
		
		return "project/yesan/unit_price_list";
	}
	
	//3.3.2 인건비 및 배부단가표 검색
	@PostMapping("/project/yesan/unit_price_list")
	public String projectYesanUnitPriceList(Model model) {
		
		return "project/yesan/unit_price_list";
	}
}
