/*
 * @file     com.cafe24.ksmart30.team01.cooperation.Mapper.CooperationMapper.java
 * @brief    cooperation Mapper
 * @author   ksmart30 김동열
 */
package ksmart30.team01.cooperation.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.cooperation.domain.CooperationSearchRequest;
import ksmart30.team01.cooperation.domain.CooperationDragonHyunhwangRequest;
import ksmart30.team01.cooperation.domain.CooperationSangseRequest;

@Mapper
public interface CooperationMapper {

		// 3.1.1 외주계약서 입력 - 조회
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - 0. PJT 에 따른 외주계약서 리스트 요청
	List<Map<String,Object>> getCooperationPJT(String PJT_CD);
	
	// 3.1.1 외주계약서 입력 - 조회
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - 0. PJT 에 따른 예산현황 리스트 요청
	List<Map<String,Object>> getCooperationYesan(String PJT_CD);
	
	// 3.1.1 외주계약서 입력 - 조회
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - 0.계약프로젝트 기본 정보 검색(프로젝트,수행부서,PM)
	Map<String,Object> getCooperationPJTPM(String PJT_CD);
	
	// 3.1.1 외주계약서 입력 - 조회(상세)
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - 1-1외주 계약서 상세내역 가져오기
	Map<String,Object> getCooperationPJTSangse(CooperationSangseRequest vo);
	
	// 3.1.1 외주계약서 입력 - 조회(기성)
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - 1-2.외주 계약서 기성단계 가져오기
	List<Map<String,Object>> getCooperationPJTGisung(CooperationSangseRequest vo);
	
	// 3.1.1 외주계약서 입력 - 조회(용역)
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - 1-3.외주 계약서 용역내용 가져오기
	List<Map<String,Object>> getCooperationPJTDragon(CooperationSangseRequest vo);
	
	//3.1.2 외주계약서 검색
		// 외주관리 - 외주계약서관리 - 외주계약서 검색 - 리스트 요청
		List<Map<String,Object>> getCooperationList(CooperationSearchRequest vo);
		
	// 3.2.1외주비분석현황(용도별) -검색
	//3.외주관리 >  3.2외주비분석현황 >  3.2.1외주비분석현황(용도별)
	List<Map<String,Object>> getCooperationDragonHyunhwang(CooperationDragonHyunhwangRequest vo);
}
