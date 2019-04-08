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
	// 전체 프로젝트 대장을 검색 쿼리를 호출하는 메서드
	List<Map<String, Object>> getBusinessManageList(Map<String, Object> searchMap);
	
	// 변경된 용역계약서 리스트를 검색 쿼리를 호출하는 메서드
	List<Map<String, ProjectHistory>> getProjectHistoryList(Map<String, Object> searchMap);
	
	// 변경된 용역계약서 중 하나의 현황 리스트 출력 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageHistoryHyunhwangList(String PJT_CD);
	
	// 현황 리스트 중 변경 구분을 선택해 용역계약서 상세 페이지 출력 쿼리를 호출하는 메서드
	Map<String, Object> getProjectManageChangeSangse(Map<String, Object> map);
}
