import java.io.IOException;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Patient> vector = new Vector<Patient>(5,5);
		
		Input input = new Input(vector);
		input.input();
		
		Calc calc = new Calc(vector);
		calc.calc();
			
		Sorting sorting = new Sorting(vector);
		sorting.sort();

		try {
		Output output = new Output(vector);
		output.output();
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}