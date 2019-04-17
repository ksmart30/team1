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
	private String BUSI_SEQ; //일련번호 순번
	private String BUSI_DATE; //의뢰일 
	
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
		return "BusinessMarket [BUSI_YY=" + BUSI_YY + ", UP_SU=" + UP_SU + ", UP_SU2=" + UP_SU2 + ", YAREA_P=" + YAREA_P
				+ ", YAREA_P2=" + YAREA_P2 + ", PJT_NM=" + PJT_NM + ", DEPT_CD=" + DEPT_CD + ", PJT_CD=" + PJT_CD
				+ ", END_GBN=" + END_GBN + "]";
	}

	

	

	
	
}
