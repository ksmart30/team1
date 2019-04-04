package ksmart30.team01.business.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessYesanRestController {


	//1.2.1 사업성검토 예산 입력
	@PostMapping("business/yesan/in")
	public String businessYesanIn() {
		
		return "business/yesan/in";
	}

	//1.2.2 사업성검토 예산 승인
	@PostMapping("/business/yesan/seungin")
	public String businessYesanSeungin(Model model) {
		
		return "business/yesan/seungin";	
	}
	
	//1.2.3 사업성검토 예산 출력
	@PostMapping("/business/yesan/output")
	public String businessYesanOutput(Model model) {
		
		return "business/yesan/output";
	}
	
	
	//1.2.4 사업성검토 검색1
	@PostMapping("/business/yesan/search")
	public String businessYesanSearch(Model model) {
		
		return "business/yesan/search";
	}
	
	//1.2.5 사업성검토 검색2
	@PostMapping("/business/yesan/search2")
	public String businessYesanSearch2(Model model) {
		
		return "business/yesan/search2";
	}
		

}
