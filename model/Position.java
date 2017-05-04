package model;

public class Position {
	private int x;
	private int y;

	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//	// di chuyen len
//	public Position up(int speed) {
//		return new Position(x, y - speed);
//	}
////di chuyen xuong
//	public Position down(int speed) {
//		return new Position(x, y + speed);
//	}
////di chuyen sang trai
//	public Position left(int speed) {
//		return new Position(x - speed, y);
//	}
//// di chuyen sang phai
//	public Position right(int speed) {
//		return new Position(x + speed, y);
//	}
//	
//	
}
