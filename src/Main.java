import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		
//		Telephone[] array = new Telephone[3]; // 텔레폰의 주소를 적기위한 수첩. 텔레폰을 만든 것이 아님.
		Vector<Telephone>vector = new Vector<Telephone>(10);
		
		Input input = new Input(vector);
		input.input();
		
		Calc calc = new Calc(vector);
		calc.calc();
		
		Sort sort = new Sort(vector);
		sort.sort();
		
		Output output = new Output(vector);
		output.output();
	}

}