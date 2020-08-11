

public class AbstractDemo {
	public static void main(String[] args) {
		Shape[] array = new Shape[3];
		array[0] = new Rectangle("Yellow", 100, 200);
		array[1] = new Triangle("Blue", 50, 300);
		array[2] = new Circle("Red", 80);
		
		for(Shape s : array) {
			System.out.println(s.toString());
			s.calcArea();
		}
	}
}
