import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class GamePanel extends JPanel implements ActionListener{

	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int DELAY = 60;
	int x = 0;
	int y = 0;
	boolean running = false;
	Timer timer;
	
	
	
	GamePanel(){
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.setDoubleBuffered(true);
		startGame();
	}
	
	public void startGame() {
		running = true;
		timer = new Timer(DELAY, this);
		timer.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
		repaint();
	}
	
	public void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}
	
	public void move(int val) {
		x+=val;y+=val;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move(1);
		}
	}
	
}
