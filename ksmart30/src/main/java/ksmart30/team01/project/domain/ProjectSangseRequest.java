/*
 * @file    T_P11000.java
 * @brief   project yesan vo
 * @author  ksmart30 임명심
 */

package ksmart30.team01.project.domain;

public class ProjectSangseRequest {
	private String CUST_NM; 	//발주처
	private String PJT_CD;		//프로젝트 코드, 프로젝트명 조인해서 가져와야
	private String BUILD_TYPE;	//건축물 유형
	private String BUILD_GB;	//건축물 유형 둘 중에 하나 조인해서 가져와야
	private String DEPT_CD;		//부서 코드, 부서명 조인해서 가져와야
	private String PM_EMP_NO; 	//PM, 이름은 조인해서 가져와야
	private String CONTRACT_DATE; //계약일자
	private String CRT_DATE;	//계약일자()
	private String UPD_DATE;	//계약일자()
	private String CONTRACT_PRI1; //계약기간1
	private String CONTRACT_PRI2; //계약기간2
	//용역완료시까지
	private int PJT_CONTRACT_AMT; //당사계약금액
	private int TOT_CONTRACT_AMT; //당사계약금액
	//대지위치 우편번호
	private String PJT_ADDR;	//대지위치
	private int G_AREA_P;		//대지면적
	private int G_AREA_M;		//평
	private int G_YAREA_P;		//연면적
	private int G_YAREA_M;		//평
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
	}
	public String getBUILD_TYPE() {
		return BUILD_TYPE;
	}
	public void setBUILD_TYPE(String bUILD_TYPE) {
		BUILD_TYPE = bUILD_TYPE;
	}
	public String getBUILD_GB() {
		return BUILD_GB;
	}
	public void setBUILD_GB(String bUILD_GB) {
		BUILD_GB = bUILD_GB;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public String getPM_EMP_NO() {
		return PM_EMP_NO;
	}
	public void setPM_EMP_NO(String pM_EMP_NO) {
		PM_EMP_NO = pM_EMP_NO;
	}
	public String getCONTRACT_DATE() {
		return CONTRACT_DATE;
	}
	public void setCONTRACT_DATE(String cONTRACT_DATE) {
		CONTRACT_DATE = cONTRACT_DATE;
	}
	public String getCRT_DATE() {
		return CRT_DATE;
	}
	public void setCRT_DATE(String cRT_DATE) {
		CRT_DATE = cRT_DATE;
	}
	public String getUPD_DATE() {
		return UPD_DATE;
	}
	public void setUPD_DATE(String uPD_DATE) {
		UPD_DATE = uPD_DATE;
	}
	public String getCONTRACT_PRI1() {
		return CONTRACT_PRI1;
	}
	public void setCONTRACT_PRI1(String cONTRACT_PRI1) {
		CONTRACT_PRI1 = cONTRACT_PRI1;
	}
	public String getCONTRACT_PRI2() {
		return CONTRACT_PRI2;
	}
	public void setCONTRACT_PRI2(String cONTRACT_PRI2) {
		CONTRACT_PRI2 = cONTRACT_PRI2;
	}
	public int getPJT_CONTRACT_AMT() {
		return PJT_CONTRACT_AMT;
	}
	public void setPJT_CONTRACT_AMT(int pJT_CONTRACT_AMT) {
		PJT_CONTRACT_AMT = pJT_CONTRACT_AMT;
	}
	public int getTOT_CONTRACT_AMT() {
		return TOT_CONTRACT_AMT;
	}
	public void setTOT_CONTRACT_AMT(int tOT_CONTRACT_AMT) {
		TOT_CONTRACT_AMT = tOT_CONTRACT_AMT;
	}
	public String getPJT_ADDR() {
		return PJT_ADDR;
	}
	public void setPJT_ADDR(String pJT_ADDR) {
		PJT_ADDR = pJT_ADDR;
	}
	public int getG_AREA_P() {
		return G_AREA_P;
	}
	public void setG_AREA_P(int g_AREA_P) {
		G_AREA_P = g_AREA_P;
	}
	public int getG_AREA_M() {
		return G_AREA_M;
	}
	public void setG_AREA_M(int g_AREA_M) {
		G_AREA_M = g_AREA_M;
	}
	public int getG_YAREA_P() {
		return G_YAREA_P;
	}
	public void setG_YAREA_P(int g_YAREA_P) {
		G_YAREA_P = g_YAREA_P;
	}
	public int getG_YAREA_M() {
		return G_YAREA_M;
	}
	public void setG_YAREA_M(int g_YAREA_M) {
		G_YAREA_M = g_YAREA_M;
	}
	@Override
	public String toString() {
		return "T_P11000 [PJT_CD=" + PJT_CD + ", BUILD_TYPE=" + BUILD_TYPE + ", BUILD_GB=" + BUILD_GB + ", DEPT_CD="
				+ DEPT_CD + ", PM_EMP_NO=" + PM_EMP_NO + ", CONTRACT_DATE=" + CONTRACT_DATE + ", CRT_DATE=" + CRT_DATE
				+ ", UPD_DATE=" + UPD_DATE + ", CONTRACT_PRI1=" + CONTRACT_PRI1 + ", CONTRACT_PRI2=" + CONTRACT_PRI2
				+ ", PJT_CONTRACT_AMT=" + PJT_CONTRACT_AMT + ", TOT_CONTRACT_AMT=" + TOT_CONTRACT_AMT + ", PJT_ADDR="
				+ PJT_ADDR + ", G_AREA_P=" + G_AREA_P + ", G_AREA_M=" + G_AREA_M + ", G_YAREA_P=" + G_YAREA_P
				+ ", G_YAREA_M=" + G_YAREA_M + "]";
	}
	
}
