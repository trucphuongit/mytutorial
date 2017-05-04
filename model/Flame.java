package model;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Flame extends Entity {
	private static final int Flame_Time = 1000;
	private Timer fTimer;

	public Flame(Position position) {
		super(position);
		fTimer.schedule(new TimerTask() {

			@Override
			public void run() {
				remove();

			}

			

		}, Flame_Time);

	}
	public void remove(){
		toBeKilled();
	}

	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		
	}


}
