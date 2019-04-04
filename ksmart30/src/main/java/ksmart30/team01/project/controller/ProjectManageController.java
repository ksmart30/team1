/*
 * @file	ProjectManageController.java
 * @brief   용역계약서 Controller
 * @author  ksmart30 YDE
 */
package ksmart30.team01.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectManageController {
	//3.1.1 용역계약서 입력 View
	@GetMapping("/project/projectManageView")
	public String projectManageView() {
		return "project/projectManageView";
	}
	
	//3.1.2 용역계약서 변경 입력 View
	@GetMapping("/project/projectManageChangeView")
	public String projectManageChangeIn() {
		return "/project/projectManageChangeView";
	}

	//3.1.3 용역계약서 변경 조회 View
	@GetMapping("/project/projectManageChangeListView")
	public String projectManageChangeListView() {
		return "project/projectManageChangeListView";
	}
	
	//3.1.4 용역계약서 검색(부서) View
	@GetMapping("/project/projectManageDepartSearchView")
	public String projectManageDepartSearchView() {
		return "project/projectManageDepartSearchView";
	}

	//3.1.5 용역계약서 검색(발주처) View
	@GetMapping("/project/projectManageClientSearchView")
	public String projectManageClientSearchView() {
		return "project/projectManageClientSearchView";
	}

	//3.1.6 용역계약서 현황 View
	@GetMapping("/project/projectManageHyunhwangView")
	public String projectManageHyunhwang() {
		return "project/projectManageHyunhwangView";
	}
}
