package ksmart30.team01.project.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.project.domain.SonikProjectCodeSearch;

@Mapper
public interface ProjectSonikMapper {

	List<Map<String, Object>> projectSonikListSearch(String PJT_CD);
	
	List<Map<String, Object>> projectCodeSearch(SonikProjectCodeSearch jogun);

	

	
	
	
	
	
	/* 제조경비2 상세화면을 위한 메서드(계정과목, 예산)
	 * String jejo2YesanSearch(String jejo2); */
	

}
