package ksmart30.team01.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.project.domain.ProjectYesanSearchRequest;
import ksmart30.team01.project.domain.ProjectSangseRequest;

@Mapper
public interface ProjectYesanMapper {
	//2.2.1 프로젝트예산을 입력하기 전 승인된 용역계약서의 목록을 보여줌
	List<Map<String, Object>> getProjcetYesanSearchList(ProjectYesanSearchRequest projectYesanSearchRequest);

	//2.2.1.1 프로젝트코드를 입력받아 프로젝트 개요를 보여줌(발주처 제외)
	Map<String, Object> getProjectYesanSangse(String PJT_CD);

	//2.2.1.2 프로젝트코드를 입력받아 프로젝트 개요 중 발주처를 보여줌
	List<Map<String, Object>> getProjectYesanSangseCustNm(String PJT_CD);
	
}
