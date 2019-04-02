/*
 * @file	ProjectManageService.java
 * @brief   용역계약서 Service
 * @author  ksmart30 YDE
 */
package com.cafe24.ksmart30.team01.project.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.ksmart30.team01.project.mapper.ProjectManageMapper;

@Service
public class ProjectManageService {
	@Autowired
	ProjectManageMapper projectManageMapper;
	
	// 전체 프로젝트를 조회하는 메서드
	public List<Map<String, Object>> businessManagerSearch(String PJT_CD) {
		System.out.println("Service businessManagerSearch 메서드 실행");
		// Mapper에서 전체 프로젝트를 조회하는 메서드 호출
		return projectManageMapper.businessManageSelect(PJT_CD);
	}
}
