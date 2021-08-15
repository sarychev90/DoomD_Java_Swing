package com.bestproject.doomd.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.bestproject.doomd.actionlistener.ButtonInfoActionListener;
import com.bestproject.doomd.actionlistener.ButtonMirrowListener;
import com.bestproject.doomd.actionlistener.ButtonSecondLevelListener;
import com.bestproject.doomd.dataholder.CordinateMoveStateHolder;
import com.bestproject.doomd.dataholder.LevelCounterHolder;

public class ButtleAreaFrame extends JFrame {

	private static final long serialVersionUID = -3129158220614295277L;
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	int screenWith = screenSize.width;

	GameLogic logic = new GameLogic(); 
	IconImageSelector imageSelector = new IconImageSelector();
	LevelCounterHolder levelCounterHolder = new LevelCounterHolder();
	CordinateMoveStateHolder cordinateStateHolder = new CordinateMoveStateHolder();
	JPanel[] panelArray = new JPanel[10];
	UnitJButton[][] playArena = new UnitJButton[10][9];

	public ButtleAreaFrame() {
		super("DoomD by Sarychev D. v 1.1");
		Image image = imageSelector.getNativeIconeByName("Doom").getImage();
		setIconImage(image);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(10, 9));
		mainPanel.setBackground(Color.WHITE);

		// cлушатель событий для кнопоки перехода на второй уровень
		ActionListener secondLevelListener = new ButtonSecondLevelListener(
				logic, levelCounterHolder,imageSelector, panelArray, playArena);

		// кнопки нижней панели
		panelArray[9] = new JPanel();
		panelArray[9].setLayout(new GridLayout(1, 9));
		JButton buttonInfo = new MenuJButton(
				Boolean.TRUE, imageSelector.getIcon("Info"), new ButtonInfoActionListener(imageSelector));
		JButton button2 = new MenuJButton("M");
		JButton button3 = new MenuJButton("O");
		JButton button4 = new MenuJButton("V");
		JButton button5 = new MenuJButton("E");
		JButton button6 = new MenuJButton("S");
		JButton button7 = new MenuJButton(":");
		JButton button8 = new MenuJButton(String.valueOf(cordinateStateHolder.getMoveCounter()));
		
		JButton buttonNewLevel = new MenuJButton(
				Boolean.FALSE, imageSelector.getIcon("Level2"), secondLevelListener);

		//cлушатель событий для кнопоки передвижения зеркала
		ActionListener actionMirrorListener = new ButtonMirrowListener(cordinateStateHolder, logic,
				levelCounterHolder, imageSelector, panelArray,
				playArena, buttonNewLevel, button8);

		// кнопки панели игрового поля
		logic.setFirstLevel(); //загружаем в логический массив настройки первого уровня
		logic.setLazerFlow(8, 4);
		for (int i = 0; i < panelArray.length - 1; i++) {
			panelArray[i] = new JPanel();
			panelArray[i].setLayout(new GridLayout(1, 9));
			for (int j = 0; j < playArena[i].length; j++) {
				playArena[i][j] = new UnitJButton();
				playArena[i][j].setICordinat(i);
				playArena[i][j].setJCordinat(j);
				playArena[i][j].addActionListener(actionMirrorListener);
				playArena[i][j].setIcon(imageSelector.getIcon(logic.getPlayUnitName(i, j)));
				panelArray[i].add(playArena[i][j]);
			}
		}

		panelArray[9].add(buttonInfo);
		panelArray[9].add(button2);
		panelArray[9].add(button3);
		panelArray[9].add(button4);
		panelArray[9].add(button5);
		panelArray[9].add(button6);
		panelArray[9].add(button7);
		panelArray[9].add(button8);
		panelArray[9].add(buttonNewLevel);

		for (int i = 0; i < panelArray.length; i++) {
			mainPanel.add(panelArray[i]);
		}

		add(mainPanel);
		setResizable(false);
		setSize(690, 700);
		setVisible(true);
		setLocation(screenWith / 5, 1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
