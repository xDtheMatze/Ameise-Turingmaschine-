package funktionen;

import main.Gui;

public class Ant {
	public int x, y;
	public byte width, height;
	public static String see = "DOWN";
	
	public Ant(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = Gui.wh;
		this.height = Gui.wh;
	}
}
