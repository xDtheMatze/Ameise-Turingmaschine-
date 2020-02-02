package funktionen;

import main.Gui;

public class Field {
	
	public int x, y;
	public byte width, height;
	public boolean discolored = false;
	
	public Field(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = Gui.wh;
		this.height = Gui.wh;
	}
	
}
