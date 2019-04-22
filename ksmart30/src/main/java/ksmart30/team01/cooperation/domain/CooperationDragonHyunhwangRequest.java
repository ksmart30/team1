package ksmart30.team01.cooperation.domain;

public class CooperationDragonHyunhwangRequest {

	private String STRAT_DATE; //기간검색 시작
	private String END_DATE; //기간검색 끝
	private String BUILD_CD; // 건축물 용도
	private String BIZ_CD; // 수주구분
	private String Y_P_STRAT; //연면적 시작
	private String Y_P_END; // 연면적 끝
	private String DG_P_STRAT;//대지면적 시작
	private String DG_P_END; //대지면적 끝
	public String getSTRAT_DATE() {
		return this.STRAT_DATE;
	}
	public void setSTRAT_DATE(String STRAT_DATE) {
		this.STRAT_DATE = STRAT_DATE;
	}
	public String getEND_DATE() {
		return this.END_DATE;
	}
	public void setEND_DATE(String END_DATE) {
		this.END_DATE = END_DATE;
	}
	public String getBUILD_CD() {
		return this.BUILD_CD;
	}
	public void setBUILD_CD(String BUILD_CD) {
		this.BUILD_CD = BUILD_CD;
	}
	public String getBIZ_CD() {
		return this.BIZ_CD;
	}
	public void setBIZ_CD(String BIZ_CD) {
		this.BIZ_CD = BIZ_CD;
	}
	public String getY_P_STRAT() {
		return this.Y_P_STRAT;
	}
	public void setY_P_STRAT(String Y_P_STRAT) {
		this.Y_P_STRAT = Y_P_STRAT;
	}
	public String getY_P_END() {
		return this.Y_P_END;
	}
	public void setY_P_END(String Y_P_END) {
		this.Y_P_END = Y_P_END;
	}
	public String getDG_P_STRAT() {
		return this.DG_P_STRAT;
	}
	public void setDG_P_STRAT(String DG_P_STRAT) {
		this.DG_P_STRAT = DG_P_STRAT;
	}
	public String getDG_P_END() {
		return this.DG_P_END;
	}
	public void setDG_P_END(String DG_P_END) {
		this.DG_P_END = DG_P_END;
	}
	@Override
	public String toString() {
		return "CooperationDragonHyunhwangRequest [STRAT_DATE=" + STRAT_DATE + ", END_DATE=" + END_DATE + ", BUILD_CD="
				+ BUILD_CD + ", BIZ_CD=" + BIZ_CD + ", Y_P_STRAT=" + Y_P_STRAT + ", Y_P_END=" + Y_P_END
				+ ", DG_P_STRAT=" + DG_P_STRAT + ", DG_P_END=" + DG_P_END + "]";
	}
	
}
