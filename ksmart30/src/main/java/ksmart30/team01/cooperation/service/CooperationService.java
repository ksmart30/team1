/*
 * @file     com.cafe24.ksmart30.team01.cooperation.service.CooperationService.java
 * @brief    cooperation service
 * @author   ksmart30 김동열
 */
package ksmart30.team01.cooperation.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.cooperation.Mapper.CooperationMapper;
import ksmart30.team01.cooperation.domain.CooperationSearchRequest;


@Service
public class CooperationService {
	@Autowired CooperationMapper cooperationMapper;
	
	//3.1.2 외주계약서 검색
	// 외주관리 - 외주계약서관리 - 외주계약서 검색 - 리스트 요청
	public List<Map<String,Object>> cooperationSelect(CooperationSearchRequest vo){
		return cooperationMapper.cooperationList(vo);
		
	}
	
	// 3.1.1 외주계약서 입력 - 조회
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - PJT 에 따른 외주계약서 리스트  및 예산현황 요청 
	public Map<String,Object> cooperationPJTYesanSelect(String PJT_CD){
		System.out.println("cooperationPJTYesanSelect 실행 시작");
		Map<String,Object> PJTYesanList = new HashMap<String, Object>();
		//1. PJT 에 따른 외주계약서 리스트 요청
		List<Map<String,Object>> cooperationSmallList = cooperationMapper.cooperationPJTSelect(PJT_CD);
		PJTYesanList.put("cooperationSmallList", cooperationSmallList);
		//2. PJT 에 따른 예산현황 리스트 요청
		List<Map<String,Object>> cooperationYesanList = cooperationMapper.cooperationYesanSelect(PJT_CD);
		PJTYesanList.put("cooperationYesanList", cooperationYesanList);
		//추후 합한 값 리턴값(PJTYesanList) 넘기기
		return PJTYesanList;
	}
}
