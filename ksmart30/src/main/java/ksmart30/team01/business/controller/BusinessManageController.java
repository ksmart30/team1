package ksmart30.team01.business.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;

import ksmart30.team01.business.service.BusinessManageService;


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
	
	
}

