/*
�ۼ��� : ����ȯ
�ۼ����� : ���� ����
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/
/*
	�������� : local variable, stack variable, outomatic variable, temporary variable.
	- Ư�� �޼ҵ� Ȥ�� Ư�� block���� ����� �Լ�
	- Ư�� �޼ҵ峪 Ư�� ����� ����� �ڵ� �Ҹ�ǰ�, �� ���� ������ ������ �ڵ� ����
	- �ݵ�� ����ϱ� ���� �ʱ�ȭ�ؾ� �Ѵ�.
*/
import java.util.Scanner;
import java.util.Calendar;

public class LocalVariableDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int yearOfBorn; // ���� ����

		System.out.print("������ ����⵵�� ?: ");
		yearOfBorn = scan.nextInt(); // �� �� �ʱ�ȭ�� �ȴ�. ���Ǳ��������� �ʱ�ȭ�ϸ�ȴ�.
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year-yearOfBorn+1; // ���� ����
		System.out.println("������ ���̴� "+age+"���̱���.");


/*		int avg; // �Լ� �ȿ��� ������� ���� ����.
		{
			int age; // ��� �ȿ��� ������� ���� ����.
			// ��� ����� ���� �ڵ� �Ҹ��Ͽ� ��� �ۿ��� �� ����.
			System.out.println("age =" +age); // �ʱ�ȭ�� ���ϸ� ���Ұ�(�̹̾����Ⱚ�̵��ֱ⶧
		}
*/
	}
}