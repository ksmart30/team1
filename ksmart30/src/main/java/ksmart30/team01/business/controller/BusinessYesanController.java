package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BusinessYesanController {
		
	//1.2.1 사업성검토 예산 입력
	@GetMapping("/business/yesan/in")
	public String businessYesanIn() {
		
		return "business/yesan/in";	
	}	
		
	//1.2.2 사업성검토 예산 승인
	@GetMapping("/business/yesan/seungin")
	public String businessYesanSeungin() {
		
		return "business/yesan/seungin";
	}
		
	//1.2.3 사업성검토 예산 출력
	@GetMapping("/business/yesan/output")
	public String businessYesanOutput() {
		
		return "business/yesan/output";
	}
		
	//1.2.4 사업성검토 검색1
	@GetMapping("/business/yesan/search")
	public String businessYesanSearch() {
				
		return "business/yesan/search";	
	}
	
	//1.2.5 사업성검토 검색2
	@GetMapping("business/yesan/search2")
	public String businessyesansearch2() {
		
		return "business/yesan/search2";
	}

}


