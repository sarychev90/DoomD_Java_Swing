package com.bestproject.doomd.playunits;

public abstract class PlayUnit {

	protected boolean monsterDie;
	protected int playUnitId;
	protected int iCordinat;
	protected int jCordinat;

	protected boolean upIn;
	protected boolean downIn;
	protected boolean rightIn;
	protected boolean leftIn;

	protected boolean upOut;
	protected boolean downOut;
	protected boolean rightOut;
	protected boolean leftOut;

	protected String name;

	PlayUnit() {
	}

	PlayUnit(boolean monsterDie, int playUnitId, int iCordinat, int jCordinat, boolean upIn, boolean downIn,
			boolean rightIn, boolean leftIn, boolean upOut, boolean downOut, boolean rightOut, boolean leftOut) {
		this.monsterDie = monsterDie;
		this.playUnitId = playUnitId;
		this.iCordinat = iCordinat;
		this.jCordinat = jCordinat;
		this.upIn = upIn;
		this.downIn = downIn;
		this.rightIn = rightIn;
		this.leftIn = leftIn;
		this.upOut = upOut;
		this.downOut = downOut;
		this.rightOut = rightOut;
		this.leftOut = leftOut;
	}

	public String getPlayUnitName() {
		return name;
	}

	public void setPlayUnitName() {
	}

	public void setDirection() {
	}

	public void setICordinat(int iCordinat) {
		this.iCordinat = iCordinat;
	}

	public int getICordinat() {
		return iCordinat;
	}

	public void setJCordinat(int jCordinat) {
		this.jCordinat = jCordinat;
	}

	public int getJCordinat() {
		return jCordinat;
	}

	public int getId() {
		return playUnitId;
	}

	public void setBaseParametr() {
	}

	public boolean getMonsterDieInfo() {
		return monsterDie;
	}

	public void setUpIn(boolean bul) {
		this.upIn = bul;
	}

	public boolean getUpIn() {
		return upIn;
	}

	public void setDownIn(boolean bul) {
		this.downIn = bul;
	}

	public boolean getDownIn() {
		return downIn;
	}

	public void setRightIn(boolean bul) {
		this.rightIn = bul;
	}

	public boolean getRightIn() {
		return rightIn;
	}

	public void setLeftIn(boolean bul) {
		this.leftIn = bul;
	}

	public boolean getLeftIn() {
		return leftIn;
	}

	public void setUpOut(boolean bul) {
		this.upOut = bul;
	}

	public boolean getUpOut() {
		return upOut;
	}

	public void setDownOut(boolean bul) {
		this.downOut = bul;
	}

	public boolean getDownOut() {
		return downOut;
	}

	public void setRightOut(boolean bul) {
		this.rightOut = bul;
	}

	public boolean getRightOut() {
		return rightOut;
	}

	public void setLeftOut(boolean bul) {
		this.leftOut = bul;
	}

	public boolean getLeftOut() {
		return leftOut;
	}

	@Override
	public String toString() {
		return "PlayUnit [monsterDie=" + monsterDie + ", playUnitId=" + playUnitId + ", iCordinat=" + iCordinat
				+ ", jCordinat=" + jCordinat + ", upIn=" + upIn + ", downIn=" + downIn + ", rightIn=" + rightIn
				+ ", leftIn=" + leftIn + ", upOut=" + upOut + ", downOut=" + downOut + ", rightOut=" + rightOut
				+ ", leftOut=" + leftOut + ", name=" + name + "]";
	}

}
