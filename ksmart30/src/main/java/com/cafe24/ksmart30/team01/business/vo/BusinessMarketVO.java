package com.cafe24.ksmart30.team01.business.vo;

public class BusinessMarketVO {
	
	private String BUSI_YY;  //년도
	private long UP_SU;      //지상층수
	private long YAREA_P;	 //연면적
	
	public String getBUSI_YY() {
		return BUSI_YY;
	}
	public void setBUSI_YY(String bUSI_YY) {
		BUSI_YY = bUSI_YY;
	}
	public long getUP_SU() {
		return UP_SU;
	}
	public void setUP_SU(long uP_SU) {
		UP_SU = uP_SU;
	}
	public long getYAREA_P() {
		return YAREA_P;
	}
	public void setYAREA_P(long yAREA_P) {
		YAREA_P = yAREA_P;
	}
	
	@Override
	public String toString() {
		return "BusinessMarketVO [BUSI_YY=" + BUSI_YY + ", UP_SU=" + UP_SU + ", YAREA_P=" + YAREA_P + "]";
	}
}
