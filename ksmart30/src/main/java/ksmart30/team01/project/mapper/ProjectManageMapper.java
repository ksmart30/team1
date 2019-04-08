/*
 * @file	ProjectManageMapper.java
 * @brief   용역계약서 Mapper
 * @author  ksmart30 YDE
 */
package ksmart30.team01.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.project.domain.ProjectHistory;

@Mapper
public interface ProjectManageMapper {
	// 전체 프로젝트 대장을 검색하는 쿼리를 호출하는 메서드
	List<Map<String, Object>> getBusinessManageList(Map<String, Object> searchMap);
	
	// 변경된 용역계약서 리스트를 검색하는 쿼리를 호출하는 메서드
	List<Map<String, ProjectHistory>> getProjectHistoryList(Map<String, Object> searchMap);
	
	// 하나의 변경된 용역계약서의 현황 리스트를 출력하는 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectHistoryHyunhwangList(String PJT_CD);
}
