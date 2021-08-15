package com.bestproject.doomd.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MenuJButton extends JButton {
	
	private static final long serialVersionUID = -4161407008632666830L;
	Font font = new Font("Century Gothic", Font.BOLD, 30);

	MenuJButton() {
		setFont(font);
		setForeground(Color.RED);
		setBackground(Color.DARK_GRAY);
	}

	MenuJButton(String text) {
		super(text);
		setFont(font);
		setForeground(Color.RED);
		setBackground(Color.DARK_GRAY);
	}
	
	MenuJButton(Boolean isEnabled, ImageIcon imageIcon, ActionListener actionListener) {
		setFont(font);
		setForeground(Color.RED);
		setBackground(Color.DARK_GRAY);
		setEnabled(isEnabled);
		setIcon(imageIcon);
		addActionListener(actionListener);
	}
}
