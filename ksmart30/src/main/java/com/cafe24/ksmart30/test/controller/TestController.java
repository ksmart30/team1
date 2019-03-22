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
		return "tag/form";
	}
	@GetMapping("/sangse")
	public String sangse(){
		return "tag/sangse";
	}
	@GetMapping("/in")
	public String in(){
		return "tag/in";
	}
}
