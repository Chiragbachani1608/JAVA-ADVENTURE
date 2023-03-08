package main;

import javax.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private MouseInputs mouseInputs;
	private int xDelta= 100, yDelta = 100;
	
	public GamePanel() {
		
		mouseInputs = new MouseInputs(this);
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(new mouseInputs());
		addMouseMotionListener(mouseInputs)
	}
	public voidchangeXDelta(int value) {
		this.xDelta += value;
		repaint();
	}
	public voidchangeYDelta(int value) {
		this.YDelta += value;
		repaint();
	}
	
	public void setRectpos(int x, int y) {
		this.xDelta =x;
		this.yDelta =y;
		repaint(;)
	}
	
	public void paintComponent(Graphics g) {
		super.paintcomponent(g);
		
		g.fillRect(xDelta, yDelta, 200, 50);
		
	}
}