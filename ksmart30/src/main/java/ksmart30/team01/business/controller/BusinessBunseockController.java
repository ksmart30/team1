package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BusinessBunseockController {
	//2.3 사업성검토분석 현황
	//2.3.1 진행 현황
	@GetMapping("/business/ing/hyunhawng")
	public String businessIngHyunhawng() {
		
		return "business/ing/hyunhawng";
	}
	
	//2.3.1 진행 현황 검색
	@GetMapping("/business/ing/hyunhawng_search")
	public String businessIngHyunhawngSearch() {
		
		return "business/ing/hyunhawng_search";
	}
	
	//2.3.1 종료 현황
	@GetMapping("/business/end/hyunhawng")
	public String businessEndHyunhawng() {
		
		return "business/end/hyunhawng";
	}
	
	//2.3.1 종료 현황 검색
	@GetMapping("/business/end/hyunhawng_search")
	public String businessEndHyunhawngSearch() {
		
		return "business/end/hyunhawng_search";
	}
	
	//2.3.2 발주처별 진행 현황
	@GetMapping("/business/ing/order/hyunhwang")
	public String businessIngOrderHyunhwang() {
		
		return "business/ing/order/hyunhwang";
	}
	
	//2.3.2 발주처별 진행 현황
	@PostMapping("/business/ing/order_hyunhwang")
	public String businessIngOrderHyunhwang(Model model) {
		
		return "business/ing/order_hyunhwang";
	}
	
	//2.3.3 사업성검토 성공율
	@GetMapping("/business/success_rate")
	public String businessSuccessRate() {
		
		return "business/success_rate";
	}
	
	//2.3.3 사업성검토 성공율
	@PostMapping("/business/success_rate")
	public String businessSuccessRate(Model model) {
		
		return "business/success_rate";
	}
}
