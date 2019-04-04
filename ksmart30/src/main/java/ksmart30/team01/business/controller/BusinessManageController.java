package ksmart30.team01.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessManageController {
	

	//사업수행 결정서
	@GetMapping("/business/businessManageView")
	public String businessManageView() {
		return "business/businessManageView";
	}

	//사업수행 결정서 승인
	@GetMapping("/business/businessManageSeunginView")
	public String businessManageSeunginView() {
		return "business/businessManageSeunginView";
	}
	

	//사업성검토 List
	@GetMapping("/business/businessManageListView")
	public String businessManageListView() {
		return "business/businessManageListView";
	}
	
	//현황리스트
	@GetMapping("/business/businessStateHyunhawngView")
	public String businessStateHyunhawngView() {
		return "business/businessStateHyunhawngView";
	}
	
	//
	@GetMapping("/business/businessSuccessRateView")
	public String businessSuccessRateView() {
		return "business/businessSuccessRateView";
	}
	
	//
	@GetMapping("/business/businessOrderHyunhwangView")
	public String businessOrderHyunhwangView() {
		return "business/businessOrderHyunhwangView";
	}

	
}

