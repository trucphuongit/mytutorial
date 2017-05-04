package model;

import java.awt.Graphics2D;

public class MoveableObj extends Entity {

	protected Direction direction;
	protected int speed;
	protected MoveBehavior moveBehavior;

	public MoveableObj(Position position) {
		super(position);
		this.direction = direction;
		this.speed = speed;
		this.moveBehavior = moveBehavior;
	}


	@Override
	public void draw(Graphics2D g2d) {

	}

}
