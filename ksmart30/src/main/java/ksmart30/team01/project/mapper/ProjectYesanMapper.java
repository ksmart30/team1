package ksmart30.team01.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.project.domain.T_P11000;

@Mapper
public interface ProjectYesanMapper {
	//프로젝트예산을 입력하기 전 승인된 용역계약서의 목록을 보여줌(검색 조건 없이 리스트만 우선 뿌려보자)
	List<Map<String, Object>> list();
	
	//프로젝트코드를 입력받아 프로젝트 개요를 보여줌(리스트일 필요 없음 수정 필요)
	List<T_P11000> selectList(String pjt_cd);
}
