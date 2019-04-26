package ksmart30.team01.project.domain;

public class ProjectYesanOutputListRequest {
	private String START_DATE;
	private String END_DATE;
	private String DEPT_CD;
	private String PJT_CD;
	private String radioValue;

	public String getSTART_DATE() {
		return START_DATE;
	}

	public void setSTART_DATE(String START_DATE) {
		this.START_DATE = START_DATE;
	}

	public String getEND_DATE() {
		return END_DATE;
	}

	public void setEND_DATE(String END_DATE) {
		this.END_DATE = END_DATE;
	}

	public String getDEPT_CD() {
		return DEPT_CD;
	}

	public void setDEPT_CD(String DEPT_CD) {
		this.DEPT_CD = DEPT_CD;
	}

	public String getPJT_CD() {
		return PJT_CD;
	}

	public void setPJT_CD(String PJT_CD) {
		this.PJT_CD = PJT_CD;
	}		
	
	public String getRadioValue() {
		return radioValue;
	}

	public void setRadioValue(String radioValue) {
		this.radioValue = radioValue;
	}
	
	@Override
	public String toString() {
		return "ProjectYesanOutputListRequest [START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + ", DEPT_CD="
				+ DEPT_CD + ", PJT_CD=" + PJT_CD + ", radioValue=" + radioValue + "]";
	}
}
