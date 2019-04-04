/*
 * @file     ksmart30.team01.cooperation.Mapper.CooperationMapper.java
 * @brief    cooperation Mapper
 * @author   ksmart30 김동열
 */
package ksmart30.team01.cooperation.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.cooperation.domain.CooperationSearchRequest;

@Mapper
public interface CooperationMapper {
	
	// 외주관리 - 외주계약서관리 - 외주계약서 검색 - 리스트 요청
	List<Map<String,Object>> cooperationList(CooperationSearchRequest vo);
	
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - 1. PJT 에 따른 외주계약서 리스트 요청
	List<Map<String,Object>> cooperationInPJTSelect(String PJT_CD);
}
