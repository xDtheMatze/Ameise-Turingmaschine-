package funktionen;

import main.Gui;

public class GameClock extends Thread {
	public static boolean running = false;
	
	public void run() {
		while(running) {
			try {
				//Timer (ms)
				sleep(4);
				
				System.out.println("Schritt Nummer:  " + Gui.step);
				
				//If the field isn`t discolored, show at the right and do a step
				if(!Gui.field[Gui.ant.x/Gui.wh][Gui.ant.y/Gui.wh].discolored) {
					Gui.field[Gui.ant.x/Gui.wh][Gui.ant.y/Gui.wh].discolored = true;
					switch(Ant.see) {
					case "DOWN":
						Ant.see = "LEFT";
						Gui.ant.x-=Gui.wh;
						break;
					case "LEFT":
						Ant.see = "UP";
						Gui.ant.y-=Gui.wh;
						break;
					case "UP":
						Ant.see = "RIGHT";
						Gui.ant.x+=Gui.wh;
						break;
					case "RIGHT":
						Ant.see = "DOWN";
						Gui.ant.y+=Gui.wh;
						break;
					}
				}
				
				//If the field is discolored, show at the left and do a step
				else if(Gui.field[Gui.ant.x/Gui.wh][Gui.ant.y/Gui.wh].discolored) {
					Gui.field[Gui.ant.x/Gui.wh][Gui.ant.y/Gui.wh].discolored = false;
					switch(Ant.see) {
					case "DOWN":
						Ant.see = "RIGHT";
						Gui.ant.x+=Gui.wh;
						break;
					case "LEFT":
						Ant.see = "DOWN";
						Gui.ant.y+=Gui.wh;
						break;
					case "UP":
						Ant.see = "LEFT";
						Gui.ant.x-=Gui.wh;
						break;
					case "RIGHT":
						Ant.see = "UP";
						Gui.ant.y-=Gui.wh;
						break;
					}
				}
				
				//Put the ant from the one to the other side while overstep a side
				if(Gui.ant.x/Gui.wh >= Gui.width/Gui.wh) Gui.ant.x = 0;
				if(Gui.ant.x < 0) Gui.ant.x = Gui.width-Gui.wh;
				if(Gui.ant.y/Gui.wh >= Gui.height/Gui.wh) Gui.ant.y = 0;
				if(Gui.ant.y < 0) Gui.ant.y = Gui.height-Gui.wh;
				
				
				Gui.step++;
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
