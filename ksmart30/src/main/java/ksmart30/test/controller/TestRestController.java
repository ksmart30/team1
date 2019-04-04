package ksmart30.test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	@Autowired TestRestMapper testRestMapper;

	@GetMapping("/test/search")
	public List<Map> search(String pjtCd) {
		System.out.println("테스트실행");
		List<Map> test = testRestMapper.testSelect(pjtCd);
		System.out.println("test"+test.toString());
		return test;		
	}
	
}
