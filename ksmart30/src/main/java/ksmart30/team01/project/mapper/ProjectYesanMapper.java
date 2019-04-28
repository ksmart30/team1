package ksmart30.team01.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.project.domain.ProjectYesanSearchRequest;
import ksmart30.team01.project.domain.ProjectYesanWorkStepLogRequest;
import ksmart30.team01.project.domain.ProjectSangseRequest;
import ksmart30.team01.project.domain.ProjectYesanListRequest;
import ksmart30.team01.project.domain.ProjectYesanOutputCodeSearch;
import ksmart30.team01.project.domain.ProjectYesanOutputListRequest;

@Mapper
public interface ProjectYesanMapper {
	//2.2.1. 프로젝트예산을 입력하기 전 승인된 용역계약서의 목록을 보여줌
	List<Map<String, Object>> getProjcetYesanSearchList(ProjectYesanSearchRequest projectYesanSearchRequest);

	//2.2.1. 프로젝트코드를 입력받아 프로젝트 개요를 보여줌(발주처 제외)
	Map<String, Object> getProjectYesanSangse(String PJT_CD);

	//2.2.1. 프로젝트코드를 입력받아 프로젝트 개요 중 발주처를 보여줌
	List<Map<String, Object>> getProjectYesanSangseCustNm(String PJT_CD);
	
	//2.2.1.1. 프로젝트코드를 입력받아 프로젝트 상세내용 중 일정계획을 보여줌
	List<Map<String, Object>> getProjectYesanSangseWorkStep(String PJT_CD);
	
	//2.2.1.1.1 일정계획에서 변경횟수가 2회 이상인 경우 변경내역을 보여주는 요청
	List<Map<String, Object>> getProjectYesanViewWorkStepLog(ProjectYesanWorkStepLogRequest projectYesanWorkStepLogRequest);	
	
	//2.2.1.2. 프로젝트코드를 입력받아 프로젝트 상세내용 중 MH계획을 보여줌
	List<Map<String, Object>> getProjectYesanSangseMH(String PJT_CD);

	//2.2.1.2.1 MH계획에서 인건비소계와 점유율을 조회	
	Map<String, Object> getProjectYesanSangseMHTotal(String PJT_CD);
	
	//2.2.1.3. 프로젝트코드를 입력받아 프로젝트 상세내용 중 제조경비1 오른쪽을 보여줌
	List<Map<String, Object>> getProjectYesanSangseJejo1R(String PJT_CD);
	
	//2.2.1.3. 프로젝트코드를 입력받아 프로젝트 상세내용 중 제조경비1 왼쪽을 보여줌
	List<Map<String, Object>> getProjectYesanSangseJejo1L(String PJT_CD);

	//2.1.1.4. 프로젝트코드를 입력받아 제조경비2를 보여줌
	List<Map<String, Object>> getProjectYesanSangseJejo2(String PJT_CD);

	//2.2.1.5. 프로젝트코드를 입력받아 기성단계를 보여줌
	List<Map<String, Object>> getProjectYesanSangseGiseong(String PJT_CD);
	
	//2.2.1.6. 프로젝트코드를 입력받아 추정손익계산서를 보여줌(사업성검토제외)
	Map<String, Object> getProjectYesanSangseSonik(String PJT_CD);

	//2.2.1.6. 프로젝트코드를 입력받아 추정손익계산서를 보여줌(사업성검토)
	Map<String, Object> getProjectYesanSangseSonikBiz(String PJT_CD);

	//2.2.2. 프로젝트코드에 해당하는 프로젝트예산을 승인을 입력함
	int modifyProjectYesanSeungin(String PJT_CD);	

	//2.2.2. 프로젝트코드에 해당하는 프로젝트예산 승인 취소하는 요청
	int modifyProjectYesanSeunginCancel(String PJT_CD);
	
	//2.2.3. 프로젝트예산 출력을 위한 프로젝트리스트 조회		
	List<Map<String, Object>> getprojectYesanOutputList(ProjectYesanOutputListRequest projectYesanOutputListRequest);
	
	//2.2.3.1 프로젝트예산 출력하기 위해 조건에 맞는 프로젝트를 검색하는 메서드
	List<Map<String, Object>> getProjectYesanOutputPjtList(ProjectYesanOutputCodeSearch projectYesanOutputCodeSearch);

	//2.2.4. 승인한 프로젝트예산을 조건별로 검색하는 메서드
	List<Map<String, Object>> getProjectYesanSearch();

	//2.2.4.1. 발주처 검색 modal
	List<Map<String, Object>> getProjectYesanCustList(String column, String columnValue);
	
	//2.2.5. 계약프로젝트List 조회하는 메서드
	List<Map<String, Object>> getProjectYesanList(ProjectYesanListRequest projectYesanListRequest);
















	



}
