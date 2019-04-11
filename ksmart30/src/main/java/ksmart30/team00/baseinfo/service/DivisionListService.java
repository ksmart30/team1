/*
 * @file    DivisionListService.java
 * @brief   division rest service
 * @author  ksmart30 임명심
 */

package ksmart30.team00.baseinfo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.mapper.DivisionListMapper;

@Service
public class DivisionListService {
	
	@Autowired DivisionListMapper divisionListMapper;

	//10.2.2. 예산서 인건비 및 배부 단가표	
	public Map<String, Object> divisionListSelect(String REG_YYMM) {
		System.out.println("divisionListSelect 서비스");
		System.out.println(REG_YYMM+"회계연도 값 확인 service");
		
		//전체 리스트
		Map<String, Object> divisionList = new HashMap<String,Object>();
		
		//직급별 단가 리스트
		List<Map<String, Object>> jikgupDangaList = divisionListMapper.getJikgupDangaList(REG_YYMM);
		divisionList.put("jikgupDangaList", jikgupDangaList);
		
		//배부 단가 리스트
		Map<String, Object> divisionDangaList = divisionListMapper.getDivisionDangaList(REG_YYMM);
		divisionList.put("divisionDangaList", divisionDangaList);
		
		//제조경비1 단가 리스트
		List<Map<String, Object>> jejo1DangaList = divisionListMapper.getJejo1DangaList(REG_YYMM);
		divisionList.put("jejo1DangaList", jejo1DangaList);	
		
		return divisionList;
	}
	
	
}
