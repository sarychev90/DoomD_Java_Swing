package com.bestproject.doomd.playunits;

public class PlayUnitMirrorUpInRight extends PlayUnit {

	public PlayUnitMirrorUpInRight() {
		monsterDie = false;
		playUnitId = 5;
		iCordinat = 0;
		jCordinat = 0;

		upIn = false;
		downIn = false;
		rightIn = false;
		leftIn = false;

		upOut = false;
		downOut = false;
		rightOut = false;
		leftOut = false;

		name = "MirrorUR";

	}
	
	public PlayUnitMirrorUpInRight(boolean monsterDie, int playUnitId, int iCordinat, int jCordinat, boolean upIn,
			boolean downIn, boolean rightIn, boolean leftIn, boolean upOut, boolean downOut, boolean rightOut,
			boolean leftOut) {
		super(monsterDie, playUnitId, iCordinat, jCordinat, upIn, downIn, rightIn, leftIn, upOut, downOut, rightOut,
				leftOut);
	}

	@Override
	public void setBaseParametr() {
		super.setBaseParametr();
		name = "MirrorUR";
		upIn = false;
		downIn = false;
		rightIn = false;
		leftIn = false;
		upOut = false;
		downOut = false;
		rightOut = false;
		leftOut = false;
	}

	@Override
	public String getPlayUnitName() {
		return super.getPlayUnitName();
	}

	@Override
	public void setPlayUnitName() {
		super.setPlayUnitName();
		if (upIn && rightOut || rightIn && upOut) {
			name = "MirrorLUR";
		}
	}

	@Override
	public void setDirection() {
		super.setDirection();
		if (upIn) {
			rightOut = true;
		} else if (rightIn) {
			upOut = true;
		}
	}

	@Override
	public void setICordinat(int iCordinat) {
		super.setICordinat(iCordinat);
	}

	@Override
	public boolean getMonsterDieInfo() {
		return super.getMonsterDieInfo();
	}

	@Override
	public int getICordinat() {
		return super.getICordinat();
	}

	@Override
	public void setJCordinat(int jCordinat) {
		super.setJCordinat(jCordinat);
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
		return super.toString()+"PlayUnitMirrowUpInRight []";
	}
	
	
}
