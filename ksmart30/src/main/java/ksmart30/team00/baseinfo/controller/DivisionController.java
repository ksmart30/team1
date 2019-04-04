package ksmart30.team00.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DivisionController {

	@GetMapping("/baseInfo/divisionView")
	public String divisionView() {
		return "baseInfo/divisionView";
	}
}
