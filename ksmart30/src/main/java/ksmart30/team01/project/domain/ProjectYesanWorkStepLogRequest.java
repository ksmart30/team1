package ksmart30.team01.project.domain;

public class ProjectYesanWorkStepLogRequest {
	private String PJT_CD;
	private String WORK_STEP;
	
	public String getPJT_CD() {
		return PJT_CD;
	}
	public void setPJT_CD(String pJT_CD) {
		PJT_CD = pJT_CD;
	}
	public String getWORK_STEP() {
		return WORK_STEP;
	}
	public void setWORK_STEP(String wORK_STEP) {
		WORK_STEP = wORK_STEP;
	}	
	
	@Override
	public String toString() {
		return "ProjectYesanWorkStepLogRequest [PJT_CD=" + PJT_CD + ", WORK_STEP=" + WORK_STEP + "]";
	}
}
