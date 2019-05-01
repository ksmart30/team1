/*
 * @file	ProjectManageService.java
 * @brief   용역계약서 Service
 * @author  ksmart30 YDE
 */
package ksmart30.team01.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.project.domain.DeptSearch;
import ksmart30.team01.project.domain.Project;
import ksmart30.team01.project.domain.ProjectHistory;
import ksmart30.team01.project.mapper.ProjectManageMapper;

@Service
public class ProjectManageService {
	@Autowired
	ProjectManageMapper projectManageMapper;

	// select option 중 부서 리스트를 반복분으로 자동 출력하기 위한 메서드
	public List<Map<String, Object>> deptSelectList() {
		System.out.println("Service deptSelectList 메서드 실행");
		return projectManageMapper.deptSelectList();
	}

	// 용역계약서 입력 화면에서 쓰이는 종합코드 리스트를 조회하는 메서드
	public List<Map<String, Object>> getProjectManageCode() {
		System.out.println("Service getProjectManageCode 메서드 실행");
		return projectManageMapper.getProjectManageCode();
	}
	
	// 전체 프로젝트를 조회하는 메서드
	public List<Map<String, Object>> getProjectManageCodeList(String column, String columnValue) {
		System.out.println("Service getProjectManageCodeList 메서드 실행");
		Map<String, Object> searchMap = new HashMap<String, Object>();
		System.out.println("column : " + column);
		System.out.println("columnValue : "+ columnValue);
		if(column.equals("PJT_CD")) {
			System.out.println("PJT_CD입니당");
			searchMap.put("PJT_CD", columnValue);
		} else if(column.equals("PJT_NM")) {
			System.out.println("PJT_NM입니당");
			searchMap.put("PJT_NM", columnValue);
		} else if(column.equals("DEPT_CD")) {
			System.out.println("DEPT_CD입니당");
			searchMap.put("DEPT_CD", columnValue);
		} else if(column.equals("DEPT_NM")) {
			System.out.println("DEPT_NM입니당");
			searchMap.put("DEPT_NM", columnValue);
		}
		return projectManageMapper.getProjectManageCodeList(searchMap);
	}
	
	// 전체 발주처를 조회하는 메서드
	public List<Map<String, Object>> getCustList(String column, String columnValue) {
		System.out.println("Service getCustList 메서드 실행");
		Map<String, Object> searchMap = new HashMap<String, Object>();
		System.out.println("column : " + column);
		System.out.println("columnValue : "+ columnValue);
		if(column.equals("CUST_CD")) {
			System.out.println("CUST_CD입니당");
			searchMap.put("CUST_CD", columnValue);
		} else {
			System.out.println("CUST_NM입니당");
			searchMap.put("CUST_NM", columnValue);
		}
		return projectManageMapper.getCustList(searchMap);
	}
	
	// 전체 부서를 조회하는 메서드
	public List<Map<String, Object>> getDeptList(String column, String columnValue) {
		System.out.println("Service getDeptList 메서드 실행");
		Map<String, Object> searchMap = new HashMap<String, Object>();
		System.out.println("column : " + column);
		System.out.println("columnValue : "+ columnValue);
		if(column.equals("DEPT_CD")) { 
			System.out.println("DEPT_CD입니당");
			searchMap.put("DEPT_CD", columnValue);
		} else {
			System.out.println("DEPT_NM입니당");
			searchMap.put("DEPT_NM", columnValue);
		}
		return projectManageMapper.getDeptList(searchMap);
	}
	 
	// 전체 직원을 조회하는 메서드
	public List<Map<String, Object>> getEmpList(String column, String columnValue) {
		System.out.println("Service getEmpList 메서드 실행");
		Map<String, Object> searchMap = new HashMap<String, Object>();
		System.out.println("column : " + column);
		System.out.println("columnValue : "+ columnValue);
		/*
		 * if(column.equals("DEPT_CD")) { System.out.println("DEPT_CD입니당");
		 * searchMap.put("DEPT_CD", columnValue); } else {
		 * System.out.println("DEPT_NM입니당"); searchMap.put("DEPT_NM", columnValue); }
		 */
		searchMap.put("columnValue",columnValue);
		return projectManageMapper.getDeptList(searchMap);
	}

	// ===================================================용역계약서 입력 START===================================================
	
