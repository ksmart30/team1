package ksmart30.team01.project.domain;

public class ProjectYesanOutputCodeSearch {
	private String CONTRACT_DATE_YY;
	private String selectedOption;
	private String inputValue;
	public String getCONTRACT_DATE_YY() {
		return CONTRACT_DATE_YY;
	}
	public void setCONTRACT_DATE_YY(String cONTRACT_DATE_YY) {
		CONTRACT_DATE_YY = cONTRACT_DATE_YY;
	}
	public String getSelectedOption() {
		return selectedOption;
	}
	public void setSelectedOption(String selectedOption) {
		this.selectedOption = selectedOption;
	}
	public String getInputValue() {
		return inputValue;
	}
	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}
	@Override
	public String toString() {
		return "ProjectYesanOutputCodeSearch [CONTRACT_DATE_YY=" + CONTRACT_DATE_YY + ", selectedOption="
				+ selectedOption + ", inputValue=" + inputValue + "]";
	}

}
