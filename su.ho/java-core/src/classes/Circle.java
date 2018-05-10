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
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return String.format("Circle[radius=%.2f, color=%s, area=%.2f]", getRadius(), getColor(), getArea());
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(2);
		System.out.println(circle.toString());
	}
}
