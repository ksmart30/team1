package ksmart30.team01.project.domain;

// P_T11000
public class Project {
	private String PJT_CD;				// 프로젝트 코드
	private String DEPT_CD;				// 부서 코드
	private String PM_EMP_NO;			// 프로젝트 PM
	private String CONTRACT_DATE;		// 계약일자
	private String CONTRACT_PRI1;		// 계약시작
	private String CONTRACT_PRI2;		// 계약종료
	private String CONTRACT_PRI3;		// 종료단서
	private String CUST_GBN;			// 발주처구분
	private String TOT_CONTRACT_AMT;	// 프로젝트총계약액
	private String PJT_CONTRACT_AMT;	// 프로젝트총계약액
	private String CHANGE_AMT;			// 변경가감액
	private String SURTAX;				// 부가세여부
	private String PYUNG_DAN;			// 평당단가
	private String G_AREA_P;			// 계약면적_평
	private String G_AREA_M;			// 계약면적_M
	private String G_YAREA_P;			// 계약연면적_평
	private String G_YAREA_M;			// 계약연면적_M
	private String J_AREA_P;			// 정산면적_평
	private String J_AREA_M;			// 정산면적_M
	private String J_YAREA_P;			// 정산연면적_평
	private String J_YAREA_M;			// 정산연면적_M
	private String DONG_SU;				// 동수
	private String B_UP_SU;				// 지상층수
	private String B_DOWN_SU;			// 지하층수
	private String HOUSE_SU;			// 세대수
	private String ZIP_CD;				// 우편번호
	private String PJT_ADDR;			// 지번
	private String REGION;				// 지역
	private String ZONE1;				// 지구1
	private String ZONE2;				// 지구2
	private String ZONE3;				// 지구3
	private String R_SITE1;				// 유관기관1
	private String R_SITE2;				// 유관기관2
	private String R_SITE3;				// 유관기관3
	private String CONTRACT_GBN;
	private String SVC_GBN;
	private String CONTRACT_ITEM;
	private String ROOT_PJT;
	private String CONTRACT_TYPE;
	private String BUILD_TYPE;
	private String BUILD_IBJI;
	private String BUILD_STRUCT;
	private String PJT_E_GBN;
	private String PJT_E_DATE;
	private String BREAK_AMT;
	private String PJT_NIC;
	private String BILL_COND;
	private String BILL_DAY;
	private String PJT_YEA_YN;
	private String PJT_YEA_DATE;
	private String CRT_MAN;
	private String CRT_DATE;
	private String UPD_MAN;
	private String UPD_DATE;
	private String BALANCE_AMT;
	private String VAT_GB;
	private String EMP_NO;
	private String MARKET_MAN;
	private String INFO_EMP_NO;
	private String DESIGN_MAN;
	private String REGION2;
	private String REGION3;
	private String SCOPE1;
	private String SCOPE2;
	private String SCOPE3;
	private String PJT_BOND;
	private String BUILD_GB;
	private String PRINT_YN;
	private String PRINT_CNT;
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
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
	public String getCONTRACT_PRI3() {
		return CONTRACT_PRI3;
	}
	public void setCONTRACT_PRI3(String cONTRACT_PRI3) {
		CONTRACT_PRI3 = cONTRACT_PRI3;
	}
	public String getCUST_GBN() {
		return CUST_GBN;
	}
	public void setCUST_GBN(String cUST_GBN) {
		CUST_GBN = cUST_GBN;
	}
	public String getTOT_CONTRACT_AMT() {
		return TOT_CONTRACT_AMT;
	}
	public void setTOT_CONTRACT_AMT(String tOT_CONTRACT_AMT) {
		TOT_CONTRACT_AMT = tOT_CONTRACT_AMT;
	}
	public String getPJT_CONTRACT_AMT() {
		return PJT_CONTRACT_AMT;
	}
	public void setPJT_CONTRACT_AMT(String pJT_CONTRACT_AMT) {
		PJT_CONTRACT_AMT = pJT_CONTRACT_AMT;
	}
	public String getCHANGE_AMT() {
		return CHANGE_AMT;
	}
	public void setCHANGE_AMT(String cHANGE_AMT) {
		CHANGE_AMT = cHANGE_AMT;
	}
	public String getSURTAX() {
		return SURTAX;
	}
	public void setSURTAX(String sURTAX) {
		SURTAX = sURTAX;
	}
	public String getPYUNG_DAN() {
		return PYUNG_DAN;
	}
	public void setPYUNG_DAN(String pYUNG_DAN) {
		PYUNG_DAN = pYUNG_DAN;
	}
	public String getG_AREA_P() {
		return G_AREA_P;
	}
	public void setG_AREA_P(String g_AREA_P) {
		G_AREA_P = g_AREA_P;
	}
	public String getG_AREA_M() {
		return G_AREA_M;
	}
	public void setG_AREA_M(String g_AREA_M) {
		G_AREA_M = g_AREA_M;
	}
	public String getG_YAREA_P() {
		return G_YAREA_P;
	}
	public void setG_YAREA_P(String g_YAREA_P) {
		G_YAREA_P = g_YAREA_P;
	}
	public String getG_YAREA_M() {
		return G_YAREA_M;
	}
	public void setG_YAREA_M(String g_YAREA_M) {
		G_YAREA_M = g_YAREA_M;
	}
	public String getJ_AREA_P() {
		return J_AREA_P;
	}
	public void setJ_AREA_P(String j_AREA_P) {
		J_AREA_P = j_AREA_P;
	}
	public String getJ_AREA_M() {
		return J_AREA_M;
	}
	public void setJ_AREA_M(String j_AREA_M) {
		J_AREA_M = j_AREA_M;
	}
	public String getJ_YAREA_P() {
		return J_YAREA_P;
	}
	public void setJ_YAREA_P(String j_YAREA_P) {
		J_YAREA_P = j_YAREA_P;
	}
	public String getJ_YAREA_M() {
		return J_YAREA_M;
	}
	public void setJ_YAREA_M(String j_YAREA_M) {
		J_YAREA_M = j_YAREA_M;
	}
	public String getDONG_SU() {
		return DONG_SU;
	}
	public void setDONG_SU(String dONG_SU) {
		DONG_SU = dONG_SU;
	}
	public String getB_UP_SU() {
		return B_UP_SU;
	}
	public void setB_UP_SU(String b_UP_SU) {
		B_UP_SU = b_UP_SU;
	}
	public String getB_DOWN_SU() {
		return B_DOWN_SU;
	}
	public void setB_DOWN_SU(String b_DOWN_SU) {
		B_DOWN_SU = b_DOWN_SU;
	}
	public String getHOUSE_SU() {
		return HOUSE_SU;
	}
	public void setHOUSE_SU(String hOUSE_SU) {
		HOUSE_SU = hOUSE_SU;
	}
	public String getZIP_CD() {
		return ZIP_CD;
	}
	public void setZIP_CD(String zIP_CD) {
		ZIP_CD = zIP_CD;
	}
	public String getPJT_ADDR() {
		return PJT_ADDR;
	}
	public void setPJT_ADDR(String pJT_ADDR) {
		PJT_ADDR = pJT_ADDR;
	}
	public String getREGION() {
		return REGION;
	}
	public void setREGION(String rEGION) {
		REGION = rEGION;
	}
	public String getZONE1() {
		return ZONE1;
	}
	public void setZONE1(String zONE1) {
		ZONE1 = zONE1;
	}
	public String getZONE2() {
		return ZONE2;
	}
	public void setZONE2(String zONE2) {
		ZONE2 = zONE2;
	}
	public String getZONE3() {
		return ZONE3;
	}
	public void setZONE3(String zONE3) {
		ZONE3 = zONE3;
	}
	public String getR_SITE1() {
		return R_SITE1;
	}
	public void setR_SITE1(String r_SITE1) {
		R_SITE1 = r_SITE1;
	}
	public String getR_SITE2() {
		return R_SITE2;
	}
	public void setR_SITE2(String r_SITE2) {
		R_SITE2 = r_SITE2;
	}
	public String getR_SITE3() {
		return R_SITE3;
	}
	public void setR_SITE3(String r_SITE3) {
		R_SITE3 = r_SITE3;
	}
	public String getCONTRACT_GBN() {
		return CONTRACT_GBN;
	}
	public void setCONTRACT_GBN(String cONTRACT_GBN) {
		CONTRACT_GBN = cONTRACT_GBN;
	}
	public String getSVC_GBN() {
		return SVC_GBN;
	}
	public void setSVC_GBN(String sVC_GBN) {
		SVC_GBN = sVC_GBN;
	}
	public String getCONTRACT_ITEM() {
		return CONTRACT_ITEM;
	}
	public void setCONTRACT_ITEM(String cONTRACT_ITEM) {
		CONTRACT_ITEM = cONTRACT_ITEM;
	}
	public String getROOT_PJT() {
		return ROOT_PJT;
	}
	public void setROOT_PJT(String rOOT_PJT) {
		ROOT_PJT = rOOT_PJT;
	}
	public String getCONTRACT_TYPE() {
		return CONTRACT_TYPE;
	}
	public void setCONTRACT_TYPE(String cONTRACT_TYPE) {
		CONTRACT_TYPE = cONTRACT_TYPE;
	}
	public String getBUILD_TYPE() {
		return BUILD_TYPE;
	}
	public void setBUILD_TYPE(String bUILD_TYPE) {
		BUILD_TYPE = bUILD_TYPE;
	}
	public String getBUILD_IBJI() {
		return BUILD_IBJI;
	}
	public void setBUILD_IBJI(String bUILD_IBJI) {
		BUILD_IBJI = bUILD_IBJI;
	}
	public String getBUILD_STRUCT() {
		return BUILD_STRUCT;
	}
	public void setBUILD_STRUCT(String bUILD_STRUCT) {
		BUILD_STRUCT = bUILD_STRUCT;
	}
	public String getPJT_E_GBN() {
		return PJT_E_GBN;
	}
	public void setPJT_E_GBN(String pJT_E_GBN) {
		PJT_E_GBN = pJT_E_GBN;
	}
	public String getPJT_E_DATE() {
		return PJT_E_DATE;
	}
	public void setPJT_E_DATE(String pJT_E_DATE) {
		PJT_E_DATE = pJT_E_DATE;
	}
	public String getBREAK_AMT() {
		return BREAK_AMT;
	}
	public void setBREAK_AMT(String bREAK_AMT) {
		BREAK_AMT = bREAK_AMT;
	}
	public String getPJT_NIC() {
		return PJT_NIC;
	}
	public void setPJT_NIC(String pJT_NIC) {
		PJT_NIC = pJT_NIC;
	}
	public String getBILL_COND() {
		return BILL_COND;
	}
	public void setBILL_COND(String bILL_COND) {
		BILL_COND = bILL_COND;
	}
	public String getBILL_DAY() {
		return BILL_DAY;
	}
	public void setBILL_DAY(String bILL_DAY) {
		BILL_DAY = bILL_DAY;
	}
	public String getPJT_YEA_YN() {
		return PJT_YEA_YN;
	}
	public void setPJT_YEA_YN(String pJT_YEA_YN) {
		PJT_YEA_YN = pJT_YEA_YN;
	}
	public String getPJT_YEA_DATE() {
		return PJT_YEA_DATE;
	}
	public void setPJT_YEA_DATE(String pJT_YEA_DATE) {
		PJT_YEA_DATE = pJT_YEA_DATE;
	}
	public String getCRT_MAN() {
		return CRT_MAN;
	}
	public void setCRT_MAN(String cRT_MAN) {
		CRT_MAN = cRT_MAN;
	}
	public String getCRT_DATE() {
		return CRT_DATE;
	}
	public void setCRT_DATE(String cRT_DATE) {
		CRT_DATE = cRT_DATE;
	}
	public String getUPD_MAN() {
		return UPD_MAN;
	}
	public void setUPD_MAN(String uPD_MAN) {
		UPD_MAN = uPD_MAN;
	}
	public String getUPD_DATE() {
		return UPD_DATE;
	}
	public void setUPD_DATE(String uPD_DATE) {
		UPD_DATE = uPD_DATE;
	}
	public String getBALANCE_AMT() {
		return BALANCE_AMT;
	}
	public void setBALANCE_AMT(String bALANCE_AMT) {
		BALANCE_AMT = bALANCE_AMT;
	}
	public String getVAT_GB() {
		return VAT_GB;
	}
	public void setVAT_GB(String vAT_GB) {
		VAT_GB = vAT_GB;
	}
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getMARKET_MAN() {
		return MARKET_MAN;
	}
	public void setMARKET_MAN(String mARKET_MAN) {
		MARKET_MAN = mARKET_MAN;
	}
	public String getINFO_EMP_NO() {
		return INFO_EMP_NO;
	}
	public void setINFO_EMP_NO(String iNFO_EMP_NO) {
		INFO_EMP_NO = iNFO_EMP_NO;
	}
	public String getDESIGN_MAN() {
		return DESIGN_MAN;
	}
	public void setDESIGN_MAN(String dESIGN_MAN) {
		DESIGN_MAN = dESIGN_MAN;
	}
	public String getREGION2() {
		return REGION2;
	}
	public void setREGION2(String rEGION2) {
		REGION2 = rEGION2;
	}
	public String getREGION3() {
		return REGION3;
	}
	public void setREGION3(String rEGION3) {
		REGION3 = rEGION3;
	}
	public String getSCOPE1() {
		return SCOPE1;
	}
	public void setSCOPE1(String sCOPE1) {
		SCOPE1 = sCOPE1;
	}
	public String getSCOPE2() {
		return SCOPE2;
	}
	public void setSCOPE2(String sCOPE2) {
		SCOPE2 = sCOPE2;
	}
	public String getSCOPE3() {
		return SCOPE3;
	}
	public void setSCOPE3(String sCOPE3) {
		SCOPE3 = sCOPE3;
	}
	public String getPJT_BOND() {
		return PJT_BOND;
	}
	public void setPJT_BOND(String pJT_BOND) {
		PJT_BOND = pJT_BOND;
	}
	public String getBUILD_GB() {
		return BUILD_GB;
	}
	public void setBUILD_GB(String bUILD_GB) {
		BUILD_GB = bUILD_GB;
	}
	public String getPRINT_YN() {
		return PRINT_YN;
	}
	public void setPRINT_YN(String pRINT_YN) {
		PRINT_YN = pRINT_YN;
	}
	public String getPRINT_CNT() {
		return PRINT_CNT;
	}
	public void setPRINT_CNT(String pRINT_CNT) {
		PRINT_CNT = pRINT_CNT;
	}
	@Override
	public String toString() {
		return "Project [PJT_CD=" + PJT_CD + ", DEPT_CD=" + DEPT_CD + ", PM_EMP_NO=" + PM_EMP_NO + ", CONTRACT_DATE="
				+ CONTRACT_DATE + ", CONTRACT_PRI1=" + CONTRACT_PRI1 + ", CONTRACT_PRI2=" + CONTRACT_PRI2
				+ ", CONTRACT_PRI3=" + CONTRACT_PRI3 + ", CUST_GBN=" + CUST_GBN + ", TOT_CONTRACT_AMT="
				+ TOT_CONTRACT_AMT + ", PJT_CONTRACT_AMT=" + PJT_CONTRACT_AMT + ", CHANGE_AMT=" + CHANGE_AMT
				+ ", SURTAX=" + SURTAX + ", PYUNG_DAN=" + PYUNG_DAN + ", G_AREA_P=" + G_AREA_P + ", G_AREA_M="
				+ G_AREA_M + ", G_YAREA_P=" + G_YAREA_P + ", G_YAREA_M=" + G_YAREA_M + ", J_AREA_P=" + J_AREA_P
				+ ", J_AREA_M=" + J_AREA_M + ", J_YAREA_P=" + J_YAREA_P + ", J_YAREA_M=" + J_YAREA_M + ", DONG_SU="
				+ DONG_SU + ", B_UP_SU=" + B_UP_SU + ", B_DOWN_SU=" + B_DOWN_SU + ", HOUSE_SU=" + HOUSE_SU + ", ZIP_CD="
				+ ZIP_CD + ", PJT_ADDR=" + PJT_ADDR + ", REGION=" + REGION + ", ZONE1=" + ZONE1 + ", ZONE2=" + ZONE2
				+ ", ZONE3=" + ZONE3 + ", R_SITE1=" + R_SITE1 + ", R_SITE2=" + R_SITE2 + ", R_SITE3=" + R_SITE3
				+ ", CONTRACT_GBN=" + CONTRACT_GBN + ", SVC_GBN=" + SVC_GBN + ", CONTRACT_ITEM=" + CONTRACT_ITEM
				+ ", ROOT_PJT=" + ROOT_PJT + ", CONTRACT_TYPE=" + CONTRACT_TYPE + ", BUILD_TYPE=" + BUILD_TYPE
				+ ", BUILD_IBJI=" + BUILD_IBJI + ", BUILD_STRUCT=" + BUILD_STRUCT + ", PJT_E_GBN=" + PJT_E_GBN
				+ ", PJT_E_DATE=" + PJT_E_DATE + ", BREAK_AMT=" + BREAK_AMT + ", PJT_NIC=" + PJT_NIC + ", BILL_COND="
				+ BILL_COND + ", BILL_DAY=" + BILL_DAY + ", PJT_YEA_YN=" + PJT_YEA_YN + ", PJT_YEA_DATE=" + PJT_YEA_DATE
				+ ", CRT_MAN=" + CRT_MAN + ", CRT_DATE=" + CRT_DATE + ", UPD_MAN=" + UPD_MAN + ", UPD_DATE=" + UPD_DATE
				+ ", BALANCE_AMT=" + BALANCE_AMT + ", VAT_GB=" + VAT_GB + ", EMP_NO=" + EMP_NO + ", MARKET_MAN="
				+ MARKET_MAN + ", INFO_EMP_NO=" + INFO_EMP_NO + ", DESIGN_MAN=" + DESIGN_MAN + ", REGION2=" + REGION2
				+ ", REGION3=" + REGION3 + ", SCOPE1=" + SCOPE1 + ", SCOPE2=" + SCOPE2 + ", SCOPE3=" + SCOPE3
				+ ", PJT_BOND=" + PJT_BOND + ", BUILD_GB=" + BUILD_GB + ", PRINT_YN=" + PRINT_YN + ", PRINT_CNT="
				+ PRINT_CNT + "]";
	}
}
