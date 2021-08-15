package com.bestproject.doomd.utils;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameInfoDialog extends JDialog {

	private static final long serialVersionUID = -4209003106243068360L;

	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	private int screenWith = screenSize.width;
	private int screenHeight = screenSize.height;

	public GameInfoDialog(IconImageSelector imageSelector) {
		super();
		Image image = imageSelector.getNativeIconeByName("Doom").getImage();
		setIconImage(image);
		JPanel panel = new JPanel();
		panel.setLayout(null);

		JButton monster = new UnitJButton();
		monster.setIcon(imageSelector.getIcon("MonsterL"));
		monster.setBounds(5, 5, 87, 80);
		panel.add(monster);

		JLabel monsterLable = new JLabel();
		monsterLable.setText("<html>" + "Это монстр. Цель игры - уничтожить всех монстров." + "</html>");
		monsterLable.setBounds(100, 5, 100, 80);
		panel.add(monsterLable);

		JButton lazer = new UnitJButton();
		lazer.setIcon(imageSelector.getIcon("Weapon"));
		lazer.setBounds(5, 100, 87, 80);
		panel.add(lazer);

		JLabel lazerLable = new JLabel();
		lazerLable.setText("<html>"
				+ "Это лазерное оружие. Излучает заряженый поток частиц по прямой линии. Лазерное оружие стационарное и НЕ подлежит перемещению."
				+ "<br></html>");
		lazerLable.setBounds(100, 100, 250, 80);
		panel.add(lazerLable);

		JButton mirrow = new UnitJButton();
		mirrow.setIcon(imageSelector.getIcon("MirrorLUR"));
		mirrow.setBounds(5, 200, 87, 80);
		panel.add(mirrow);

		JLabel mirrowLable = new JLabel();
		mirrowLable.setText("<html>"
				+ "Это зеркало-отражатель лазерного луча. Отражение доступно под прямым углом в соответствии с геометрией зеркала. "
				+ "Расположение зеркал динамично, Вы можете менять их место положения. "
				+ "Зеркало-отражатель можно перемищать ТОЛЬКО на пустые ячейки. Для перемещения Вам необходимо:"
				+ "<br>" + "1) Один клик на нужное зеркало-отражатель;" + "<br>" + "2) Один клик на пустую ячейку."
				+ "</html>");
		mirrowLable.setBounds(100, 200, 650, 80);
		panel.add(mirrowLable);
		
		JButton wall = new UnitJButton();
		wall.setIcon(imageSelector.getIcon("Wall"));
		wall.setBounds(5, 300, 87, 80);
		panel.add(wall);

		JLabel wallLable = new JLabel();
		wallLable.setText("<html>" + "Это металлическая стена. Стена стационарная и НЕ подлежит перемещению. Стена НЕ отражает лазерный луч." + "</html>");
		wallLable.setBounds(100, 300, 200, 80);
		panel.add(wallLable);

		add(panel);
		setTitle("DoomD Information");
		setResizable(false);
		setSize(screenWith * 2/3, 415);
		setVisible(true);
		setLocation(screenWith / 5, screenHeight / 5);
	}
}
