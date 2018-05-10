package classes;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1;
		color = "black";
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "radius: " + getRadius() + "\ncolor: " + getColor() + "\narea: " + getArea();
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Circle:\n" + circle.toString());
	}	
}
