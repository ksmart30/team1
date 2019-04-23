package ksmart30.team01.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.project.domain.SonikProjectCodeSearch;

@Mapper
public interface ProjectSonikMapper {
	//프로젝트 예산,실적대비표 리스트화면을 보여주기위한 메서드 (예산)
	List<Map<String, Object>> projectSonikListSearch(String PJT_CD);
	
	//프로젝트 예산,실적대비표_왼쪽 상단 검색 조건에서 프로젝트 코드를 조회하는 메서드
	List<Map<String, Object>> projectCodeSearch(SonikProjectCodeSearch jogun);

	// 프로젝트 예산,실적대비표  상세내역
	Map<String, Object> SonikContrastSangse(String PJT_CD); 
	
	// 프로젝트 예산,실적대비표 _제조경비2 상세화면을 위한 메서드(계정과목, 예산)
	 List<Map<String, Object>> jejo2YesanSearch(String PJT_CD);

	//프로젝트 예산,실적대비표 _제조경비1 상세화면을 위한 메서드(계정과목, 예산)
	List<Map<String, Object>> jejo1YesanSearch(String PJT_CD); 
	
	//프로젝트 개요를 검색하는 메서드
	Map<String, Object> projectGeyo(String PJT_CD);
}
