package model;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import view.ImageSingleton;

public class Player extends MoveableObj implements KeyObserver {
	private int maxBomb;
	private int numberOfBombWasCreated;

	public Player(Position position, int maxBomb) {
		super(position);
		this.maxBomb = maxBomb;
		this.speed = 2;
		moveBehavior = new Moving(this, speed);
	}

	public void createBomb() {
	}

	public Image getPlayerImage() {
		ImageIcon ic = new ImageIcon("playerImage/player.gif");
		return ic.getImage();
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getPlayerImage(), position.getX(), position.getY(), null);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_W) {
			this.direction = direction.Up;
		} else if (key == KeyEvent.VK_D) {
			this.direction = direction.Right;
		} else if (key == KeyEvent.VK_S) {
			this.direction = direction.Down;
		} else if (key == KeyEvent.VK_A) {
			this.direction = direction.Left;
		} else if (key == KeyEvent.VK_SPACE) {
			createBomb();

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_W||key==KeyEvent.VK_D|| key==KeyEvent.VK_S||key == KeyEvent.VK_A){
			this.position.getX();
			this.position.getY();
		}
	}
	public void update(){
		this.moveBehavior.moving();
	}

}
