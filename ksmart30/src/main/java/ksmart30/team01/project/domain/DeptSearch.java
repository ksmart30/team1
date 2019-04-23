package ksmart30.team01.project.domain;

public class DeptSearch {
    private String DEPT_CD;
    private String CONTRACT_GBN;
    private String PJT_E_GBN;
    private String CUST_CD;
    private String START_DATE;
    private String END_DATE;
    private int TOT_CONTRACT_AMT_START;
    private int TOT_CONTRACT_AMT_END;
    private int PYUNG_DAN_START;
    private int PYUNG_DAN_END;
    private int G_YEARA_P_START;
    private int G_YEARA_P_END;
    private String BUILD_TYPE;
    private String ZIP_CD;
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPT_CD) {
		DEPT_CD = dEPT_CD;
	}
	public String getCONTRACT_GBN() {
		return CONTRACT_GBN;
	}
	public void setCONTRACT_GBN(String cONTRACT_GBN) {
		CONTRACT_GBN = cONTRACT_GBN;
	}
	public String getPJT_E_GBN() {
		return PJT_E_GBN;
	}
	public void setPJT_E_GBN(String pJT_E_GBN) {
		PJT_E_GBN = pJT_E_GBN;
	}
	public String getCUST_CD() {
		return CUST_CD;
	}
	public void setCUST_CD(String cUST_CD) {
		CUST_CD = cUST_CD;
	}
	public String getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(String sTART_DATE) {
		START_DATE = sTART_DATE;
	}
	public String getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}
	public int getTOT_CONTRACT_AMT_START() {
		return TOT_CONTRACT_AMT_START;
	}
	public void setTOT_CONTRACT_AMT_START(int tOT_CONTRACT_AMT_START) {
		TOT_CONTRACT_AMT_START = tOT_CONTRACT_AMT_START;
	}
	public int getTOT_CONTRACT_AMT_END() {
		return TOT_CONTRACT_AMT_END;
	}
	public void setTOT_CONTRACT_AMT_END(int tOT_CONTRACT_AMT_END) {
		TOT_CONTRACT_AMT_END = tOT_CONTRACT_AMT_END;
	}
	public int getPYUNG_DAN_START() {
		return PYUNG_DAN_START;
	}
	public void setPYUNG_DAN_START(int pYUNG_DAN_START) {
		PYUNG_DAN_START = pYUNG_DAN_START;
	}
	public int getPYUNG_DAN_END() {
		return PYUNG_DAN_END;
	}
	public void setPYUNG_DAN_END(int pYUNG_DAN_END) {
		PYUNG_DAN_END = pYUNG_DAN_END;
	}
	public int getG_YEARA_P_START() {
		return G_YEARA_P_START;
	}
	public void setG_YEARA_P_START(int g_YEARA_P_START) {
		G_YEARA_P_START = g_YEARA_P_START;
	}
	public int getG_YEARA_P_END() {
		return G_YEARA_P_END;
	}
	public void setG_YEARA_P_END(int g_YEARA_P_END) {
		G_YEARA_P_END = g_YEARA_P_END;
	}
	public String getBUILD_TYPE() {
		return BUILD_TYPE;
	}
	public void setBUILD_TYPE(String bUILD_TYPE) {
		BUILD_TYPE = bUILD_TYPE;
	}
	public String getZIP_CD() {
		return ZIP_CD;
	}
	public void setZIP_CD(String zIP_CD) {
		ZIP_CD = zIP_CD;
	}
	@Override
	public String toString() {
		return "DeptSearch [DEPT_CD=" + DEPT_CD + ", CONTRACT_GBN=" + CONTRACT_GBN + ", PJT_E_GBN=" + PJT_E_GBN
				+ ", CUST_CD=" + CUST_CD + ", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE
				+ ", TOT_CONTRACT_AMT_START=" + TOT_CONTRACT_AMT_START + ", TOT_CONTRACT_AMT_END="
				+ TOT_CONTRACT_AMT_END + ", PYUNG_DAN_START=" + PYUNG_DAN_START + ", PYUNG_DAN_END=" + PYUNG_DAN_END
				+ ", G_YEARA_P_START=" + G_YEARA_P_START + ", G_YEARA_P_END=" + G_YEARA_P_END + ", BUILD_TYPE="
				+ BUILD_TYPE + ", ZIP_CD=" + ZIP_CD + "]";
	}

}