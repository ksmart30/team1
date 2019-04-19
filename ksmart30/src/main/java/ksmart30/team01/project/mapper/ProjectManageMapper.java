/*
 * @file	ProjectManageMapper.java
 * @brief   용역계약서 Mapper
 * @author  ksmart30 YDE
 */
package ksmart30.team01.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.project.domain.Project;
import ksmart30.team01.project.domain.ProjectHistory;

@Mapper
public interface ProjectManageMapper {
	// 용역계약서 입력 화면에서 쓰이는 종합코드 전체 검색 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageCode();
	
	// 전체 발주처 검색 쿼리를 호출하는 메서드
	List<Map<String, Object>> getCustList(Map<String, String> searchMap);
	
	// 용역계약서 작성을 위해 전체 프로젝트 대장 검색 쿼리를 호출하는 메서드 (검토)
	List<Map<String, Object>> getProjectManageGumList(Map<String, Object> searchMap);
	
	// 용역계약서 작성을 위해 전체 프로젝트 대장 검색 쿼리를 호출하는 메서드 (계약, 예산, 승인, 종료)
	List<Map<String, Object>> getProjectManageList(Map<String, Object> searchMap);

	// 용역계약서 작성을 위해 전체 프로젝트 대장 검색 쿼리를 호출하는 메서드 (ALL)
	List<Map<String, Object>> getProjectManageAllList(Map<String, Object> searchMap);
	
	// 용역계약서가 이미 작성되어 있는 경우 그 상세 데이터 조회 쿼리를 호출하는 메서드
	Map<String, Object> getProjectManageSangse(Project project);
	
	// 용역계약서가 이미 작성되어 있는 경우 그 발주처 리스트 조회 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageOwnerList(Project project);
	
	// 용역계약서가 이미 작성되어 있는 경우 그 기성단계 리스트 조회 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageGiseongList(Project projectD);
	
	// 용역계약서가 이미 작성되어 있는 경우 그 을의 수급 리스트 조회 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageSugub(Project project);
	
	// 용역계약서가 이미 작성되어 있는 경우 변경 회수 조회 쿼리를 호출하는 메서드
	Map<String, Object> getProjectManageSeq(Project project);
	
	// 용역계약서가 한 번도 작성되지 않은 경우 수주심의결정서 조회 쿼리를 호출하는 메서드
	Map<String, Object> getBusinessManageSangse(String PJT_CD);

	// 변경된 용역계약서 리스트를 검색 쿼리를 호출하는 메서드
	List<Map<String, ProjectHistory>> getProjectHistoryList(Map<String, Object> searchMap);
	
	// 변경된 용역계약서 중 하나의 현황 리스트 출력 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageHistoryHyunhwangList(String PJT_CD);
	
	// 현황 리스트 중 변경 구분을 선택해 용역계약서 상세 페이지 출력 쿼리를 호출하는 메서드
	Map<String, Object> getProjectManageChangeSangse(Map<String, Object> map);
	
	// 원계약의 총계약액, 대지면적, 연면적 출력 쿼리를 호출하는 메서드
	Map<String, Object> getProjectManageChangeSangseOne(String PJT_CD);
	
	// 변경된 용역계약서 상세 중 변경 전 발주처 출력 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageChangeOwnerBefore(Map<String, Object> map);
	
	// 변경된 용역계약서 상세 중 변경 후 발주처 출력 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageChangeOwnerAfter(Map<String, Object> map);

	// 변경된 용역계약서 상세 중 전,후 모든 기성단계 출력 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageChangeGiseong(Map<String, Object> map);
	// 변경된 용역계약서 상세 중 변겅 전 기성단계 출력 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageChangeGiseongBefore(Map<String, Object> map);
	// 변경된 용역계약서 상세 중 변경 후 기성단계 출력 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageChangeGiseongAfter(Map<String, Object> map);
	
	// ====================================================== 용역계약서 현황 START ====================================================== 
	// 년도를 기준으로 월(Month)별로 계약 회수 조회 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageMonthHyunhwangCount(Map<String, Object> map);
	// 년도를 기준으로 부서별로 계약 회수 조회 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageOwnerHyunhwangCount(Map<String, Object> map);
	// 년도를 기준으로 월별로 계약 회수 조회 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageMonthHyunhwangSangse(Map<String, Object> map);
	// 년도를 기준으로 부서별로 계약 리스트 조회 쿼리를 호출하는 메서드
	List<Map<String, Object>> getProjectManageOwnerHyunhwangSangse(Map<String, Object> map);
	// ====================================================== 용역계약서 현황 END ====================================================== 
}
