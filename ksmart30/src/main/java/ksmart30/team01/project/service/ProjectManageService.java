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

import ksmart30.team01.project.domain.ProjectHistory;
import ksmart30.team01.project.mapper.ProjectManageMapper;

@Service
public class ProjectManageService {
	@Autowired
	ProjectManageMapper projectManageMapper;
	
	// 전체 사업수행결정서를 조회하는 메서드
	public List<Map<String, Object>> getBusinessManagerList(String PJT_CD, String DEPT_CD, String YEAR) {
		System.out.println("Service getBusinessManagerList 메서드 실행");
		System.out.println(PJT_CD+DEPT_CD+YEAR);
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("PJT_CD", PJT_CD);
		searchMap.put("DEPT_CD", DEPT_CD);
		searchMap.put("YEAR", YEAR);
		return projectManageMapper.getBusinessManageList(searchMap);
	}
	
	// 1번 이상 변경된 이력이 있는 용역계약서를 조회하는 메서드
	public List<Map<String, ProjectHistory>> getProjectHistoryList(String PJT_CD, String DEPT_CD, String YEAR) {
		System.out.println("Service getProjectManageHistoryList 메서드 실행");
		System.out.println(PJT_CD+DEPT_CD+YEAR);
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
		System.out.println(PJT_CD+", PJT_SEQ : "+PJT_SEQ);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("PJT_CD", PJT_CD);
		map.put("PJT_SEQ", PJT_SEQ);
		return projectManageMapper.getProjectManageChangeSangse(map);
	}
}
