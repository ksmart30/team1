package ksmart30.team01.cooperation.domain;

public class cooperationSangseRequest {
	private String PJT_CD;
	private String OUT_CORP;
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
	}
	public String getOUT_CORP() {
		return OUT_CORP;
	}
	public void setOUT_CORP(String oUT_CORP) {
		OUT_CORP = oUT_CORP;
	}
	@Override
	public String toString() {
		return "cooperationSangseRequest [PJT_CD=" + PJT_CD + ", OUT_CORP=" + OUT_CORP + "]";
	}
	
	
}
