package model;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Bomb extends Entity implements ActionListener {
	private final static int BOMB_TIME = 1000;
	private javax.swing.Timer bTimer;


	
	public Bomb(Position position) {
		super(position);
		bTimer= new javax.swing.Timer(BOMB_TIME, this);
		bTimer.start();
		this.addFlame(position);
	}

	

	public  int getBomb_Time() {
		return BOMB_TIME;
	}
	public void addFlame(Position p) {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void toBeKilled() {
		// TODO Auto-generated method stub
		
	}
	
}