	// 화면에서 입력된 라디오 버튼에 따라 검색 결과를 다르게 호출하는 메서드
	public List<Map<String, Object>> getProjectManageList(String PJT_CD, String DEPT_CD, String YEAR, String pjtRadioValue) {
		System.out.println("Service getProjectManagerList 메서드 실행");
		System.out.println(PJT_CD);
		System.out.println(DEPT_CD);
		System.out.println(YEAR);
		System.out.println(pjtRadioValue);
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("PJT_CD", PJT_CD);
		searchMap.put("DEPT_CD", DEPT_CD);
		searchMap.put("YEAR", YEAR);
		searchMap.put("RESULT_X", pjtRadioValue);
		List<Map<String, Object>> resultMap = null;
		switch(pjtRadioValue) {
			case "1":
				// 검토
				resultMap = projectManageMapper.getProjectManageGumList(searchMap);
				break;
			case "2":
				// 계약
				resultMap = projectManageMapper.getProjectManageList(searchMap);
				break;
			case "3":
				// 예산
				resultMap = projectManageMapper.getProjectManageList(searchMap);
				break;
			case "4":
				// 승인
				resultMap = projectManageMapper.getProjectManageList(searchMap);
				break;
			case "5":
				// 종료
				resultMap = projectManageMapper.getProjectManageList(searchMap);
				break;
			case "6":
				// ALL
				resultMap = projectManageMapper.getProjectManageList(searchMap);
				break;	
			default:
				resultMap = projectManageMapper.getProjectManageList(searchMap);
				break;
		}
		return resultMap;
	}
	
	// 프로젝트 코드로 선택하여 용역계약서가 입력되어 있으면 그 상세 내용을 조회하는 메서드
	public Map<String, Object> getProjectManageSangse(Project project) {
		System.out.println("Service getProjectManageSangse 메서드 실행");
		// 결과 리턴용 Map
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 용역계약서 입력 화면에서 쓰이는 전체 종합코드를 조회하는 메서드
		resultMap.put("code", projectManageMapper.getProjectManageCode());
		// 프로젝트 코드로 선택하여 용역계약서의 상세 내용을 조회하는 메서드
		resultMap.put("sangse", projectManageMapper.getProjectManageSangse(project));
		// 프로젝트 코드로 선택하여 을의 수급지분 리스트를 조회하는 메서드
		resultMap.put("sugub", projectManageMapper.getProjectManageSugub(project));
		// 프로젝트 코드로 선택하여 최대 시퀀스 값을 구하는 메서드
		resultMap.put("seq", projectManageMapper.getProjectManageSeq(project));
		return resultMap;
	}
	
	// 프로젝트 코드로 선택하여 용역계약서의 발주처 리스트를 조회하는 메서드
	public List<Map<String, Object>> getProjectManageOwnerList(String PJT_CD) {
		System.out.println("Service getProjectManageOwnerList 메서드 실행");
		return projectManageMapper.getProjectManageOwnerList(PJT_CD);
	}
	
	// 프로젝트 코드로 선택하여 용역게약서의 기성단계 리스트를 조회하는 메서드
	public List<Map<String, Object>> getProjectManageGiseongList(Project project) {
		System.out.println("Service getProjectManageGiseongList 메서드 실행");
		return projectManageMapper.getProjectManageGiseongList(project);
	}
	
	// 용역계약서를 한 번도 작성하지 않았으면 수주심의결정서를 조회하는 메서드
	public Map<String, Object> getBusinessManageSangse(String PJT_CD) {
		System.out.println("Service getBusinessManageSangse 메서드 실행");
		return projectManageMapper.getBusinessManageSangse(PJT_CD);
	}
	
