package ksmart30.team01.business.domain;

public class BusinessMarket {
	
	private String BUSI_YY;  //년도
	private String UP_SU;		//지상층수
	private String UP_SU2;      //지상층수 검색때 필요
	private String YAREA_M;  
	private String YAREA_P;	 //연면적
	private String YAREA_P2;  //연면적 검색때 필요
	private String PJT_NM; // 프로젝트 이름
	private String DEPT_CD; // 부서
	private String PJT_CD; // 프로젝트 코드
	private String END_GBN; // HOLDING/CANCEL
	private String SVC; // PS1000 프로젝트 코드
	private String CUST_CD; //거래처 코드
	private String CUST_NM; //거래처 이름
	private String CUST_GBN; //거래처 구분
	private String BUSI_SEQ; //일련번호 순번
	private String BUSI_DATE; //의뢰일 
	private String CUST_CHARGE_NM; //거래처 담당자
	private String CUST_TEL; // 거래처 번호
	private String BIZ_TYPE; //수주구분 타입
	private String BIZ_GBN; // 수주구분
	private String BUILD_GB; // 사업분류
	private String ADDR; // 주소
	private String ZIP_CD; // 우편번호
	private String BUILD_TYPE; //건축물 용도
	private String REGION;  // 지역 지구 구역
	private String ZONE1;
	private String SCOPE1;
	private String REGION2;
	private String ZONE2;
	private String SCOPE2;
	private String DOWN_SU;
	private String H_CNT;
	private String AREA_M;
	private String AREA_P;
	private String COVERAGE;
	private String CAPACITY;
	
