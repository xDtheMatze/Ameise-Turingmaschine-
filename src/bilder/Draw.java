package bilder;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

import main.Gui;

public class Draw extends JLabel {
	
	Gui gui = new Gui();
	int z = 0;
	
	protected void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		for(int x = 0; x < Gui.width/Gui.wh; x++) {
			for(int y = 0; y < Gui.height/Gui.wh; y++) {
				//Query for discoloration
				if(!Gui.field[x][y].discolored) {
					g.setColor(new Color(230, 230, 230, 255));
				} else if(Gui.field[x][y].discolored) {
					g.setColor(new Color(120, 120, 120, 255));
				}
				
				//Draw the fields
				g.fillRect(Gui.field[x][y].x, Gui.field[x][y].y, Gui.field[x][y].width, Gui.field[x][y].height);
				
				//Draw the ant
				g.setColor(Color.RED);
				g.fillRect(Gui.ant.x, Gui.ant.y, Gui.ant.width, Gui.ant.height);
				
			}
		}
		
		repaint();
	}
	
}
