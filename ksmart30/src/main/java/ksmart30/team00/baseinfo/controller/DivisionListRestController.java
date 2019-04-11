/*
 * @file    DivisionListRestController.java
 * @brief   division rest controller
 * @author  ksmart30 임명심
 */

package ksmart30.team00.baseinfo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team00.baseinfo.service.DivisionListService;

@RestController
public class DivisionListRestController {
	
	@Autowired DivisionListService divisionListService;
	
	//10.2.2. 예산서 인건비 및 배부 단가표
	@PostMapping("/baseInfo/divisionListView")
	public Map<String,Object> divisionListView(String REG_YYMM) {
		System.out.println("/baseInfo/divisionListView restcontroller 예산서 인건비 및 배부 단가표 post요청");
		System.out.println(REG_YYMM+"회계연도 값 확인 rest controller");
		return divisionListService.divisionListSelect(REG_YYMM);
	}
}
