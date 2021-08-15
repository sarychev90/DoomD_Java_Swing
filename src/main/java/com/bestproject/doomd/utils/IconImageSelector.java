package com.bestproject.doomd.utils;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class IconImageSelector extends JFrame {

	private static final long serialVersionUID = -6432640909252115126L;
	
	private ImageIcon monsterL;
	private ImageIcon monsterD;
	private ImageIcon monsterDG;
	private ImageIcon monsterDV;
	private ImageIcon monsterDX;
	private ImageIcon lazerG;
	private ImageIcon lazerV;
	private ImageIcon lazerX;
	private ImageIcon wall;
	private ImageIcon mirrorUR;
	private ImageIcon mirrorUL;
	private ImageIcon mirrorDR;
	private ImageIcon mirrorDL;
	private ImageIcon mirrorLUR;
	private ImageIcon mirrorLUL;
	private ImageIcon mirrorLDR;
	private ImageIcon mirrorLDL;
	private ImageIcon emptyUnit;
	private ImageIcon weapon;
	private ImageIcon info;
	private ImageIcon gameOver;
	private ImageIcon level2;
	private String rootImagesFolder = "images/";
	private String imagesFormat = ".jpg";
	private int imageIconsWidth = 75;
	private int imageIconsHeight = 69;
	

	public IconImageSelector() {
		monsterL = prepareTypicalImageIcon("monsterL");
		monsterD = prepareTypicalImageIcon("monsterD");
		monsterDG = prepareTypicalImageIcon("monsterDG");
		monsterDV = prepareTypicalImageIcon("monsterDV");
		monsterDX = prepareTypicalImageIcon("monsterDX");
		lazerG = prepareTypicalImageIcon("lazerG");
		lazerV = prepareTypicalImageIcon("lazerV");
		lazerX = prepareTypicalImageIcon("lazerX");
		wall = prepareTypicalImageIcon("wall");
		mirrorLUR = prepareTypicalImageIcon("mirrorLazerUpR");
		mirrorUR = prepareTypicalImageIcon("mirrorUpR");
		mirrorLDR = prepareTypicalImageIcon("mirrorLazerDownR");
		mirrorDR = prepareTypicalImageIcon("mirrorDownR");
		mirrorLUL = prepareTypicalImageIcon("mirrorLazerUpL");
		mirrorUL = prepareTypicalImageIcon("mirrorUpL");
		mirrorLDL = prepareTypicalImageIcon("mirrorLazerDownL");
		mirrorDL = prepareTypicalImageIcon("mirrorDownL");
		emptyUnit = prepareTypicalImageIcon("emptyUnit");
		weapon = prepareTypicalImageIcon("weapon");
		info = prepareImageIcon("info", 72, 68);
		gameOver = prepareImageIcon("gameOver", 850, 415);
		level2 = prepareTypicalImageIcon("level2");
	}

	private ImageIcon prepareTypicalImageIcon(String imageName){
		return prepareImageIcon(imageName, imageIconsWidth, imageIconsHeight);
	}
	
	private ImageIcon prepareImageIcon(String imageName, int imageIconsWidth, int imageIconsHeight){
		Image image = new ImageIcon(this.getClass().getClassLoader().getResource(
				rootImagesFolder+imageName+imagesFormat)).getImage();
		Image scaledImage = image.getScaledInstance(imageIconsWidth, imageIconsHeight, 
				java.awt.Image.SCALE_SMOOTH);
		return new ImageIcon(scaledImage);
	}
	
	public ImageIcon getNativeIconeByName(String imageName) {
		return new ImageIcon(this.getClass().getClassLoader().getResource(
				rootImagesFolder+imageName+imagesFormat));
	}
	
	public ImageIcon getIcon(String name) {
		if (name.equals("Empty")) {
			return emptyUnit;
		} else if (name.equals("Weapon")) {
			return weapon;
		} else if (name.equals("MonsterL")) {
			return monsterL;
		} else if (name.equals("Wall")) {
			return wall;
		} else if (name.equals("MirrorUL")) {
			return mirrorUL;
		} else if (name.equals("MirrorUR")) {
			return mirrorUR;
		} else if (name.equals("MirrorDL")) {
			return mirrorDL;
		} else if (name.equals("MirrorDR")) {
			return mirrorDR;
		} else if (name.equals("LazerV")) {
			return lazerV;
		} else if (name.equals("LazerG")) {
			return lazerG;
		} else if (name.equals("LazerX")) {
			return lazerX;
		} else if (name.equals("MirrorLUL")) {
			return mirrorLUL;
		} else if (name.equals("MirrorLUR")) {
			return mirrorLUR;
		} else if (name.equals("MirrorLDL")) {
			return mirrorLDL;
		} else if (name.equals("MirrorLDR")) {
			return mirrorLDR;
		} else if (name.equals("MonsterD")) {
			return monsterD;
		} else if (name.equals("MonsterDV")) {
			return monsterDV;
		} else if (name.equals("MonsterDG")) {
			return monsterDG;
		} else if (name.equals("MonsterDX")) {
			return monsterDX;
		} else if (name.equals("Info")) {
			return info;
		} else if (name.equals("GameOver")) {
			return gameOver;
		} else if (name.equals("Level2")) {
			return level2;
		} else {
			return null;
		}
	}	
}
