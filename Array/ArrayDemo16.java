/*
�ۼ��� : ����ȯ
�ۼ����� : Ŀ�ǵ���� ���� �Է� �ޱ�
�ۼ����� : 29/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ArrayDemo16 {
	public static void main(String[] args) {
		if(args.length != 3){
			System.out.println("Invaild Option");
			System.exit(0); // �ý��� ���� ����
		}
		int num1 = Integer.parseInt(args[0]); // String���� �ޱ⶧���� ����ȯ�ؾ���.
		char op = args[1].charAt(0); // Stirng���� char�� �ٲ�����Ѵ�.
		// �Ǵ� �ٷ� ��Ʈ������ �޾Ƽ� ����ϴ� �͵� �����ϴ�. String op = args[1];�ϰ� ����ġ ""�ٲٱ�
		int num2 = Integer.parseInt(args[2]);
		int result = 0;

		switch(op){
			case '+':
				result = num1 + num2; break;
			case '-':
				result = num1 - num2; break;
			case 'x':
				result = num1 * num2; break;
			case '/':
				result = num1 / num2; break;
			case '%':
				result = num1 % num2; break;
			default :
				System.out.println("Invails Operator.");
				System.exit(-1);
		}
		System.out.println("��� : "+result);
	}
}