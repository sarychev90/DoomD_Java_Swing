package com.bestproject.doomd.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.bestproject.doomd.dataholder.CordinateMoveStateHolder;
import com.bestproject.doomd.dataholder.LevelCounterHolder;
import com.bestproject.doomd.utils.GameLogic;
import com.bestproject.doomd.utils.GameOverDialog;
import com.bestproject.doomd.utils.IconImageSelector;
import com.bestproject.doomd.utils.UnitJButton;

//cлушатель событий для кнопоки передвижения зеркала
public class ButtonMirrowListener implements ActionListener {
	
	private CordinateMoveStateHolder cordinateStateHolder;
	private GameLogic logic;
	private LevelCounterHolder levelCounterHolder;
	private IconImageSelector imageSelector;
	private JPanel[] panelArray;
	private UnitJButton[][] playArena;
	private JButton buttonNewLevel;
	private JButton moveCounter;
	
	public ButtonMirrowListener(CordinateMoveStateHolder cordinateStateHolder, GameLogic logic,
			LevelCounterHolder levelCounterHolder, IconImageSelector imageSelector, JPanel[] panelArray,
			UnitJButton[][] playArena, JButton buttonNewLevel, JButton moveCounter) {
		this.cordinateStateHolder = cordinateStateHolder;
		this.logic = logic;
		this.levelCounterHolder = levelCounterHolder;
		this.imageSelector = imageSelector;
		this.panelArray = panelArray;
		this.playArena = playArena;
		this.buttonNewLevel = buttonNewLevel;
		this.moveCounter = moveCounter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cordinateStateHolder.setiCordinat((((UnitJButton) e.getSource()).getICordinat()));
		cordinateStateHolder.setjCordinat((((UnitJButton) e.getSource()).getJCordinat()));
		if (logic.getPlayUnit(cordinateStateHolder.getiCordinat(), cordinateStateHolder.getjCordinat()).getId() != 1
				&& logic.getPlayUnit(cordinateStateHolder.getiCordinat(), cordinateStateHolder.getjCordinat()).getId() < 6) {
			if (!logic.fullSavePlayUnitObject() && logic.getPlayUnit(cordinateStateHolder.getiCordinat(), cordinateStateHolder.getjCordinat()).getId() != 0) {
				playArena[cordinateStateHolder.getiCordinat()][cordinateStateHolder.getjCordinat()].setEnabled(false);
				logic.setSavePlayUnitByID(logic.getPlayUnit(cordinateStateHolder.getiCordinat(), cordinateStateHolder.getjCordinat()).getId(), cordinateStateHolder.getiCordinat(),
						cordinateStateHolder.getjCordinat());
			} else if (logic.fullSavePlayUnitObject() && logic.getPlayUnit(cordinateStateHolder.getiCordinat(), cordinateStateHolder.getjCordinat()).getId() == 0) {
				playArena[logic.getSavePlayUnit().getICordinat()][logic.getSavePlayUnit().getJCordinat()]
						.setEnabled(true);
				logic.delPlayUnit(logic.getSavePlayUnit().getICordinat(),
						logic.getSavePlayUnit().getJCordinat());
				logic.setPlayUnitByID(logic.getSavePlayUnit().getId(), cordinateStateHolder.getiCordinat(), cordinateStateHolder.getjCordinat());
				logic.delSavePlayUnit();
				logic.setPlayUnitInArrayBaseParametr();
				logic.setLazerFlow(8, 4);
				cordinateStateHolder.incrementMoveCounter();
				moveCounter.setText(String.valueOf(cordinateStateHolder.getMoveCounter()));
				for (int i = 0; i < panelArray.length - 1; i++) {
					for (int j = 0; j < playArena[i].length; j++) {
						playArena[i][j].setIcon(imageSelector.getIcon(logic.getPlayUnitName(i, j)));
					}
				}
				if (logic.getAmountOfDieMonster() == 4 && levelCounterHolder.getLevelCounter() == 0) {
					buttonNewLevel.setEnabled(true);
				} else if (logic.getAmountOfDieMonster() == 5 && levelCounterHolder.getLevelCounter() == 1) {
					new GameOverDialog(imageSelector);
					levelCounterHolder.setLevelCounter(2);
				}
			}
		}
	}
}