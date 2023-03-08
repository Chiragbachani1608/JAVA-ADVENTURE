package inputs;

import java.awt.event.KeyEvent;

public class KeyboardInputs implements KeyListener{
	
	private GamePanel gamePanel;
	public 	KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
		
	}
	
	private void keyPressed(keyEvent e) {
	switch (e.getKeyCode())	{
	
	case KeyEvent.VK_W:
		gamePanel.changeYDelta(-5);
		break;
	case KeyEvent.VK_A:
		gamePanel.changeXDelta(-5);
		break;
	case KeyEvent.VK_S:
		gamePanel.changeYDelta(5);
		break;
	case KeyEvent.VK_D:
		gamePanel.changeXDelta(5);
		break;
	
	}

	}

}