	// 선택한 용역계약서의 발주처 입력
	public void addProjectManageOwner(String PJT_CD, String CUST_CD, String CUST_GBN, String N_RATE, String CONTRACT_AMT) {
		System.out.println("Service addProjectManageOwner 메서드 실행");
		// 매개변수용 Map
		Map<String, Object> map = new HashMap<String, Object>();
		// 발주처 입력 매개변수
		map.put("PJT_CD", PJT_CD);
		map.put("CUST_CD", CUST_CD);
		map.put("CUST_GBN", CUST_GBN);
		map.put("N_RATE", Integer.parseInt(N_RATE));
		map.put("CONTRACT_AMT", Integer.parseInt(CONTRACT_AMT));
		//최초 발주처 입력시 insert 쿼리문
		int result = projectManageMapper.addProjectManageOwner(map);
		System.out.println("발추저 입력 쿼리 실행 여부 확인 : "+result);
	}
	// 선택한 용역계약서의 발주처 삭제
	public int delProjectManageOwner(String PJT_CD, String CUST_CD) {
		System.out.println("Service delProjectManageOwner 메서드 실행");
		// 매개변수용 Map
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("PJT_CD", PJT_CD);
		map.put("CUST_CD", CUST_CD);
		int result = projectManageMapper.delProjectManageOwner(map);
		System.out.println("발주처 삭제 쿼리 실행 여부 확인 : "+result);
		return result;
	}
	// 선택한 용역계약서의 기성단계 입력
	public void addProjectManageGiseng(String PJT_CD, String RM_STEP, String SALE_STEP, String RM_AMT, String SUGUM_RATE) {
		System.out.println("Service addProjectManageGiseng 메서드 실행");
		// 기성단계 순서를 검색해 입력할 순번을 조회
		String RM_SEQ = projectManageMapper.getProjectManageGiseongNumber(PJT_CD);
		// 매개변수용 Map
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("PJT_CD", PJT_CD);
		map.put("RM_STEP", RM_STEP);
		map.put("SALE_STEP", SALE_STEP);
		map.put("RM_AMT", Integer.parseInt(RM_AMT));
		map.put("SUGUM_RATE", Integer.parseInt(SUGUM_RATE));
		map.put("RM_SEQ", RM_SEQ);
		// 기성단계 입력
		int result = projectManageMapper.addProjectManageGiseong(map);
		System.out.println("기성단계 입력 쿼리 실행 여부 확인 : "+result);
	}
	// 선택한 용역계약서 기성단계 삭제
	public int delProjectManageGiseong(String PJT_CD, String RM_SEQ) {
		System.out.println("Service delProjectManageGiseong 메서드 실행");
		// 매개변수용 Map
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("PJT_CD", PJT_CD);
		map.put("RM_SEQ", RM_SEQ);
		int result = projectManageMapper.delProjectManageGiseong(map);
		System.out.println("기성단계 삭제 쿼리 실행 여부 확인 : "+result);
		return result;
	}
	// ===================================================용역계약서 변경 입력 START===================================================

	
	// 발주처 히스토리 입력시 최대 시퀀스의 +1값을 가져오는 쿼리문
	//int PJT_SEQ = projectManageMapper.getProjectManageOwnerSeq(PJT_CD);
	//System.out.println(PJT_SEQ);
	// 발주처 히스토리 입력 매개변수
	//map.put("PJT_SEQ", PJT_SEQ);
	//System.out.println(NOW_DATE);
	//map.put("NOW_DATE", NOW_DATE);
	// 처음 입력하기 때문에 변경 구분이 무조건 00
	//map.put("PJT_GB", "00");
	// 최초 발주처 히스토리 입력
	//int result2 = projectManageMapper.addProjectManageOwnerHistory(map);
	//System.out.println("발주처 히스토리 입력 쿼리 실행 여부 확인 : "+result2);

	// 기성단계 히스토리 입력시 최대 시퀀스의 +1값을 가져오는 쿼리문
	//int PJT_SEQ = projectManageMapper.getProjectManageGiseongSeq(PJT_CD);
	//map.put("PJT_SEQ", PJT_SEQ);
	// 변경 날짜
	//map.put("PJT_DATE", NOW_DATE);
	// 처음 입력하기 때문에 변경 구분이 무조건 00
	//map.put("PJT_GB", "00");
	// 기성단계 히스토리 입력
	//int result2 =projectManageMapper.addProjectManageGiseongHistory(map);
	//System.out.println("기성단계 히스토리 입력 쿼리 실행 여부 확인 : "+result2);
	
	// ===================================================용역계약서 변경 조회 START===================================================
	// 1번 이상 변경된 이력이 있는 용역계약서를 조회하는 메서드
	public List<Map<String, ProjectHistory>> getProjectHistoryList(String PJT_CD, String DEPT_CD, String YEAR) {
		System.out.println("Service getProjectManageHistoryList 메서드 실행");
		System.out.println(PJT_CD);
		System.out.println(DEPT_CD);
		System.out.println(YEAR);
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("PJT_CD", PJT_CD);
		searchMap.put("DEPT_CD", DEPT_CD);
		searchMap.put("YEAR", YEAR);
		return projectManageMapper.getProjectHistoryList(searchMap);
	}

	// 변경된 용역계약서 중 하나를 선택하면, 그에 대한 변경 현황 리스트를 조회하는 메서드
	public List<Map<String, Object>> getProjectManageChangeHyunhwangList(String PJT_CD) {
		System.out.println("Service getProjectManageChangeHyunhwangList 메서드 실행");
		System.out.println(PJT_CD);
		return projectManageMapper.getProjectManageHistoryHyunhwangList(PJT_CD);
	}

