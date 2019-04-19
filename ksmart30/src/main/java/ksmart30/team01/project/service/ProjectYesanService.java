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
import ksmart30.team01.project.domain.ProjectSangseRequest;
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

		//2.2.1.1 프로젝트 개요(발주처 제외)
		Map<String,Object> projectYesanSangse = projectYesanMapper.getProjectYesanSangse(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangse", projectYesanSangse);
		
		//2.2.1.2 발주처
		List<Map<String,Object>> projectYesanSangseCustNm = projectYesanMapper.getProjectYesanSangseCustNm(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseCustNm", projectYesanSangseCustNm);
		
		//2.2.1.3. 일정계획
		List<Map<String,Object>> projectYesanSangseWorkStep = projectYesanMapper.getProjectYesanSangseWorkStep(PJT_CD);
		projectYesanSangseAll.put("projectYesanSangseWorkStep",projectYesanSangseWorkStep);
		return projectYesanSangseAll;
	}

	//2.2.3.1 프로젝트예산 출력을 위한 프로젝트코드 조회
	public List<Map<String, Object>> projectYesanOutputPjtSearch(String CONTRACT_DATE, String selectedOption, String inputValue) {
		System.out.println("projectYesanOutputPjtSearch 서비스 확인");
		List<Map<String, Object>> pjtList = projectYesanMapper.getProjectYesanOutputPjtList(CONTRACT_DATE, selectedOption, inputValue);
		return pjtList;
	}
	
	
}
