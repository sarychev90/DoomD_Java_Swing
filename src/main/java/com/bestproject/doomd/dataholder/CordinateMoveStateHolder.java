package com.bestproject.doomd.dataholder;

public class CordinateMoveStateHolder {
	
	private Integer iCordinat = 0;
	private Integer jCordinat = 0;
	private Long moveCounter = 0l;
	
	public Integer getiCordinat() {
		return iCordinat;
	}
	public void setiCordinat(Integer iCordinat) {
		this.iCordinat = iCordinat;
	}
	public Integer getjCordinat() {
		return jCordinat;
	}
	public void setjCordinat(Integer jCordinat) {
		this.jCordinat = jCordinat;
	}
	public Long getMoveCounter() {
		return moveCounter;
	}
	public void setMoveCounter(Long moveCounter) {
		this.moveCounter = moveCounter;
	}
	
	public void incrementMoveCounter() {
		this.moveCounter++;
	}
}
