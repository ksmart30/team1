package ksmart30.team00.baseinfo.domain;

public class ClientList {
	private String CUST_GBN;
	private String NMCD_TYPE;
	public String getCUST_GBN() {
		return CUST_GBN;
	}
	public void setCUST_GBN(String cUST_GBN) {
		CUST_GBN = cUST_GBN;
	}
	public String getNMCD_TYPE() {
		return NMCD_TYPE;
	}
	public void setNMCD_TYPE(String nMCD_TYPE) {
		NMCD_TYPE = nMCD_TYPE;
	}
	@Override
	public String toString() {
		return "ClientList [CUST_GBN=" + CUST_GBN + ", NMCD_TYPE=" + NMCD_TYPE + "]";
	}
	
	
}
