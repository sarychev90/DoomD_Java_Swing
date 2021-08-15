package com.bestproject.doomd.utils;

import com.bestproject.doomd.playunits.PlayUnit;
import com.bestproject.doomd.playunits.PlayUnitEmpty;
import com.bestproject.doomd.playunits.PlayUnitLazer;
import com.bestproject.doomd.playunits.PlayUnitMirrorDownInLeft;
import com.bestproject.doomd.playunits.PlayUnitMirrorDownInRight;
import com.bestproject.doomd.playunits.PlayUnitMirrorUpInLeft;
import com.bestproject.doomd.playunits.PlayUnitMirrorUpInRight;
import com.bestproject.doomd.playunits.PlayUnitMonster;
import com.bestproject.doomd.playunits.PlayUnitWall;

public class GameLogic {
	
	PlayUnit[][] playUnitArrey = new PlayUnit[9][9];
	PlayUnit[] playUnitArreySave = new PlayUnit[1];

	public void setAllEmptyPlayUnit() {
		for (int i = 0; i < playUnitArrey.length; i++) {
			for (int j = 0; j < playUnitArrey[i].length; j++) {
				if (playUnitArrey[i][j] == null) {
					playUnitArrey[i][j] = new PlayUnitEmpty();
					playUnitArrey[i][j].setICordinat(i);
					playUnitArrey[i][j].setJCordinat(j);
				}
			}
		}
	}

	public void setMakeAllEmptyPlayUnit() {
		for (int i = 0; i < playUnitArrey.length; i++) {
			for (int j = 0; j < playUnitArrey[i].length; j++) {
				playUnitArrey[i][j] = null;
			}
		}
	}

	public void setPlayUnitInArrayBaseParametr() {
		for (int i = 0; i < playUnitArrey.length; i++) {
			for (int j = 0; j < playUnitArrey[i].length; j++) {
				playUnitArrey[i][j].setBaseParametr();
			}
		}
	}

	public void delPlayUnit(int i, int j) {
		playUnitArrey[i][j] = new PlayUnitEmpty();
		playUnitArrey[i][j].setICordinat(i);
		playUnitArrey[i][j].setJCordinat(j);
	}

	public void setSavePlayUnitByID(int playUnitId, int i, int j) {
		switch (playUnitId) {
		case 2:
			playUnitArreySave[0] = new PlayUnitMirrorDownInLeft();
			playUnitArreySave[0].setICordinat(i);
			playUnitArreySave[0].setJCordinat(j);
			break;
		case 3:
			playUnitArreySave[0] = new PlayUnitMirrorDownInRight();
			playUnitArreySave[0].setICordinat(i);
			playUnitArreySave[0].setJCordinat(j);
			break;
		case 4:
			playUnitArreySave[0] = new PlayUnitMirrorUpInLeft();
			playUnitArreySave[0].setICordinat(i);
			playUnitArreySave[0].setJCordinat(j);
			break;
		case 5:
			playUnitArreySave[0] = new PlayUnitMirrorUpInRight();
			playUnitArreySave[0].setICordinat(i);
			playUnitArreySave[0].setJCordinat(j);
			break;
		default:
			playUnitArreySave[0] = null;
			break;
		}
	}

	public void delSavePlayUnit() {
		playUnitArreySave[0] = null;
	}

	public PlayUnit getSavePlayUnit() {
		return playUnitArreySave[0];
	}

	public int getAmountOfDieMonster() {
		int dieMonster = 0;
		for (int i = 0; i < playUnitArrey.length; i++) {
			for (int j = 0; j < playUnitArrey[i].length; j++) {
				if (playUnitArrey[i][j].getMonsterDieInfo()) {
					dieMonster += 1;
				}
			}
		}
		return dieMonster;
	}

	public boolean fullSavePlayUnitObject() {
		if (playUnitArreySave[0] != null)
			return true;
		return false;
	}

	public void setPlayUnitByID(int playUnitId, int i, int j) {
		switch (playUnitId) {
		case 2:
			playUnitArrey[i][j] = new PlayUnitMirrorDownInLeft();
			playUnitArrey[i][j].setICordinat(i);
			playUnitArrey[i][j].setJCordinat(j);
			break;
		case 3:
			playUnitArrey[i][j] = new PlayUnitMirrorDownInRight();
			playUnitArrey[i][j].setICordinat(i);
			playUnitArrey[i][j].setJCordinat(j);
			break;
		case 4:
			playUnitArrey[i][j] = new PlayUnitMirrorUpInLeft();
			playUnitArrey[i][j].setICordinat(i);
			playUnitArrey[i][j].setJCordinat(j);
			break;
		case 5:
			playUnitArrey[i][j] = new PlayUnitMirrorUpInRight();
			playUnitArrey[i][j].setICordinat(i);
			playUnitArrey[i][j].setJCordinat(j);
			break;
		default:
			playUnitArrey[i][j] = null;
			break;
		}
	}

	public void setEmptyPlayUnit(int i, int j) {
		playUnitArrey[i][j] = new PlayUnitEmpty();
		playUnitArrey[i][j].setICordinat(i);
		playUnitArrey[i][j].setJCordinat(j);
	}

	public void setPlayUnitLazer(int i, int j) {
		playUnitArrey[i][j] = new PlayUnitLazer();
		playUnitArrey[i][j].setICordinat(i);
		playUnitArrey[i][j].setJCordinat(j);
	}

	public void setPlayUnitWall(int i, int j) {
		playUnitArrey[i][j] = new PlayUnitWall();
		playUnitArrey[i][j].setICordinat(i);
		playUnitArrey[i][j].setJCordinat(j);
	}

