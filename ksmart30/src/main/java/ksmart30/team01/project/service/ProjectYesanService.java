/*
 * @file    ProjectYesanService.java
 * @brief   project yesan service
 * @author  ksmart30 임명심
 */
package ksmart30.team01.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.project.domain.ProjectYesanSearchRequest;
import ksmart30.team01.project.domain.ProjectYesanWorkStepLogRequest;
import ksmart30.team01.project.domain.ProjectSangseRequest;
import ksmart30.team01.project.domain.ProjectYesanListRequest;
import ksmart30.team01.project.domain.ProjectYesanOutputCodeSearch;
import ksmart30.team01.project.domain.ProjectYesanOutputListRequest;
import ksmart30.team01.project.mapper.ProjectYesanMapper;

@Service
public class ProjectYesanService {
	@Autowired ProjectYesanMapper projectYesanMapper;
		
	// 2.2.1 프로젝트예산을 입력하기 전 승인된 용역계약서의 목록을 보여줌
	public List<Map<String, Object>> projectYesanSearch(ProjectYesanSearchRequest projectYesanSearchRequest) {
		System.out.println(projectYesanSearchRequest.toString()+"서비스 vo 확인");
		List<Map<String, Object>> searchList = projectYesanMapper.getProjcetYesanSearchList(projectYesanSearchRequest);
		return searchList;
	}
	
