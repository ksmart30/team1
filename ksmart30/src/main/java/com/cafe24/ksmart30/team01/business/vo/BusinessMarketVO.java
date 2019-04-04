package com.cafe24.ksmart30.team01.business.vo;

public class BusinessMarketVO {
	
	private String BUSI_YY;  //년도
	private String UP_SU;      //지상층수
	private String YAREA_P;	 //연면적
	
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
		return "BusinessMarketVO [BUSI_YY=" + BUSI_YY + ", UP_SU=" + UP_SU + ", YAREA_P=" + YAREA_P + "]";
	}
	
}
