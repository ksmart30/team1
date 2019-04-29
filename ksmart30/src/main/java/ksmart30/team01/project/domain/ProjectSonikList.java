package ksmart30.team01.project.domain;

public class ProjectSonikList {
	
	private String PJT_CD;
	private String DEPT_CD;
	private String CRT_DATE;
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String PJT_CD) {
		this.PJT_CD = PJT_CD;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String DEPT_CD) {
		this.DEPT_CD = DEPT_CD;
	}
	public String getCRT_DATE() {
		return CRT_DATE;
	}
	public void setCRT_DATE(String CRT_DATE) {
		this.CRT_DATE = CRT_DATE;
	}
	@Override
	public String toString() {
		return "projectSonikList [PJT_CD=" + PJT_CD + ", DEPT_CD=" + DEPT_CD + ", CRT_DATE=" + CRT_DATE + "]";
	}
}
