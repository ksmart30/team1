package ksmart30.team01.project.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.project.domain.SonikProjectCodeSearch;
import ksmart30.team01.project.mapper.ProjectSonikMapper;

@Service
public class ProjectSonikService {
	@Autowired ProjectSonikMapper projectSonikMapper;
	
	//프로젝트 예산,실적대비표 리스트화면을 보여주기위한 메서드
	public List<Map<String, Object>> projectSonikList(String PJT_CD) {
		if(PJT_CD == null) {
			PJT_CD = "";
		}
		
		return projectSonikMapper.projectSonikListSearch(PJT_CD);
	}
	
	
	
	//상단의 검색기능에서 코드를 조건별로 검색하는 메서드
	public List<Map<String, Object>> projectSonikSearch(SonikProjectCodeSearch jogun) {
		
		
		return projectSonikMapper.projectCodeSearch(jogun);
	}


	/*
	 *제조경비2 상세화면을 위한 메서드(계정과목, 예산)
	 * public String projectSonikContrastJejo2View(String jejo2) {
	 * 
	 * return projectSonikMapper.jejo2YesanSearch(jejo2); }
	 */
}
