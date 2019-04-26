package ksmart30.team01.project.domain;

public class ProjectYesanListRequest {
	private String START_DATE;	//계약시작일
	private String END_DATE;	//계약종료일
	private String B_UP_SU;		//지상층
	private String B_DOWN_SU;	//지하층
	private String G_AREA_P_LOW;	//연면적
	private String G_AREA_P_HIGH;
	
	public String getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(String START_DATE) {
		this.START_DATE = START_DATE;
	}
	public String getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}
	public String getB_UP_SU() {
		return B_UP_SU;
	}
	public void setB_UP_SU(String b_UP_SU) {
		B_UP_SU = b_UP_SU;
	}
	public String getB_DOWN_SU() {
		return B_DOWN_SU;
	}
	public void setB_DOWN_SU(String b_DOWN_SU) {
		B_DOWN_SU = b_DOWN_SU;
	}
	public String getG_AREA_P_LOW() {
		return G_AREA_P_LOW;
	}
	public void setG_AREA_P_LOW(String g_AREA_P_LOW) {
		G_AREA_P_LOW = g_AREA_P_LOW;
	}
	public String getG_AREA_P_HIGH() {
		return G_AREA_P_HIGH;
	}
	public void setG_AREA_P_HIGH(String g_AREA_P_HIGH) {
		G_AREA_P_HIGH = g_AREA_P_HIGH;
	}
	@Override
	public String toString() {
		return "ProjectYesanListRequest [START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + ", B_UP_SU=" + B_UP_SU
				+ ", B_DOWN_SU=" + B_DOWN_SU + ", G_AREA_P_LOW=" + G_AREA_P_LOW + ", G_AREA_P_HIGH=" + G_AREA_P_HIGH
				+ "]";
	}
	
}
