package main;

public class Game {
	private GameWindow gamewindow;
	private Gamepanel gamePanel;
	
	public Game() {
		gamePanel = new GamePanel();
		gamewindow = new GameWindow(gamePanel);
		gamePanel.requestFocus();
	}

}