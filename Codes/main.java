package main;

import javax.swing.JFrame;

public class GameWindow {
	private JFrame jframe;
 public GameWindow(GamePanel gamePanel) {
	 
	 jframe = new JFrame();
	 
	 jframe.setsize(400 , 400);
	 jframe.DefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 jframe.add(gamePanel);
	 jframe.setLocationRelativeTo(null);
	 jframe.setvisible(true);
 }
}