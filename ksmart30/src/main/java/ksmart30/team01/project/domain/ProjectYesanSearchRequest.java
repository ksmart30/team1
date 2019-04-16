package ksmart30.team01.project.domain;

public class ProjectYesanSearchRequest {
	private String CONTRACT_DATE;
	private String DEPT_CD;
	private String PJT_CD;
	private String radioValue;
	
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public String getRadioValue() {
		return radioValue;
	}
	public void setRadioValue(String radioValue) {
		this.radioValue = radioValue;
	}	
	public String getCONTRACT_DATE() {
		return CONTRACT_DATE;
	}
	public void setCONTRACT_DATE(String cONTRACT_DATE) {
		CONTRACT_DATE = cONTRACT_DATE;
	}
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
	}
	
	@Override
	public String toString() {
		return "ProjectYesanSearchRequest [CONTRACT_DATE=" + CONTRACT_DATE + ", DEPT_CD=" + DEPT_CD + ", PJT_CD="
				+ PJT_CD + ", radioValue=" + radioValue + "]";
	}

}
