package com.bestproject.doomd.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.bestproject.doomd.utils.GameInfoDialog;
import com.bestproject.doomd.utils.IconImageSelector;

public class ButtonInfoActionListener implements ActionListener {
	
	private IconImageSelector imageSelector;
	
	public ButtonInfoActionListener(IconImageSelector imageSelector) {
		this.imageSelector = imageSelector;
	}

	public void actionPerformed(ActionEvent e) {
		new GameInfoDialog(imageSelector);
	}
}
