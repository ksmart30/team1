package ksmart30.team01.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team01.project.domain.ProjectSangseRequest;
import ksmart30.team01.project.domain.ProjectYesanSearchRequest;
import ksmart30.team01.project.service.ProjectYesanService;

@RestController
public class ProjectYesanRestController {
	@Autowired
	private ProjectYesanService projectYesanService;
	
	//2.2.1 승인된 용역계약서 입력(프로젝트예산입력을 위한 검색 화면 요청)
	@PostMapping("/project/projectYesanView")
	public List<Map<String, Object>> projectYesanView(ProjectYesanSearchRequest projectYesanSearchRequest) {	
		System.out.println("/project/projectYesanView RestController post 계약서 검색 리스트");
		System.out.println(projectYesanSearchRequest.toString()+"View에서 입력받은 값 확인");
		List<Map<String,Object>> searchList = projectYesanService.projectYesanSearch(projectYesanSearchRequest);	
		System.out.println(searchList+" : 받아온값");
		return searchList;
	}	
	
	//2.2.1 프로젝트코드를 입력받아 프로젝트 개요 화면을 보여주는 요청
	@PostMapping("/project/projectYesanViewOne")
	public Map<String, Object> projectYesanViewOne(String PJT_CD) {	
		System.out.println("/project/projectYesanViewOne RestController post 하나의 프로젝트 개요 화면");				
		System.out.println(PJT_CD+" : 받아온값");
		return projectYesanService.projectYesanViewOne(PJT_CD);
	}
		
	//2.2.1 승인된 용역계약서 상세
	@GetMapping("/project/yesan/sangse")	
	public String projectYesanSangse() {
		return 	"project/yesan/sangse";
	}
	
	//2.2.1 승인된 용역계약서 일정계획 입력(수정) 처리
	@PostMapping("/project/yesan/sangse/schedule_up")
	public String projectYesanSangseScheduleUp(Model model) {
		return "project/yesan/sangse/schedule_up";
	}
	
	//2.2.1 승인된 용역계약서 일정계획 삭제 처리
	@PostMapping("/project/yesan/sangse/schedule_del")
	public String projectYesanSangseScheduleDel(Model model) {
		return "project/yesan/sangse/schedule_del";
	}
	
	//2.2.1 승인된 용역계약서 M/H 입력(수정) 처리
	@PostMapping("/project/yesan/sangse/mh_up")
	public String projectYesanSangseMhUp(Model model) {
		return "project/yesan/sangse/mh_up";
	}
	
	//2.2.1 승인된 용역계약서 제조경비1 입력(수정) 처리
	@PostMapping("project/yesan/sangse/jejo_one_up") 
	public String projectYesanSangseJejoOneUp(Model model) {
		return "project/yesan/sangse/jejo_one_up";
	}
	
	//2.2.1 승인된 용역계약서 제조경비2 입력 처리
	@PostMapping("/project/yesan/sangse/jejo_two_in")
	public String projectYesanSangseJejoTwoIn(Model model) {
		return "project/yesan/sangse/jejo_two_in";
	}
	
	//2.2.1 승인된 용역계약서 제조경비2 수정 화면
	@GetMapping("/project/yesan/sangse/jejo_two_up")
	public String projectYesanSangseJejoTwoUp() {
		return "project/yesan/sangse/jejo_two_up";
	}
	
	//2.2.1 승인된 용역계약서 제조경비2 수정 처리
	@PostMapping("/project/yesan/sangse/jejo_two_up")
	public String projectYesanSangseJejoTwoUp(Model model) {
		return "project/yesan/sangse/jejo_two_up";
	}
	
	//2.2.1 승인된 용역계약서 제조경비2 삭제 처리
	@GetMapping("/project/yesan/sangse/jejo_two_del")
	public String projectYesanSangseJejoTwoDel(Model model) {
		return "project/yesan/sangse/jejo_two_del";
	}	

	//2.2.3 예산 승인된 용역계약서 출력
	@PostMapping("/project/yesan/output")
	public String projectYesanOutput(Model model) {
		return "project/yesan/output";
	}	
	
	//2.2.3.1 프로젝트예산 출력을 위한 프로젝트코드 조회
	@PostMapping("/project/projectYesanOutputPjtSearch")
	public List<Map<String, Object>> projectYesanOutputPjtSearch(String CONTRACT_DATE, String selectedOption, String inputValue) {
		System.out.println("/project/projectYesanOutputPjtSearch 프로젝트코드조회 요청 RestController get");
		System.out.println(CONTRACT_DATE + " :계약일 확인 RestController get");
		System.out.println(selectedOption + " :항목 확인 RestController get");
		System.out.println(inputValue + " :입력값 확인 RestController get");
		return projectYesanService.projectYesanOutputPjtSearch(CONTRACT_DATE, selectedOption, inputValue);
	}	

	//2.2.4 예산 입력한 용역계약서 검색 list
	@PostMapping("/project/yesan/search")
	public String projectYesanSearch(Model model) {
		return "project/yesan/search";
	}

	//2.2.5 예산 승인된 용역계약서 검색
	@PostMapping("/project/yesan/list")
	public String projectYesanList(Model model) {
		return "project/yesan/list";
	}

	
}
