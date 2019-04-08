package ksmart30.team01.project.domain;

public class ProjectHistory {
	private String PJT_CD;
	private String PJT_NM;
	private String PJT_SEQ;
	private String PJT_DATE;
	private String PJT_GB;
	private String DEPT_CD;
	private String PM_EMP_NO;
	private String CHANGE_SAYU;
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
	}
	public String getPJT_NM() {
		return PJT_NM;
	}
	public void setPJT_NM(String pJT_NM) {
		PJT_NM = pJT_NM;
	}
	public String getPJT_SEQ() {
		return PJT_SEQ;
	}
	public void setPJT_SEQ(String pJT_SEQ) {
		PJT_SEQ = pJT_SEQ;
	}
	public String getPJT_DATE() {
		return PJT_DATE;
	}
	public void setPJT_DATE(String pJT_DATE) {
		PJT_DATE = pJT_DATE;
	}
	public String getPJT_GB() {
		return PJT_GB;
	}
	public void setPJT_GB(String pJT_GB) {
		PJT_GB = pJT_GB;
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
	public String getCHANGE_SAYU() {
		return CHANGE_SAYU;
	}
	public void setCHANGE_SAYU(String cHANGE_SAYU) {
		CHANGE_SAYU = cHANGE_SAYU;
	}
	@Override
	public String toString() {
		return "ProjectHistory [PJT_CD=" + PJT_CD + ", PJT_NM=" + PJT_NM + ", PJT_SEQ=" + PJT_SEQ + ", PJT_DATE="
				+ PJT_DATE + ", PJT_GB=" + PJT_GB + ", DEPT_CD=" + DEPT_CD + ", PM_EMP_NO=" + PM_EMP_NO
				+ ", CHANGE_SAYU=" + CHANGE_SAYU + "]";
	}
}