	//2.2.1 프로젝트코드를 입력받아 프로젝트 개요를 보여줌
	public Map<String, Object> projectYesanViewOne(String PJT_CD) {
		System.out.println(PJT_CD+"서비스 PJT_CD");
		Map<String,Object> projectYesanSangseAll = new HashMap<String, Object>();

		// 프로젝트 개요(발주처 제외)
		Map<String,Object> projectYesanSangse = projectYesanMapper.getProjectYesanSangse(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangse", projectYesanSangse);
		
		// 발주처
		List<Map<String,Object>> projectYesanSangseCustNm = projectYesanMapper.getProjectYesanSangseCustNm(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseCustNm", projectYesanSangseCustNm);
		
		//1. 일정계획
		List<Map<String,Object>> projectYesanSangseWorkStep = projectYesanMapper.getProjectYesanSangseWorkStep(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseWorkStep",projectYesanSangseWorkStep);
		
		//2. MH계획
		List<Map<String,Object>> projectYesanSangseMH = projectYesanMapper.getProjectYesanSangseMH(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseMH",projectYesanSangseMH);
		
		//2.2 MH계획 중 인건비소계와 점유율을 조회
		Map<String,Object> projectYesanSangseMHTotal = projectYesanMapper.getProjectYesanSangseMHTotal(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseMHTotal",projectYesanSangseMHTotal);
		
		//3. 제조경비1 오른쪽
		List<Map<String,Object>> projectYesanSangseJejo1R = projectYesanMapper.getProjectYesanSangseJejo1R(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseJejo1R",projectYesanSangseJejo1R);
		
		//3. 제조경비1 왼쪽
		List<Map<String,Object>> projectYesanSangseJejo1L = projectYesanMapper.getProjectYesanSangseJejo1L(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseJejo1L",projectYesanSangseJejo1L);		
		
		//4. 제조경비2
		List<Map<String,Object>> projectYesanSangseJejo2 = projectYesanMapper.getProjectYesanSangseJejo2(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseJejo2",projectYesanSangseJejo2);		
		
		//5. 기성단계
		List<Map<String,Object>> projectYesanSangseGiseong = projectYesanMapper.getProjectYesanSangseGiseong(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseGiseong",projectYesanSangseGiseong);		
		
		//6. 추정손익계산서(사업성검토 제외)
		Map<String,Object> projectYesanSangseSonik = projectYesanMapper.getProjectYesanSangseSonik(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseSonik",projectYesanSangseSonik);
		
		//6. 추정손익계산서(사업성검토)
		Map<String,Object> projectYesanSangseSonikBiz = projectYesanMapper.getProjectYesanSangseSonikBiz(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseSonikBiz",projectYesanSangseSonikBiz);
		
		return projectYesanSangseAll;
	}
	
	//2.2.1. 일정계획에서 변경횟수가 2회 이상인 경우 변경내역을 보여주는 요청
	public List<Map<String, Object>> projectYesanViewWorkStepLog(ProjectYesanWorkStepLogRequest projectYesanWorkStepLogRequest) {
		
		List<Map<String, Object>> workStepLogList = projectYesanMapper.getProjectYesanViewWorkStepLog(projectYesanWorkStepLogRequest);
		return workStepLogList;
	}
	
	//2.2.2. 프로젝트코드에 해당하는 프로젝트예산을 승인하는 요청
	public int projectYesanSeungin(String PJT_CD) {
		System.out.println("projectYesanSeungin 프로젝트예산 승인 서비스");
		System.out.println(PJT_CD+"승인처리할 프로젝트코드 서비스");
		return projectYesanMapper.modifyProjectYesanSeungin(PJT_CD);
	}	

	//2.2.2. 프로젝트코드에 해당하는 프로젝트예산 승인 취소하는 요청
	public int projectYesanSeunginCancel(String PJT_CD) {
		System.out.println("projectYesanSeunginCancel 프로젝트예산 승인취소 서비스");
		System.out.println(PJT_CD+"승인처리 취소할 프로젝트코드 서비스");
		return projectYesanMapper.modifyProjectYesanSeunginCancel(PJT_CD);
	}	
	
	//2.2.3. 프로젝트예산 출력을 위한 프로젝트리스트 조회	
	public List<Map<String, Object>> projectYesanOutputList(ProjectYesanOutputListRequest projectYesanOutputListRequest) {
		System.out.println("시작"+projectYesanOutputListRequest.getEND_DATE().length());
		if(projectYesanOutputListRequest.getEND_DATE().length()>0) {		
			String aa = projectYesanOutputListRequest.getEND_DATE();
			projectYesanOutputListRequest.setEND_DATE("CONVERT(VARCHAR,CONVERT(DATE,'"+aa+"'),112)");
		}
		
		if(projectYesanOutputListRequest.getSTART_DATE().length()>0) {
			String bb = projectYesanOutputListRequest.getSTART_DATE();
			projectYesanOutputListRequest.setSTART_DATE("AND B.CONTRACT_DATE BETWEEN CONVERT(VARCHAR,CONVERT(DATE,'"+bb+"'),112) AND");
		}
		System.out.println("마지막"+projectYesanOutputListRequest.toString());
		List<Map<String, Object>> projectYesanOutputList = projectYesanMapper.getprojectYesanOutputList(projectYesanOutputListRequest);
		return projectYesanOutputList;
	}	
	
	//2.2.3.1 프로젝트예산 출력하기 위해 조건에 맞는 프로젝트를 검색하는 메서드
	public List<Map<String, Object>> projectYesanOutputPjtSearch(ProjectYesanOutputCodeSearch projectYesanOutputCodeSearch) {
		System.out.println("projectYesanOutputPjtSearch 서비스 확인");
		return projectYesanMapper.getProjectYesanOutputPjtList(projectYesanOutputCodeSearch);
	}
	
	//2.2.4. 프로젝트예산서를 조건별로 검색
	public List<Map<String, Object>> projectYesanSearchList() {
		System.out.println("projectYesanSearchList메서드 서비스");
		return projectYesanMapper.getProjectYesanSearch();
	}	
	
	//2.2.4 발주처 검색 modal
	public List<Map<String, Object>> projectYesanCustSearch(String column, String columnValue) {
		System.out.println("projectYesanSearchList 발주처 검색 modal 서비스");
		System.out.println(column+" :구분");
		System.out.println(columnValue+" :입력값");
		return projectYesanMapper.getProjectYesanCustList(column, columnValue);
	}
	
	//2.2.5. 계약프로젝트List
	public List<Map<String, Object>> projectYesanList(ProjectYesanListRequest projectYesanListRequest) {
		System.out.println("projectYesanList 서비스");		
		
		//지상층과 지하층이 공백일 경우 처리해주기
		if(projectYesanListRequest.getB_UP_SU().equals("")) {
			projectYesanListRequest.setB_UP_SU("999");
		}
		if(projectYesanListRequest.getB_DOWN_SU().equals("")) {
			projectYesanListRequest.setB_DOWN_SU("0");
		}
		
		//연면적 공백일 경우 처리해주기
		if(projectYesanListRequest.getG_AREA_P_LOW().equals("")) {
			projectYesanListRequest.setG_AREA_P_LOW("0.0");
		}
		if(projectYesanListRequest.getG_AREA_P_HIGH().equals("")) {
			projectYesanListRequest.setG_AREA_P_HIGH("9999999");
		}
		System.out.println(projectYesanListRequest.toString()+"프로젝트예산List 검색조건");
		List<Map<String, Object>> projectYesanList = projectYesanMapper.getProjectYesanList(projectYesanListRequest);
		return projectYesanList;
	}









	
}
