package model;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Moving implements MoveBehavior{
	private int dY = 0, dX = 0;
	Player player;
	private int speed;

	public Moving(Player player, int speed) {
		super();
		this.player = player;
		this.speed = speed;
	
	}

	@Override
	public void moving() {
		
		switch (player.direction) {
		case Up:
			dY-=speed;
			break;
		case Down:
			dY+=speed;
			break;
		case Left:
			dX-=speed;
			break;
		case Right:
			dX+=speed;
			break;

		
			
		}
	}

	public void executeMoving(Player player,Moving moving) {
		dX+=player.position.getX();
		dY+=player.position.getY();
		player.setPosition(new Position(dX, dY));

	}
	

	
	

	

}
