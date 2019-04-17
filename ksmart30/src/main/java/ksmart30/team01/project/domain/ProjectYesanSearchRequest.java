package ksmart30.team01.project.domain;

public class ProjectYesanSearchRequest {
	private String CONTRACT_DATE_INPUT;
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
	public String getCONTRACT_DATE_INPUT() {
		return CONTRACT_DATE_INPUT;
	}
	public void setCONTRACT_DATE_INPUT(String cONTRACT_DATE_INPUT) {
		CONTRACT_DATE_INPUT = cONTRACT_DATE_INPUT;
	}
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
	}
	
	@Override
	public String toString() {
		return "ProjectYesanSearchRequest [CONTRACT_DATE_INPUT=" + CONTRACT_DATE_INPUT + ", DEPT_CD=" + DEPT_CD + ", PJT_CD="
				+ PJT_CD + ", radioValue=" + radioValue + "]";
	}

}
