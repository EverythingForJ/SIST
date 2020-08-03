
public class Main {

	public static void main(String[] args) {
		Student [] array = new Student[3];
		Input.input(array);
		Calc.calc(array);
		Sorting.insertionSort(array);
		Output.output(array);
	}
}