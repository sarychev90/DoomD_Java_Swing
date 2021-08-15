package com.bestproject.doomd.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.bestproject.doomd.dataholder.LevelCounterHolder;
import com.bestproject.doomd.utils.GameLogic;
import com.bestproject.doomd.utils.IconImageSelector;
import com.bestproject.doomd.utils.UnitJButton;
import com.bestproject.doomd.utils.MenuJButton;

public class ButtonSecondLevelListener implements ActionListener { // cлушатель событий для кнопоки перехода на второй уровень
	
	private GameLogic logic;
	private LevelCounterHolder levelCounterHolder;
	private IconImageSelector imageSelector;
	private JPanel[] panelArray;
	private UnitJButton[][] playArena;
	
	public ButtonSecondLevelListener(GameLogic logic, LevelCounterHolder levelCounterHolder,
			IconImageSelector imageSelector, JPanel[] panelArray, UnitJButton[][] playArena) {
		this.logic = logic;
		this.levelCounterHolder = levelCounterHolder;
		this.imageSelector = imageSelector;
		this.panelArray = panelArray;
		this.playArena = playArena;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		levelCounterHolder.setLevelCounter(levelCounterHolder.getLevelCounter()+1);
		((MenuJButton) e.getSource()).setEnabled(false);
		logic.setSecondLevel(); //загружаем в логический массив настройки второго уровня
		logic.setLazerFlow(8, 4);
		for (int i = 0; i < panelArray.length - 1; i++) {
			for (int j = 0; j < playArena[i].length; j++) {
				playArena[i][j].setIcon(imageSelector.getIcon(logic.getPlayUnitName(i, j)));
			}
		}
	}
}
