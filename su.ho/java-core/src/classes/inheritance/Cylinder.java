package classes.inheritance;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		super();
		height = 1;
	}

	public Cylinder(Double height, double radius, String color) {
		super(radius, color);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolumn() {
		return getArea() * height;
	}
}