	// 변경된 용역계약서 현황에서 하나를 선택하면, 해당하는 변경 구분의 상세 페이지를 조회하는 메서드
	public Map<String, Object> getProjectManageChangeSangse(String PJT_CD, String PJT_SEQ) {
		System.out.println("Service getProjectManageChangeSangse 메서드 실행");
		// 매개변수 저장용 Map
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("PJT_CD", PJT_CD);
		map.put("PJT_SEQ", PJT_SEQ);
		// 결과 리턴용 Map
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 변경 현황별로 용역계약서 상세 조회
		resultMap.put("sangse", projectManageMapper.getProjectManageChangeSangse(map));
		// 원계약 정보 조회
		resultMap.put("one", projectManageMapper.getProjectManageChangeSangseOne(PJT_CD));
		// 이전(변경전) 시퀀스 생성
		// 현재의 시퀀스에서 1만큼을 빼 이전 시퀀스로 만든다.
		int temp = Integer.parseInt(PJT_SEQ) - 1;
		String PJT_SEQ_BEFORE = String.valueOf(temp);
		// 매개변수 map 이전 시퀀스 저장
		map.put("PJT_SEQ_BEFORE", PJT_SEQ_BEFORE);
		// 발주처 변경 전 조회 결과
		resultMap.put("owner_before", projectManageMapper.getProjectManageChangeOwnerBefore(map));
		// 발주처 변경 후 조회 결과
		resultMap.put("owner_after", projectManageMapper.getProjectManageChangeOwnerAfter(map));
		// 기성단계 변경 전,후 조회 결과
		resultMap.put("giseongList", projectManageMapper.getProjectManageChangeGiseong(map));
		// 기성단계 변경 전 조회 결과
		resultMap.put("giseong_before", projectManageMapper.getProjectManageChangeGiseongBefore(map));
		// 기성단계 변경 후 조회 결과
		resultMap.put("giseong_after", projectManageMapper.getProjectManageChangeGiseongAfter(map));
		return resultMap;
	}
	
	// ====================================================== 용역계약서 검색(부서) START ====================================================== 
	public List<Map<String, Object>> getProjectManageDepartSearchCode() {
		System.out.println("Service getProjectManageDepartSearchCode 메서드 실행");
		return projectManageMapper.getProjectManageDepartSearchCode();
	}

	public List<Map<String, Object>> getProjectManageDepartSearch(Map<String, Object> map) {
		System.out.println("Service getProjectManageDepartSearch 메서드 실행");
		return projectManageMapper.getProjectManageDepartSearch(map);
	}
	// ====================================================== 용역계약서 검색(부서) END ====================================================== 

	// ====================================================== 용역계약서 현황 START ====================================================== 

	//년도를 기준으로 부서별로 계약 회수 조회 쿼리를 호출하는 메서드
	public Map<String, Object> getProjectManageHyunhwangCount(String YEAR) {
		System.out.println("Service getProjectManageHyunhwangCount 메서드 실행");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("YEAR", YEAR);
		// 결과 리턴용 Map
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("ownerHyunhwang", projectManageMapper.getProjectManageOwnerHyunhwangChart(map));
		resultMap.put("ownerHyunhwangTotal", projectManageMapper.getProjectManageMonthHyunhwangTotal(YEAR));
		resultMap.put("monthHyunhwang", projectManageMapper.getProjectManageMonthHyunhwangChart(map));
		return resultMap;
	}

	//년도를 기준으로 월별로 계약 상세 리스트 조회 쿼리를 호출하는 메서드
	public List<Map<String, Object>> getProjectManageMonthHyunhwangSangse(String YEAR_MONTH) {
		// 매개변수 저장용 Map
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("YEAR_MONTH", YEAR_MONTH);
		return projectManageMapper.getProjectManageMonthHyunhwangSangse(map);
	}
	//년도를 기준으로 부서별로 계약 상세 리스트 조회 쿼리를 호출하는 메서드
	public List<Map<String, Object>> getProjectManageOwnerHyunhwangSangse(String YEAR, String DEPT_CD_SUB) {
		// 매개변수 저장용 Map
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("YEAR", YEAR);
		map.put("DEPT_CD_SUB", DEPT_CD_SUB);
		return projectManageMapper.getProjectManageOwnerHyunhwangSangse(map);
	}
	// ====================================================== 용역계약서 현황 END ====================================================== 
}
