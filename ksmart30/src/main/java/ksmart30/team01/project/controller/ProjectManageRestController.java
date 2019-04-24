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
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team01.project.domain.DeptSearch;
import ksmart30.team01.project.domain.Project;
import ksmart30.team01.project.domain.ProjectHistory;
import ksmart30.team01.project.service.ProjectManageService;

@RestController
public class ProjectManageRestController {
	@Autowired
	ProjectManageService projectManageService;
	// 모달에서 전체 프로젝트 검색
	@PostMapping("/project/getProjectManageCodeListProcess")
	public List<Map<String, Object>> getProjectManageCodeListProcess(String column, String columnValue) {
		System.out.println("RestController getProjectManageCodeListProcess 메서드 실행");
		return projectManageService.getProjectManageCodeList(column, columnValue);
	}
	
	// 전체 발주처 검색
	@PostMapping("/project/projectManageCustSearchProcess")
	public List<Map<String, Object>> projectManageCustSearchProcess(String column, String columnValue) {
		System.out.println("RestController projectManageCustSearchProcess 메서드 실행");
		return projectManageService.getCustList(column, columnValue);
	}
	
	// 전체 부서 검색
	@PostMapping("/project/projectManageDeptListProcess")
	public List<Map<String, Object>> projectManageDeptListProcess(String column, String columnValue) {
		System.out.println("RestController projectManageDeptListProcess 메서드 실행");
		return projectManageService.getDeptList(column, columnValue);
	}
	
	// 전체 직원 검색
	@PostMapping("/project/projectManageEmpListProcess")
	public List<Map<String, Object>> projectManageEmpListProcess(String column, String columnValue) {
		System.out.println("RestController projectManageEmpListProcess 메서드 실행");
		return projectManageService.getEmpList(column, columnValue);
	}
	
	//3.1.1 용역계약서 입력을 위한 프로젝트 리스트 검색
	/* @brief	"http://localhost/project/manage/in" 주소분기(post방식)
	 *			화면에서 입력한 값을 ajax로 값을 넘기고 받기 위함
	 *			@return List<Map<String, Object>>
	 */
	@PostMapping("/project/projectManageListProcess")
	public List<Map<String, Object>> projectManageListProcess(String PJT_CD, String DEPT_CD, String YEAR, String pjtRadioValue) {
		System.out.println("RestController projectManageListProcess 메서드 실행");
		return projectManageService.getProjectManageList(PJT_CD, DEPT_CD, YEAR, pjtRadioValue);
	}
	
	//3.1.1 용역계약서 상세 데이터 출력
	@PostMapping("/project/projectManageSangseProcess")
	public Map<String, Object> projectManageSangseProcess(Project project) {
		System.out.println("RestController projectManageSangseProcess 메서드 실행");
		return projectManageService.getProjectManageSangse(project);
	}
	
	//3.1.1 용역게약서 발주처 데이터 출력
	@PostMapping("/project/projectManageOwnerListProcess")
	public List<Map<String, Object>> projectManageOwnerListProcess(Project project) {
		System.out.println("RestController projectManageOwnerListProcess 메서드 실행");
		return projectManageService.getProjectManageOwnerList(project);
	}
	
	//3.1.1 용역게약서 기성단계 데이터 출력
		@PostMapping("/project/projectManageGiseongListProcess")
		public List<Map<String, Object>> projectManageGiseongListProcess(Project project) {
			System.out.println("RestController projectManageGiseongListProcess 메서드 실행");
			return projectManageService.getProjectManageGiseongList(project);
		}


	//3.1.1 용역계약서 입력 전 수주심의결정서 정보 출력
	@PostMapping("/project/BusinessManageSangseProcess")
	public Map<String, Object> BusinessManageSangseProcess(String PJT_CD) {
		System.out.println("RestController BusinessManageSangseListProcess 메서드 실행");
		return projectManageService.getBusinessManageSangse(PJT_CD);
	}

	//3.1.1 용역계약서 기본사항 입력 처리
	@PostMapping("/project/projectManageWriteProcess")
	public String projectManageWriteProcess(Project project) {
		return null;
	}
	
	//3.1.1 용역계약서 발주처 입력 처리
	@PostMapping("/project/projectManageOwnerWriteProcess")
	public String projectManageOwnerWriteProcess(String PJT_CD, String CUST_CD, String CUST_GBN, String N_RATE, String CONTRACT_AMT) {
		System.out.println("RestController projectManageOwnerWriteProcess 메서드 실행");
		return projectManageService.addProjectManageOwner(PJT_CD, CUST_CD, CUST_GBN, N_RATE, CONTRACT_AMT);
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

	// 3.1.4 용역계약서 검색(부서)
	@PostMapping("/project/projectManageDeptSearchProcess")
	public List<Map<String, Object>> projectManageDeptSearchProcess(DeptSearch deptSearch) {
		System.out.println("RestController projectManageDeptSearchProcess 메서드 실행");
		System.out.println("안녕?널이면안돼"+deptSearch.getEND_DATE());
		return projectManageService.getProjectManageDepartSearch(deptSearch);
	}

	//3.1.6 용역계약 현황 차트 값을 가져옴
	@PostMapping("/project/projectManageHyunhwangProcess")
	public Map<String, Object> projectManageHyunhwangProcess(String YEAR) {
		System.out.println("RestController projectManageHyunhwangProcess 메서드 실행");
		return projectManageService.getProjectManageHyunhwangCount(YEAR);
	}

	//3.1.6 용역계약 현황 월별 상세 값을 가져옴
	@PostMapping("/project/projectManageHyunhwangMonthSangseProcess")
	public List<Map<String, Object>> projectManageHyunhwangMonthSangseProcess(String YEAR_MONTH) {
		System.out.println("RestController projectManageHyunhwangMonthSangseProcess 메서드 실행");
		return projectManageService.getProjectManageMonthHyunhwangSangse(YEAR_MONTH);
	}
	//3.1.6 용역계약 현황 부서별 상세 값을 가져옴
	@PostMapping("/project/projectManageHyunhwangOwnerSangseProcess")
	public List<Map<String, Object>> projectManageHyunhwangOwnerSangseProcess(String YEAR, String DEPT_CD_SUB) {
		System.out.println("RestController projectManageHyunhwangOwnerSangseProcess 메서드 실행");
		return projectManageService.getProjectManageOwnerHyunhwangSangse(YEAR, DEPT_CD_SUB);
	}
}
