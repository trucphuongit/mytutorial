package model;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

public abstract class Entity {
	// toa do ban dau
	protected Position position;
	protected int width;
	protected int height;
	protected String image;
	protected EntityManager entityManager;

	public Entity(Position position) {
		super();
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position p) {
		this.position = p;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle getBound() {
		return new Rectangle(position.getX(), position.getY(), width, height);
	}

	public void toBeKilled() {

	}

	public abstract void draw(Graphics2D g2D);
}
