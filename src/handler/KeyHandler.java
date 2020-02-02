package handler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import funktionen.GameClock;

public class KeyHandler implements KeyListener{
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		//Press Enter to start/stop the process
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(GameClock.running) GameClock.running = false;
			else if(!GameClock.running) GameClock.running = true;
			
			GameClock gc = new GameClock();
			gc.start();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
