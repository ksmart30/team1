/*
 * @file	ProjectManageMapper.java
 * @brief   용역계약서 Mapper
 * @author  ksmart30 YDE
 */
package ksmart30.team01.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectManageMapper {
	// 전체 프로젝트 대장을 검색하는 쿼리를 호출하는 메서드이다
	List<Map<String, Object>> businessManageSelect(Map<String, Object> searchMap);
}
