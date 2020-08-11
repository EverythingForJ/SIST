

public class Circle extends Shape {

	private int radius;
	
	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void calcArea() {
		System.out.println("면적 = "+Math.pow(this.radius,2)*Math.PI);
	}

	@Override
	public String toString() {
		return String.format("반지름 = %d", this.radius);
	}

}
