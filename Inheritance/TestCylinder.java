public class TestCylinder{
	public static void main(String[] args) {
		
		Cylinder obj1 = new Cylinder();
		System.out.println(obj1);
		
		System.out.println("============================================");
		
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		System.out.println(obj2);
	}
}

class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI *Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "radius = " + radius +", Area = "+ getArea();
	}
	
}

class Cylinder extends Circle{
	private double height;

	public Cylinder() {
		
	}
	
	public Cylinder(double radius) {
		super(radius);
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return this.height * this.getArea();
	}
	
	@Override
	public String toString() {
		return String.format("반지름 = %.1f, 높이 = %.1f, 원넓이 = %.1f, 부피 = %.1f", this.getRadius(), this.height, this.getArea(), this.getVolume());
	}
	
}