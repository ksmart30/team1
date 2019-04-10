package ksmart30.team01.project.domain;

public class ProjectYesanSearchRequest {
	private String CONTRACT_DATE;

	public String getCONTRACT_DATE() {
		return CONTRACT_DATE;
	}

	public void setCONTRACT_DATE(String cONTRACT_DATE) {
		CONTRACT_DATE = cONTRACT_DATE;
	}

	@Override
	public String toString() {
		return "ProjectYesan [CONTRACT_DATE=" + CONTRACT_DATE + "]";
	}

}
