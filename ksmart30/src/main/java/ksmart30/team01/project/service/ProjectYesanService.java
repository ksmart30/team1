package ksmart30.team01.project.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.project.domain.T_P11000;
import ksmart30.team01.project.mapper.ProjectYesanMapper;

@Service
public class ProjectYesanService {
	@Autowired ProjectYesanMapper projectYesanMapper;
		
	//프로젝트예산을 입력하기 전 승인된 용역계약서의 목록을 보여줌
	public List<Map<String, Object>> search() {
		List<Map<String, Object>> resultList = projectYesanMapper.list();
		return resultList;
	}
	
	//프로젝트코드를 입력받아 프로젝트 개요를 보여줌
	public List<T_P11000> listSearch(String pjt_cd) {
		return projectYesanMapper.selectList(pjt_cd);
	}
}
