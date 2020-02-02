package main;

import javax.swing.JFrame;

import bilder.Draw;
import funktionen.Ant;
import funktionen.Field;
import handler.KeyHandler;

public class Gui {
	
		static JFrame jf;
		static Draw d;
		public static byte wh = 10;
		public static long step = 0;
		
		//breite | hoehe des fensters
		public static int width = 1000, height = 1000;
		
		public static Field field[][] = new Field[width/wh][height/wh];
		public static Ant ant;
		
	public void createGui() {
		
		//Generate the fields
		for(int x = 0; x < width/wh; x++) {
			for(int y = 0; y < height/wh; y++) {
				field[x][y] = new Field(x*wh, y*wh);
			}
		}
		
		//Generate the ant
		ant = new Ant(49*wh, 49*wh);
		
		jf = new JFrame("Ameisen (Turingmaschine)");
		jf.setSize(width, height);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.addKeyListener(new KeyHandler());
		
		d = new Draw();
		d.setSize(width, height);
		d.setVisible(true);
		d.requestFocus();
		jf.add(d);
		
		jf.setVisible(true);
	}
}
