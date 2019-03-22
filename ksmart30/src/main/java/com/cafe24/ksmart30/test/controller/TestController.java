package com.cafe24.ksmart30.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/table")
	public String test(){
		return "table";
	}
	@GetMapping("/form")
	public String form(){
		return "form";
	}
}
