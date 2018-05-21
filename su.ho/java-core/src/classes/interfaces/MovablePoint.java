package classes.interfaces;

public class MovablePoint implements Movable {
	int x, y;
	int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		System.out.println("MoveUp");
	}

	@Override
	public void moveDown() {
		System.out.println("MoveDown");
	}

	@Override
	public void moveLeft() {
		System.out.println("MoveLeft");
	}

	@Override
	public void moveRight() {
		System.out.println("MoveRight");
	}
	
	public static void main(String[] args) {
		MovablePoint point = new MovablePoint(0, 0, 10, 10);
		point.moveDown();
	}
}
