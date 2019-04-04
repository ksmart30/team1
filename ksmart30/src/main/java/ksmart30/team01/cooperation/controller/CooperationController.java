package ksmart30.team01.cooperation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CooperationController {
	//동기식 view 단은 get 방식을 기본으로 해볼까?
	
	//3.1.1 외주계약서 입력
	@GetMapping("/cooperation/cooperationView")
	public String projectCooperationIn() {		
		return "cooperation/cooperationView";		
	}
	
	//3.1.2 입력된 외주계약서 검색
	@GetMapping("/cooperation/cooperationSearchView")
	public String projectCooperationSearch() {		
		return "cooperation/cooperationSearchView";
	}
		
	//3.2.1 용도별 분석현황
	@GetMapping("/cooperation/cooperationDragonHyunhwangView")
	public String projectCooperationDragon_hyunhwang() {		
		return "cooperation/cooperationDragonHyunhwangView";		
	}
	
	//3.2.2 프로젝트별 분석현황
	@GetMapping("/cooperation/cooperationPjtHyunhwangView")
	public String projectCooperationPjtHyunhwang() {		
		return "cooperation/cooperationPjtHyunhwangView";		
	}
	
	

	
}
