package ksmart30.team01.business.service;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.business.domain.BusinessMarket;
import ksmart30.team01.business.mapper.BusinessManageMapper;

@Service
public class BusinessManageService {
	@Autowired
	BusinessManageMapper businessManageMapper;

	// 1.1.3 사업수행 승인현황
	public List<Map<String, Object>> businessManageSelect(BusinessMarket vo) {
		return businessManageMapper.getBusinessManageList(vo);

	}

	// 1.1.1사업수행결정서 프로젝트 리스트 좌측
	public List<Map<String, Object>> businessManageViewSelect(BusinessMarket vo) {
		return businessManageMapper.getBusinessManageViewList(vo);

	}

	// 1.1.1사업수행결정서(승인)프로젝트목록 클릭시 우측에 검색
	public Map<String, Object> businessManageView(BusinessMarket vo) {
		return businessManageMapper.getBusinessManageView(vo);
	}
	// 거래처 코드
	public List<Map<String,String>> CustCode(String cust){
		List<Map<String,String>> list = businessManageMapper.CustCodeList(cust);
		
		return list;
	}
	// 부서 코드
	public List<Map<String,String>> DeptCode(String dept){
		List<Map<String,String>> list = businessManageMapper.DeptCodeList(dept);
		
		return list;
	}
	// 사업수행결정서 저장
	public void businessManageViewInsert(BusinessMarket vo) {
		 String Gubun = vo.getBIZ_GBN(); //프로젝트 타입 
		 String BUSI_SEQ = "";
		 
		if(Gubun.equals("10")) {
			vo.setPJT_TYPE("F");
		}else if(Gubun.equals("16")){
			vo.setPJT_TYPE("F");
		}else {
			vo.setPJT_TYPE("C");  //BUSI_SEQ
		}
		BUSI_SEQ = businessManageMapper.numUp();  //일련번호 자동증가 
		vo.setBUSI_SEQ("00"+BUSI_SEQ);
	
		businessManageMapper.businessManageViewInsert(vo);
		
	}



}
