package Game;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

public class RectObj extends Rectangle {
	
	public Color color; 
	
	public int contador = 1;
	Spawner spawner = new Spawner();
	
	
	
	public int speed = 0;
	
	public int rotation = 0;

	 public RectObj(int x, int y, int width, int heigth) {
		 super(x, y, width, heigth);
		 
		 color = new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
	 
		 speed = new Random().nextInt(8-4)+4;
	 }
	 
	 public void update() {
		
		
		 
	
		 
		 x+=speed;
		 rotation+=4;
		 if(rotation >= 360) {
			 rotation = 0;
		 }
	 }
}
