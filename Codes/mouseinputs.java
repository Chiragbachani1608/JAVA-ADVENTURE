package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements Mouselistener,MouseMotionListener {

	private GamePanel gamePanel;
	public MouseInputs(GamePanel gamePanel) {
		this.gamePanel= gamePanel;
	}
}