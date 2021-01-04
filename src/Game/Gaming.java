package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Gaming {

	public boolean over = false;
	public boolean started = false;
	
	public Game game = new Game();
	
	public void render(Graphics g) {
		
		g.setColor(Color.white);
		
		g.setFont(new Font("Arial",Font.BOLD,30));
		g.drawString("Start!",game.WIDTH/2 - 100, game.HEIGHT/2 - 50);
		
	}
	
	
	
}
