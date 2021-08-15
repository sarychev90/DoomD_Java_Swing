package com.bestproject.doomd.utils;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOverDialog extends JDialog {

	private static final long serialVersionUID = -5254012191349145768L;

	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	int screenWith = screenSize.width;
	int screenHeight = screenSize.height;

	public GameOverDialog(IconImageSelector imageSelector) {
		Image image = imageSelector.getNativeIconeByName("Doom").getImage();
		setIconImage(image);

		JPanel panel = new JPanel();
		JLabel lable = new JLabel();
		lable.setIcon((imageSelector.getIcon("GameOver")));

		panel.add(lable);
		add(panel);
		setTitle("DoomD Game Over");
		setResizable(false);
		setSize(screenWith * 2/3, 415);
		setVisible(true);
		setLocation(screenWith / 6, screenHeight / 5);
	}
}
