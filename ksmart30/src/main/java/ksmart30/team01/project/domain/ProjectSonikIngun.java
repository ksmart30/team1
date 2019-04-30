package ksmart30.team01.project.domain;

public class ProjectSonikIngun {
	
	private String EMP_NO;
	private String PAY_YYMM;
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getPAY_YYMM() {
		return PAY_YYMM;
	}
	public void setPAY_YYMM(String pAY_YYMM) {
		PAY_YYMM = pAY_YYMM;
	}
	@Override
	public String toString() {
		return "ProjectSonikIngun [EMP_NO=" + EMP_NO + ", PAY_YYMM=" + PAY_YYMM + "]";
	}
}
