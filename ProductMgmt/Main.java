import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Product[] array = new Product[2];
		
		new Input().input(array);
		new Calc().calculate(array);
		new Output().print(array);
	}
}