
package ksmart30.team01.cooperation.domain;

public class CooperationSearchRequest {
	private String inDeptCd;
	private String inContractDate;
	private String inPjtCd;
	private String inPjtNm;
	private String inOutItem;
	private String inCustNm;
	private String inContractNm;
	private String inBuildType;
	public String getInDeptCd() {
		return inDeptCd;
	}
	public void setInDeptCd(String inDeptCd) {
		this.inDeptCd = inDeptCd;
	}
	public String getInContractDate() {
		return inContractDate;
	}
	public void setInContractDate(String inContractDate) {
		this.inContractDate = inContractDate;
	}
	public String getInPjtCd() {
		return inPjtCd;
	}
	public void setInPjtCd(String inPjtCd) {
		this.inPjtCd = inPjtCd;
	}
	public String getInPjtNm() {
		return inPjtNm;
	}
	public void setInPjtNm(String inPjtNm) {
		this.inPjtNm = inPjtNm;
	}
	public String getInOutItem() {
		return inOutItem;
	}
	public void setInOutItem(String inOutItem) {
		this.inOutItem = inOutItem;
	}
	public String getInCustNm() {
		return inCustNm;
	}
	public void setInCustNm(String inCustNm) {
		this.inCustNm = inCustNm;
	}
	public String getInContractNm() {
		return inContractNm;
	}
	public void setInContractNm(String inContractNm) {
		this.inContractNm = inContractNm;
	}
	public String getInBuildType() {
		return inBuildType;
	}
	public void setInBuildType(String inBuildType) {
		this.inBuildType = inBuildType;
	}
	@Override
	public String toString() {
		return "CooperationSearchRequest [inDeptCd=" + inDeptCd + ", inContractDate=" + inContractDate + ", inPjtCd="
				+ inPjtCd + ", inPjtNm=" + inPjtNm + ", inOutItem=" + inOutItem + ", inCustNm=" + inCustNm
				+ ", inContractNm=" + inContractNm + ", inBuildType=" + inBuildType + "]";
	}
	
}
