

public class Main {
	public static void main(String[] args) {
		
		Telephone[] array = new Telephone[3]; // �ڷ����� �ּҸ� �������� ��ø. �ڷ����� ���� ���� �ƴ�.
		
		Input input = new Input(array);
		input.input();
		
		Calc calc = new Calc();
		calc.calc(array);
		
		Output output = new Output();
		output.output(array);
	}

}