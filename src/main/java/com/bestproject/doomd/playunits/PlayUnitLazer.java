package com.bestproject.doomd.playunits;

public class PlayUnitLazer extends PlayUnit {

	public PlayUnitLazer() {
		monsterDie = false;
		playUnitId = 1;
		iCordinat = 0;
		jCordinat = 0;
		upIn = false;
		downIn = false;
		rightIn = false;
		leftIn = false;
		upOut = true;
		downOut = false;
		rightOut = false;
		leftOut = false;
		name = "Weapon";
	}
	
	public PlayUnitLazer(boolean monsterDie, int playUnitId, int iCordinat, int jCordinat, boolean upIn, boolean downIn,
			boolean rightIn, boolean leftIn, boolean upOut, boolean downOut, boolean rightOut, boolean leftOut) {
		super(monsterDie, playUnitId, iCordinat, jCordinat, upIn, downIn, rightIn, leftIn, upOut, downOut, rightOut,
				leftOut);
	}

	@Override
	public void setBaseParametr() {
		super.setBaseParametr();
		name = "Weapon";
	}

	@Override
	public String getPlayUnitName() {
		return super.getPlayUnitName();
	}

	@Override
	public void setPlayUnitName() {
		super.setPlayUnitName();
	}

	@Override
	public boolean getMonsterDieInfo() {
		return super.getMonsterDieInfo();
	}

	@Override
	public void setDirection() {
		super.setDirection();
	}

	@Override
	public void setICordinat(int iCordinat) {
		super.setICordinat(iCordinat);
	}

	@Override
	public int getICordinat() {
		return super.getICordinat();
	}

	@Override
	public void setJCordinat(int jCordinat) {
		super.setICordinat(jCordinat);
	}

	@Override
	public int getJCordinat() {
		return super.getJCordinat();
	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public void setUpIn(boolean bul) {
		super.setUpIn(bul);
	}

	@Override
	public boolean getUpIn() {
		return super.getUpIn();
	}

	@Override
	public void setDownIn(boolean bul) {
		super.setDownIn(bul);
	}

	@Override
	public boolean getDownIn() {
		return super.getDownIn();
	}

	@Override
	public void setRightIn(boolean bul) {
		super.setRightIn(bul);
	}

	@Override
	public boolean getRightIn() {
		return super.getRightIn();
	}

	@Override
	public void setLeftIn(boolean bul) {
		super.setLeftIn(bul);
	}

	@Override
	public boolean getLeftIn() {
		return super.getLeftIn();
	}

	@Override
	public void setUpOut(boolean bul) {
		super.setUpOut(bul);
	}

	@Override
	public boolean getUpOut() {
		return super.getUpOut();
	}

	@Override
	public void setDownOut(boolean bul) {
		super.setDownOut(bul);
	}

	@Override
	public boolean getDownOut() {
		return super.getDownOut();
	}

	@Override
	public void setRightOut(boolean bul) {
		super.setRightOut(bul);
	}

	@Override
	public boolean getRightOut() {
		return super.getRightOut();
	}

	@Override
	public void setLeftOut(boolean bul) {
		super.setLeftOut(bul);
	}

	@Override
	public boolean getLeftOut() {
		return super.getLeftOut();
	}

	@Override
	public String toString() {
		return super.toString()+"PlayUnitLazer []";
	}
	
	
}
