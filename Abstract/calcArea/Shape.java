

public abstract class Shape {
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public abstract void calcArea();
	public abstract String toString();
}
