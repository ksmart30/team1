/*
 * @file	ProjectManageRestController.java
 * @brief   용역계약서 RestController
 * @author  ksmart30 YDE
 */
package ksmart30.team01.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team01.project.domain.ProjectHistory;
import ksmart30.team01.project.service.ProjectManageService;

@RestController
public class ProjectManageRestController {
	@Autowired
	ProjectManageService projectManageService;
	
	// 전체 프로젝트 검색
	@PostMapping("/project/projectManageSearchProcess")
	public List<Map<String, Object>> projectManageSearchProcess(String PJT_CD, String PJT_NM) {
		System.out.println("RestController projectManageSearchProcess 메서드 실행");
		return null;
	}
	
	//3.1.1 용역계약서 입력 처리
	/* @brief	"http://localhost/project/manage/in" 주소분기(post방식)
	 *			화면에서 입력한 값을 ajax로 값을 넘기고 받기 위함
	 *			@return List<Map<String, Object>>
	 */
	@PostMapping("/project/projectManageListProcess")
	public List<Map<String, Object>> projectManageListProcess(String PJT_CD, String DEPT_CD, String YEAR) {
		System.out.println("RestController projectManageListProcess 메서드 실행");
		return projectManageService.getBusinessManagerList(PJT_CD, DEPT_CD, YEAR);
	}
	
	//3.1.1 용역계약서 발주처 입력 처리
	@PostMapping("/project/manage/owner_in")
	public String projectManageOwnerIn(Model model) {
		return "project/manage/owner_in";
	}

	//3.1.1 용역계약서 발주처 삭제 처리
	@PostMapping("/project/manage/owner_del")
	public String projectManageOwnerDel() {
		return "project/manage/owner_del";
	}
	
	//3.1.1 용역계약서 기성단계 입력 처리
	@PostMapping("/project/manage/giseong_in")
	public String projectManageGiseongIn(Model model) {
		return "project/manage/giseong/in";
	}
	
	//3.1.1 용역계약서 기성단계 삭제 처리
	@PostMapping("/project/manage/giseong_del")
	public String projectManageGiseongDel() {
		return "project/manage/giseong/del";
	}
	
	//3.1.1 용역계약서 세부사항 입력 처리
	@PostMapping("/project/manage/sebu_in")
	public String projectManageSebuIn(Model model) {
		return "project/manage/sebu_in";
	}
	
	//3.1.2 용역계약서 변경 입력 처리
	@PostMapping("/project/manage/change/in")
	public String projectManageChangeIn() {
		return "project/manage/change/in";
	}
	
	//3.1.2 용역계약서 발주처 변경 입력 처리
	@PostMapping("/project/manage/change/owner_in")
	public String projectManageChangeOwnerIn(Model model) {
		return "project/manage/change/owner_in";
	}
	
	//3.1.2 용역계약서 발주처 변경 수정 처리
	@PostMapping("/project/manage/change/owner_up")
	public String projectManageChangeOwnerUp(Model model) {
		return "project/manage/change/owner_up";
	}
	
	//3.1.2 용역계약서 발주처 변경 삭제 처리
	@PostMapping("/project/manage/change/owner_del")
	public String projectManageChangeOwnerDel() {
		return "project/manage/change/owner_del";
	}
	
	//3.1.2 용역계약서 기성단계 변경 입력 처리
	@PostMapping("/project/manage/change/giseong_in")
	public String projectManageChangeGiseongIn(Model model) {
		return "project/manage/change/giseong_in";
	}
	
	//3.1.2 용역계약서 기성단계 변경 수정 처리
	@PostMapping("/project/manage/change/giseong_up")
	public String projectManageChangeGiseongUp(Model model) {
		return "project/manage/change/giseong_up";
	}
	
	//3.1.2 용역계약서 기성단계 변경 삭제 처리
	@PostMapping("/project/manage/change/giseong_del")
	public String projectManageChangeGiseongDel() {
		return "project/manage/change/giseong_del";
	}
	
	//3.1.3 용역계약서 변경 조회
	/* @brief	"http://localhost/project/projectManageChangeListView" 주소분기(post방식)
	 *			화면에서 입력한 값을 ajax로 값을 넘기고 받기 위함
	 *			1번 이상 변경 이력이 있는 용역계약서 리스트 조회
	 *			@return List<Map<String, Object>>
	 */
	@PostMapping("/project/projectManageChangeListProcess")
	public List<Map<String, ProjectHistory>> projectManageChangeListProcess(String PJT_CD, String DEPT_CD, String YEAR) {
		System.out.println("RestController projectManageChangeListProcess 메서드 실행");
		return projectManageService.getProjectHistoryList(PJT_CD, DEPT_CD, YEAR);
	}

	//3.1.3 용역계약서 변경 조회
	/* @brief	"http://localhost/project/projectManageChangeListView" 주소분기(post방식)
	 *			화면에서 입력한 값을 ajax로 값을 넘기고 받기 위함
	 *			선택한 용역계약서의 변경 현황 리스트
	 *			@return List<Map<String, Object>>
	 */
	@PostMapping("/project/projectManageChangeHyunhwangListProcess")
	public List<Map<String, Object>> projectManageChangeHyunhwangListProcess(String PJT_CD) {
		System.out.println("RestController projectManageChangeHyunhwangListProcess 메서드 실행");
		return projectManageService.getProjectManageChangeHyunhwangList(PJT_CD);
	}
	
	//3.1.3 용역계약서 변경 조회
	/* @brief	"http://localhost/project/projectManageChangeListView" 주소분기(post방식)
	 *			화면에서 입력한 값을 ajax로 값을 넘기고 받기 위함
	 *			현황 리스트에서 선택한 용역계약서 상세 데이터
	 *			발주처, 기성단계 상세 포함
	 *			@return List<Map<String, Object>>
	 */
	@PostMapping("/project/projectManageChangeSangseProcess")
	public Map<String, Object> projectManageChangeSangseProcess(String PJT_CD, String PJT_SEQ) {
		System.out.println("RestController projectManageChangeSangseProcess 메서드 실행");
		return projectManageService.getProjectManageChangeSangse(PJT_CD, PJT_SEQ);
	}
	
	//3.1.4 용역계약서 검색(부서)
	@PostMapping("/project/manage/depart_search")
	public String projectManageDepartSearch(Model model) {
		return "project/manage/depart_search";
	}
	
	//3.1.4 용역계약서 검색(발주처)
	@PostMapping("/project/manage/client_search")
	public String projectManageClientSearch(Model model) {
		return "project/manage/client_search";
	}
	
	//3.1.6 용역계약서 현황
	@PostMapping("/project/manage/hyunhwang")
	public String projectManageHyunhwang(Model model) {
		return "project/manage/hyunhwang";
	}
}
