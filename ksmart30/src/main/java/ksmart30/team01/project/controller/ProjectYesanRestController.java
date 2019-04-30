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
import ksmart30.team01.project.domain.ProjectYesanListRequest;
import ksmart30.team01.project.domain.ProjectYesanOutputCodeSearch;
import ksmart30.team01.project.domain.ProjectYesanOutputListRequest;
import ksmart30.team01.project.domain.ProjectYesanSearchRequest;
import ksmart30.team01.project.domain.ProjectYesanWorkStepLogRequest;
import ksmart30.team01.project.service.ProjectYesanService;

@RestController
public class ProjectYesanRestController {
	@Autowired
	private ProjectYesanService projectYesanService;
	
	//2.2.1. 승인된 용역계약서 입력(프로젝트예산입력을 위한 검색 화면 요청)
	@PostMapping("/project/projectYesanView")
	public List<Map<String, Object>> projectYesanView(ProjectYesanSearchRequest projectYesanSearchRequest) {	
		System.out.println("/project/projectYesanView RestController post 계약서 검색 리스트");
		System.out.println(projectYesanSearchRequest.toString()+"View에서 입력받은 값 확인");
		List<Map<String,Object>> searchList = projectYesanService.projectYesanSearch(projectYesanSearchRequest);	
		System.out.println(searchList+" : 받아온값");
		return searchList;
	}	
	
	//2.2.1. 프로젝트코드를 입력받아 프로젝트 개요화면 및 상세화면을 보여주는 요청
	@PostMapping("/project/projectYesanViewOne")
	public Map<String, Object> projectYesanViewOne(String PJT_CD) {	
		System.out.println("/project/projectYesanViewOne RestController post 하나의 프로젝트 개요 화면");				
		System.out.println(PJT_CD+" : 받아온값");
		return projectYesanService.projectYesanViewOne(PJT_CD);
	}
	
	//2.2.1. 일정계획에서 변경횟수가 2회 이상인 경우 변경내역을 보여주는 요청
	@PostMapping("/project/projectYesanViewWorkStepLog")
	public List<Map<String, Object>> projectYesanViewWorkStepLog(ProjectYesanWorkStepLogRequest projectYesanWorkStepLogRequest) {	
		System.out.println("/project/projectYesanViewWorkStepLog RestController post 일정계획 변경내역");				
		System.out.println(projectYesanWorkStepLogRequest.toString()+" : 받아온값");		
		return projectYesanService.projectYesanViewWorkStepLog(projectYesanWorkStepLogRequest);
	}	

	/*
	 * //2.2.1. 일정계획 입력
	 * 
	 * @GetMapping("/person/personInsaModifyView") public String
	 * personInsaModifyView(Model model, @RequestParam(value="EMP_NO") String
	 * EMP_NO) { System.out.println("CONTROLLER : 직원수정  , 사원번호 : "+ EMP_NO); Person
	 * data = personService.personInsaEmployeeModifyView(EMP_NO);
	 * model.addAttribute("EMP_NO", EMP_NO); model.addAttribute("result", data);
	 * return null; }
	 */
	
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

	//2.2.2. 프로젝트코드에 해당하는 프로젝트예산을 승인하는 요청
	@PostMapping("/project/projectYesanSeungin")	
	public int projectYesanSeungin(String PJT_CD) {
		System.out.println("/project/projectYesanSeungin 프로젝트 예산 승인 요청 RestController post");
		System.out.println(PJT_CD+"승인하기 위한 프로젝트코드");
		return projectYesanService.projectYesanSeungin(PJT_CD);
	}		
		
	//2.2.2. 프로젝트코드에 해당하는 승인된 프로젝트예산을 승인취소하는 요청
	@PostMapping("/project/projectYesanSeunginCancel")	
	public int projectYesanSeunginCancel(String PJT_CD) {
		System.out.println("/project/projectYesanSeunginCancel 프로젝트 예산 승인 취소 요청 RestController post");
		System.out.println(PJT_CD+"승인 취소하기 위한 프로젝트코드");
		return projectYesanService.projectYesanSeunginCancel(PJT_CD);
	}	
	
	//2.2.3. 프로젝트예산 출력을 위한 예산프로젝트리스트 조회
	@PostMapping("/project/projectYesanOutputView")
	public List<Map<String, Object>> projectYesanOutputView(ProjectYesanOutputListRequest projectYesanOutputListRequest) {
		System.out.println("/project/projectYesanOutputView 예산프로젝트리스트 조회 요청 RestController post");
		return projectYesanService.projectYesanOutputList(projectYesanOutputListRequest);
	}		
	
	//2.2.3.1 프로젝트예산 출력을 위한 프로젝트코드 검색 모달
	@PostMapping("/project/projectYesanOutputPjtSearch")
	public List<Map<String, Object>> projectYesanOutputPjtSearch(ProjectYesanOutputCodeSearch projectYesanOutputCodeSearch) {
		System.out.println("/project/projectYesanOutputPjtSearch 프로젝트코드조회 요청 RestController post");
		System.out.println(projectYesanOutputCodeSearch.toString());
		return projectYesanService.projectYesanOutputPjtSearch(projectYesanOutputCodeSearch);
	}	

	//2.2.4. 승인한 프로젝트예산서를 조건별로 검색
	@PostMapping("/project/projectYesanSearchView")
	public List<Map<String, Object>> projectYesanSearch() {
		System.out.println("/project/projectYesanSearchView 프로젝트예산 검색 요청 RestController post");
		return projectYesanService.projectYesanSearchList();
	}

	//2.2.4.1. 발주처 검색 Modal
	@PostMapping("/project/projectYesanCustSearch")
	public List<Map<String, Object>> projectYesanCustSearch(String column, String columnValue) {
		System.out.println("/project/projectYesanCustSearch 발주처modal 검색 요청 RestController post");
		return projectYesanService.projectYesanCustSearch(column, columnValue);
	}
	
	//2.2.5. 계약프로젝트List
	@GetMapping("/project/projectYesanDataTableView")
	public List<Map<String, Object>> projectYesanListView(ProjectYesanListRequest projectYesanListRequest) {
		System.out.println("/project/projectYesanListView 계약프로젝트List 조회 요청 RestController post");
		return projectYesanService.projectYesanList(projectYesanListRequest);
	}

	
}
