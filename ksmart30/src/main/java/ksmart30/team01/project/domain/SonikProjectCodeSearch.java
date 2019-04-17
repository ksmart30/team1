package ksmart30.team01.project.domain;

public class SonikProjectCodeSearch {
	
	private String selectedPJT;
	private String pjtValue;
	private String YY;
	public String getSelectedPJT() {
		return selectedPJT;
	}
	public void setSelectedPJT(String selectedPJT) {
		this.selectedPJT = selectedPJT;
	}
	public String getPjtValue() {
		return pjtValue;
	}
	public void setPjtValue(String pjtValue) {
		this.pjtValue = pjtValue;
	}
	public String getYY() {
		return YY;
	}
	public void setYY(String yY) {
		YY = yY;
	}
	@Override
	public String toString() {
		return "SonikProjectCodeSearch [selectedPJT=" + selectedPJT + ", pjtValue=" + pjtValue + ", YY=" + YY + "]";
	}
	

}