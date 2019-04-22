/*
 * @file     com.cafe24.ksmart30.team01.cooperation.service.CooperationService.java
 * @brief    cooperation service
 * @author   ksmart30 김동열
 */
package ksmart30.team01.cooperation.service;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.cooperation.domain.CooperationSearchRequest;
import ksmart30.team01.cooperation.mapper.CooperationMapper;
import ksmart30.team01.cooperation.domain.CooperationDragonHyunhwangRequest;
import ksmart30.team01.cooperation.domain.CooperationSangseRequest;


@Service
public class CooperationService {
	@Autowired CooperationMapper cooperationMapper;
	
	// 3.1.1 외주계약서 입력 - 조회
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - PJT 에 따른 외주계약서 리스트  및 예산현황 요청 
	public Map<String,Object> cooperationPJTYesanSelect(String PJT_CD){
		System.out.println("cooperationPJTYesanSelect 실행 시작");
		Map<String,Object> PJTYesanList = new HashMap<String, Object>();
		
		//1. PJT 에 따른 외주계약서 리스트 요청
		List<Map<String,Object>> cooperationSmallList = cooperationMapper.getCooperationPJT(PJT_CD);
		PJTYesanList.put("cooperationSmallList", cooperationSmallList);
		
		//2. PJT 에 따른 예산현황 리스트 요청
		List<Map<String,Object>> cooperationYesanList = cooperationMapper.getCooperationYesan(PJT_CD);
		PJTYesanList.put("cooperationYesanList", cooperationYesanList);
		
		//3. PJT 에 따른 계약프로젝트 기본 정보 검색(프로젝트,수행부서,PM)
		Map<String,Object> cooperationPJTPM = cooperationMapper.getCooperationPJTPM(PJT_CD);
		PJTYesanList.put("cooperationPJTPM",cooperationPJTPM);
		return PJTYesanList;
	}
	
	// 3.1.1 외주계약서 입력 - 조회
	// 외주관리 - 외주계약서관리 - 외주계약서 입력 - 외주계약서 상세내역 가져오기
	public Map<String,Object> cooperationPJTSangseSelect(CooperationSangseRequest vo){
		if(vo.getOUT_CORP() == null) {//입력값 null 일때 공백처리
			vo.setOUT_CORP("");
		}
		if(vo.getOUT_ITEM().length()<2) {//입력값이 1자리 수일때 앞에 0자 붙혀 2자리수로 만들기
			vo.setOUT_ITEM('0'+vo.getOUT_ITEM());
		}
		System.out.println("cooperationSangseSelect 실행 시작");
		Map<String,Object> cooperationPJTSangseGD = new HashMap<String, Object>();
		
		//1.용역계약서 상세내용 요청
		Map<String,Object> cooperationPJTSangse = cooperationMapper.getCooperationPJTSangse(vo);
		cooperationPJTSangseGD.put("cooperationPJTSangse", cooperationPJTSangse);
		
		//2.용역계약서 기성단계 요청
		List<Map<String,Object>> cooperationPJTGisung = cooperationMapper.getCooperationPJTGisung(vo);
		cooperationPJTSangseGD.put("cooperationPJTGisung", cooperationPJTGisung);
		
		//3.용역계약서 용역내용 요청
		List<Map<String,Object>> cooperationPJTDragon = cooperationMapper.getCooperationPJTDragon(vo);
		cooperationPJTSangseGD.put("cooperationPJTDragon", cooperationPJTDragon);
		
		return cooperationPJTSangseGD;	
	}
	
	
	//3.1.2 외주계약서 검색
	// 외주관리 - 외주계약서관리 - 외주계약서 검색 - 리스트 요청
	public List<Map<String,Object>> cooperationSelect(CooperationSearchRequest vo){
		return cooperationMapper.getCooperationList(vo);		
	}
	
	// 3.2.1외주비분석현황(용도별) 검색
	//3.외주관리 >  3.2외주비분석현황 >  3.2.1외주비분석현황(용도별)
	public List<Map<String,Object>> CooperationDragonHyunhwangSelect(CooperationDragonHyunhwangRequest vo){
		if(vo.getDG_P_STRAT().equals("")) {//입력값없을시 0 으로 셋팅
			vo.setDG_P_STRAT("0");
		}
		if(vo.getDG_P_END().equals("")) {//입력값없을시 99999999 MAX값으로 셋팅
			vo.setDG_P_END("99999999");
		}
		if(vo.getY_P_STRAT().equals("")) {
			vo.setY_P_STRAT("0");
		}
		if(vo.getY_P_END().equals("")) {
			vo.setY_P_END("99999999");
		}
				
		return cooperationMapper.getCooperationDragonHyunhwang(vo);		
	}
	
}