	public void setPlayUnitMonster(int i, int j) {
		playUnitArrey[i][j] = new PlayUnitMonster();
		playUnitArrey[i][j].setICordinat(i);
		playUnitArrey[i][j].setJCordinat(j);
	}

	public void setPlayUnitMirrorUpInLeft(int i, int j) {
		playUnitArrey[i][j] = new PlayUnitMirrorUpInLeft();
		playUnitArrey[i][j].setICordinat(i);
		playUnitArrey[i][j].setJCordinat(j);
	}

	public void setPlayUnitMirrorUpInRight(int i, int j) {
		playUnitArrey[i][j] = new PlayUnitMirrorUpInRight();
		playUnitArrey[i][j].setICordinat(i);
		playUnitArrey[i][j].setJCordinat(j);
	}

	public void setPlayUnitMirrorDownInRight(int i, int j) {
		playUnitArrey[i][j] = new PlayUnitMirrorDownInRight();
		playUnitArrey[i][j].setICordinat(i);
		playUnitArrey[i][j].setJCordinat(j);
	}

	public void setPlayUnitMirrorDownInLeft(int i, int j) {
		playUnitArrey[i][j] = new PlayUnitMirrorDownInLeft();
		playUnitArrey[i][j].setICordinat(i);
		playUnitArrey[i][j].setJCordinat(j);

	}

	public PlayUnit getPlayUnit(int i, int j) {
		return playUnitArrey[i][j];
	}

	public String getPlayUnitName(int i, int j) {
		return playUnitArrey[i][j].getPlayUnitName();
	}

	public void setLazerFlow(int i, int j) {
		playUnitArrey[i][j].setDirection();
		if (playUnitArrey[i][j].getUpOut()) {
			if (i > 0) {
				playUnitArrey[i][j].setDownIn(false);
				playUnitArrey[i - 1][j].setDownIn(true);
				i--;
				setLazerFlow(i, j);
			}
		} else if (playUnitArrey[i][j].getDownOut()) {
			if (i < playUnitArrey.length - 1) {
				playUnitArrey[i][j].setUpIn(false);
				playUnitArrey[i + 1][j].setUpIn(true);
				i++;
				setLazerFlow(i, j);
			}
		} else if (playUnitArrey[i][j].getRightOut()) {
			if (j < playUnitArrey[i].length - 1) {
				playUnitArrey[i][j].setLeftIn(false);
				playUnitArrey[i][j + 1].setLeftIn(true);
				j++;
				setLazerFlow(i, j);
			}
		} else if (playUnitArrey[i][j].getLeftOut()) {
			if (j > 0) {
				playUnitArrey[i][j].setRightIn(false);
				playUnitArrey[i][j - 1].setRightIn(true);
				j--;
				setLazerFlow(i, j);
			}
		}
		playUnitArrey[i][j].setPlayUnitName();
	}

	public void setFirstLevel() {
		setPlayUnitLazer(8, 4);
		// расстановка стен
		setPlayUnitWall(6, 2);
		setPlayUnitWall(2, 2);
		setPlayUnitWall(6, 2);
		setPlayUnitWall(2, 6);
		setPlayUnitWall(6, 6);
		setPlayUnitWall(8, 3);
		setPlayUnitWall(8, 5);
		// расстановка монстров
		setPlayUnitMonster(1, 1);
		setPlayUnitMonster(3, 2);
		setPlayUnitMonster(3, 6);
		setPlayUnitMonster(7, 6);
		// базовая расстанвка зеркал
		setPlayUnitMirrorDownInLeft(8, 8);
		setPlayUnitMirrorDownInRight(8, 0);
		setPlayUnitMirrorUpInLeft(7, 8);
		setPlayUnitMirrorUpInRight(7, 0);
		// заполнение массива пустыми юнитами
		setAllEmptyPlayUnit();
	}

	public void setSecondLevel() {
		setMakeAllEmptyPlayUnit();
		setPlayUnitLazer(8, 4);
		// расстановка стен
		setPlayUnitWall(0, 0);
		setPlayUnitWall(0, 1);
		setPlayUnitWall(0, 2);
		setPlayUnitWall(0, 3);
		setPlayUnitWall(1, 0);
		setPlayUnitWall(1, 2);
		setPlayUnitWall(1, 3);
		setPlayUnitWall(2, 0);
		setPlayUnitWall(2, 2);
		setPlayUnitWall(2, 3);
		setPlayUnitWall(2, 6);
		setPlayUnitWall(3, 0);
		setPlayUnitWall(3, 2);
		setPlayUnitWall(3, 3);
		setPlayUnitWall(3, 6);
		setPlayUnitWall(4, 0);
		setPlayUnitWall(5, 0);
		setPlayUnitWall(5, 1);
		setPlayUnitWall(5, 2);
		setPlayUnitWall(5, 3);
		setPlayUnitWall(6, 0);
		setPlayUnitWall(6, 1);
		setPlayUnitWall(6, 2);
		setPlayUnitWall(7, 0);
		setPlayUnitWall(7, 1);
		setPlayUnitWall(8, 0);
		setPlayUnitWall(8, 3);
		setPlayUnitWall(8, 5);
		// расстановка монстров
		setPlayUnitMonster(1, 1);
		setPlayUnitMonster(1, 6);
		setPlayUnitMonster(3, 8);
		setPlayUnitMonster(4, 3);
		setPlayUnitMonster(4, 6);
		// базовая расстанвка зеркал
		setPlayUnitMirrorDownInLeft(8, 7);
		setPlayUnitMirrorDownInRight(8, 8);
		setPlayUnitMirrorUpInLeft(7, 7);
		setPlayUnitMirrorUpInRight(7, 8);
		// заполнение массива пустыми юнитами
		setAllEmptyPlayUnit();
	}

}
