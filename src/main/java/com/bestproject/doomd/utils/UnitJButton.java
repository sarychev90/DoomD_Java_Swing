package com.bestproject.doomd.utils;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.JButton;

public class UnitJButton extends JButton{
	
	private static final long serialVersionUID = -8902682284822118187L;
	private int iCordinat;
	private int jCordinat;
	
	UnitJButton() {
		super();
		setBackground(Color.WHITE);
	}
	
	@Override
	public void setIcon(Icon icon) {
		super.setIcon(icon);
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
	
}