	public String getAREA_M() {
		return AREA_M;
	}
	public void setAREA_M(String aREA_M) {
		AREA_M = aREA_M;
	}
	public String getAREA_P() {
		return AREA_P;
	}
	public void setAREA_P(String aREA_P) {
		AREA_P = aREA_P;
	}
	public String getCOVERAGE() {
		return COVERAGE;
	}
	public void setCOVERAGE(String cOVERAGE) {
		COVERAGE = cOVERAGE;
	}
	public String getCAPACITY() {
		return CAPACITY;
	}
	public void setCAPACITY(String cAPACITY) {
		CAPACITY = cAPACITY;
	}
	public String getDOWN_SU() {
		return DOWN_SU;
	}
	public void setDOWN_SU(String dOWN_SU) {
		DOWN_SU = dOWN_SU;
	}
	public String getH_CNT() {
		return H_CNT;
	}
	public void setH_CNT(String h_CNT) {
		H_CNT = h_CNT;
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
	public String getSCOPE1() {
		return SCOPE1;
	}
	public void setSCOPE1(String sCOPE1) {
		SCOPE1 = sCOPE1;
	}
	public String getREGION2() {
		return REGION2;
	}
	public void setREGION2(String rEGION2) {
		REGION2 = rEGION2;
	}
	public String getZONE2() {
		return ZONE2;
	}
	public void setZONE2(String zONE2) {
		ZONE2 = zONE2;
	}
	public String getSCOPE2() {
		return SCOPE2;
	}
	public void setSCOPE2(String sCOPE2) {
		SCOPE2 = sCOPE2;
	}
	public String getBUILD_TYPE() {
		return BUILD_TYPE;
	}
	public void setBUILD_TYPE(String bUILD_TYPE) {
		BUILD_TYPE = bUILD_TYPE;
	}
	public String getZIP_CD() {
		return ZIP_CD;
	}
	public void setZIP_CD(String zIP_CD) {
		ZIP_CD = zIP_CD;
	}
	public String getADDR() {
		return ADDR;
	}
	public void setADDR(String aDDR) {
		ADDR = aDDR;
	}
	public String getBUILD_GB() {
		return BUILD_GB;
	}
	public void setBUILD_GB(String bUILD_GB) {
		BUILD_GB = bUILD_GB;
	}
	public String getBIZ_TYPE() {
		return BIZ_TYPE;
	}
	public void setBIZ_TYPE(String bIZ_TYPE) {
		BIZ_TYPE = bIZ_TYPE;
	}
	public String getBIZ_GBN() {
		return BIZ_GBN;
	}
	public void setBIZ_GBN(String bIZ_GBN) {
		BIZ_GBN = bIZ_GBN;
	}
	public String getCUST_GBN() {
		return CUST_GBN;
	}
	public void setCUST_GBN(String cUST_GBN) {
		CUST_GBN = cUST_GBN;
	}
	public String getCUST_CHARGE_NM() {
		return CUST_CHARGE_NM;
	}
	public void setCUST_CHARGE_NM(String cUST_CHARGE_NM) {
		CUST_CHARGE_NM = cUST_CHARGE_NM;
	}
	public String getCUST_TEL() {
		return CUST_TEL;
	}
	public void setCUST_TEL(String cUST_TEL) {
		CUST_TEL = cUST_TEL;
	}
	public String getBUSI_DATE() {
		return BUSI_DATE;
	}
	public void setBUSI_DATE(String bUSI_DATE) {
		BUSI_DATE = bUSI_DATE;
	}
	public String getYAREA_M() {
		return YAREA_M;
	}
	public void setYAREA_M(String yAREA_M) {
		YAREA_M = yAREA_M;
	}
	public String getBUSI_SEQ() {
		return BUSI_SEQ;
	}
	public void setBUSI_SEQ(String bUSI_SEQ) {
		BUSI_SEQ = bUSI_SEQ;
	}
	public String getCUST_NM() {
		return CUST_NM;
	}
	public void setCUST_NM(String cUST_NM) {
		CUST_NM = cUST_NM;
	}
	public String getSVC() {
		return SVC;
	}
	public void setSVC(String sVC) {
		SVC = sVC;
	}
	public String getCUST_CD() {
		return CUST_CD;
	}
	public void setCUST_CD(String cUST_CD) {
		CUST_CD = cUST_CD;
	}
	public String getEND_GBN() {
		return END_GBN;
	}
	public void setEND_GBN(String eND_GBN) {
		END_GBN = eND_GBN;
	}
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
	public String getPJT_NM() {
		return PJT_NM;
	}
	public void setPJT_NM(String pJT_NM) {
		PJT_NM = pJT_NM;
	}
	public String getUP_SU2() {
		return UP_SU2;
	}
	public void setUP_SU2(String uP_SU2) {
		UP_SU2 = uP_SU2;
	}
	public String getYAREA_P2() {
		return YAREA_P2;
	}
	public void setYAREA_P2(String yAREA_P2) {
		YAREA_P2 = yAREA_P2;
	}
	public String getBUSI_YY() {
		return BUSI_YY;
	}
	public void setBUSI_YY(String bUSI_YY) {
		BUSI_YY = bUSI_YY;
	}
	public String getUP_SU() {
		return UP_SU;
	}
	public void setUP_SU(String uP_SU) {
		UP_SU = uP_SU;
	}
	public String getYAREA_P() {
		return YAREA_P;
	}
	public void setYAREA_P(String yAREA_P) {
		YAREA_P = yAREA_P;
	}
	@Override
	public String toString() {
		return "BusinessMarket [BUSI_YY=" + BUSI_YY + ", UP_SU=" + UP_SU + ", UP_SU2=" + UP_SU2 + ", YAREA_M=" + YAREA_M
				+ ", YAREA_P=" + YAREA_P + ", YAREA_P2=" + YAREA_P2 + ", PJT_NM=" + PJT_NM + ", DEPT_CD=" + DEPT_CD
				+ ", PJT_CD=" + PJT_CD + ", END_GBN=" + END_GBN + ", SVC=" + SVC + ", CUST_CD=" + CUST_CD + ", CUST_NM="
				+ CUST_NM + ", CUST_GBN=" + CUST_GBN + ", BUSI_SEQ=" + BUSI_SEQ + ", BUSI_DATE=" + BUSI_DATE
				+ ", CUST_CHARGE_NM=" + CUST_CHARGE_NM + ", CUST_TEL=" + CUST_TEL + ", BIZ_TYPE=" + BIZ_TYPE
				+ ", BIZ_GBN=" + BIZ_GBN + ", BUILD_GB=" + BUILD_GB + ", ADDR=" + ADDR + ", ZIP_CD=" + ZIP_CD
				+ ", BUILD_TYPE=" + BUILD_TYPE + ", REGION=" + REGION + ", ZONE1=" + ZONE1 + ", SCOPE1=" + SCOPE1
				+ ", REGION2=" + REGION2 + ", ZONE2=" + ZONE2 + ", SCOPE2=" + SCOPE2 + "]";
	}
	
	

	

	

	
	
}
