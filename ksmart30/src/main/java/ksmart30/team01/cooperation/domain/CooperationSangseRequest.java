package ksmart30.team01.cooperation.domain;

public class CooperationSangseRequest {
	private String PJT_CD;
	private String OUT_CORP;
	private String OUT_ITEM;
	public String getOUT_ITEM() {
		return this.OUT_ITEM;
	}
	public void setOUT_ITEM(String OUT_ITEM) {
		this.OUT_ITEM = OUT_ITEM;
	}
	public String getPJT_CD() {
		return this.PJT_CD;
	}
	public void setPJT_CD(String PJT_CD) {
		this.PJT_CD = PJT_CD;
	}
	public String getOUT_CORP() {
		return this.OUT_CORP;
	}
	public void setOUT_CORP(String OUT_CORP) {
		this.OUT_CORP = OUT_CORP;
	}
	@Override
	public String toString() {
		return "CooperationSangseRequest [PJT_CD=" + PJT_CD + ", OUT_CORP=" + OUT_CORP + ", OUT_ITEM=" + OUT_ITEM + "]";
	}
	
	
}
