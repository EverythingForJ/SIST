

public class Main {
	public static void main(String[] args) {
		
		Telephone[] array = new Telephone[3]; // 텔레폰의 주소를 적기위한 수첩. 텔레폰을 만든 것이 아님.
		
		Input input = new Input(array);
		input.input();
		
		Calc calc = new Calc();
		calc.calc(array);
		
		Output output = new Output();
		output.output(array);
	}

}