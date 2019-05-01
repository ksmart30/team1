package ksmart30.team01.business.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.business.domain.BusinessMarket;

@Mapper
public interface BusinessManageMapper {
	
	//1.1.3 사업수행결정 승인현황
	List<Map<String,Object>> getBusinessManageList(BusinessMarket vo);
	
	//1.1.1 사업수행결정서 프로젝트 리스트 좌측
	List<Map<String,Object>> getBusinessManageViewList(BusinessMarket vo);

	//1.1.1 사업수행결정서(승인)프로젝트목록 클릭시 우측에 검색
	Map<String, Object> getBusinessManageView(BusinessMarket vo);
	
	//거래처 검색
	List<Map<String, String>> CustCodeList(String cust);
	
	//부서 검색
	List<Map<String, String>> DeptCodeList(String dept);
	
	//사원 검색
	List<Map<String,String>> ResultEmpList(Map<String,Object> searchMap);
	
	
	//사업수행결정서 저장
	void businessManageViewInsert(BusinessMarket vo);
	
	//사업수행결정서 삭제
	void businessManageViewDelete(BusinessMarket vo);
	
	//사업수행결정서 승인 업데이트및 저장
	void businessManageSeunginViewUpdate(BusinessMarket vo);
	void businessManageSeunginViewInsert1(BusinessMarket vo);
	void businessManageSeunginViewInsert2(BusinessMarket vo);
	
	
	//일련번호 증가 
	String numUp();
}
