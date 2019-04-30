package ksmart30.team01.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.project.domain.ProjectSonikIngun;
import ksmart30.team01.project.domain.ProjectSonikList;
import ksmart30.team01.project.domain.SonikProjectCodeSearch;
import ksmart30.team01.project.mapper.ProjectSonikMapper;

@Service
public class ProjectSonikService {
	@Autowired ProjectSonikMapper projectSonikMapper;
	
	// 2.3.4 프로젝트 예산,실적대비표 리스트화면을 보여주기위한 메서드
	public List<Map<String, Object>> projectSonikList(ProjectSonikList projectSonik) {
		if(projectSonik.getCRT_DATE().equals("")) {
			projectSonik.setCRT_DATE("999999999");
		}
		
		return projectSonikMapper.projectSonikListSearch(projectSonik);
	}
	
	// 2.3.4 프로젝트 예산,실적대비표 상단의 검색기능에서 코드를 조건별로 검색하는 메서드
	public List<Map<String, Object>> projectSonikSearch(SonikProjectCodeSearch jogun) {
			
		return projectSonikMapper.projectCodeSearch(jogun);
	}


	//2.3.4 프로젝트 예산,실적대비표  리스트에서 예산 상세버튼 클릭시 상세내용화면을 보여주는 메서드
	public Map<String, Object> projectSonikContrastSangseView(String PJT_CD) {
		return projectSonikMapper.SonikContrastSangse(PJT_CD);
	}


	//2.3.4 프로젝트 예산,실적대비표 리스트에서 제조경비2 상세화면을 위한 메서드(프로젝트 개요, 계정과목, 예산)
	 public List<Map<String, Object>> projectSonikContrastJejo2View(String PJT_CD) {
	 
	  return projectSonikMapper.jejo2YesanSearch(PJT_CD); 
	  }


	//2.3.4 프로젝트 예산,실적대비표 리스트에서 제조경비1 상세화면을 위한 메서드(프로젝트 개요, 계정과목, 예산)
	public Map<String, Object> projectSonikContrastJejo1View(String PJT_CD) {
		System.out.println("projectSonikContrastJejo1View Service왔나" + PJT_CD);
		
		List<Map<String, Object>> jejo1YesanSearch = projectSonikMapper.jejo1YesanSearch(PJT_CD);
		Map<String, Object> projectGeyo = projectSonikMapper.projectGeyo(PJT_CD);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("jejo1YesanSearch", jejo1YesanSearch);
		result.put("projectGeyo", projectGeyo);
		return result;
	}
	//2.3.2 프로젝트 인건비 입력을 위한 메서드
	public List<Map<String, Object>> projectSonikIngunbi(ProjectSonikIngun ingun) {
		
		return projectSonikMapper.sonikIngun(ingun);
	} 
}
