package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DivisionListController {
	
	//10.2.2 예산서 인건비 및 배부액 단가표
	@GetMapping("/baseInfo/divisionListView")
	public String divisionListView() {
		return "baseInfo/divisionListView";
	}
}
