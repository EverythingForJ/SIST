public class Main {

	public static void main(String[] args) {
		Patient[] array = new Patient[5];
		
		Input input = new Input(array);
		int c = input.input();
		
		Calc calc = new Calc(array, c);
		calc.calc();
			
		Sorting sorting = new Sorting(array, c);
		sorting.quickSort(0, c - 1);

		Output output = new Output(array, c);
		output.output();
	}

}