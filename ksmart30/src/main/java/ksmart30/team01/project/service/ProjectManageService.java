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

import ksmart30.team01.project.mapper.ProjectManageMapper;

@Service
public class ProjectManageService {
	@Autowired
	ProjectManageMapper projectManageMapper;
	
	// 전체 사업수행결정서를 조회하는 메서드
	public List<Map<String, Object>> businessManagerSearch(String PJT_CD, String DEPT_CD, String YEAR) {
		System.out.println("Service businessManagerSearch 메서드 실행");
		System.out.println(PJT_CD+DEPT_CD+YEAR);
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("PJT_CD", PJT_CD);
		searchMap.put("DEPT_CD", DEPT_CD);
		searchMap.put("YEAR", YEAR);
		return projectManageMapper.businessManageSelect(searchMap);
	}
}
