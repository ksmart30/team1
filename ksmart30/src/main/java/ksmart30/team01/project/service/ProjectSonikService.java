package ksmart30.team01.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.project.mapper.ProjectSonikMapper;

@Service
public class ProjectSonikService {
	@Autowired ProjectSonikMapper projectSonikMapper;
	
	/*
	 *제조경비2 상세화면을 위한 메서드(계정과목, 예산)
	 * public String projectSonikContrastJejo2View(String jejo2) {
	 * 
	 * return projectSonikMapper.jejo2YesanSearch(jejo2); }
	 */
}
