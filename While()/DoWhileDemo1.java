/*
�ۼ��� : ����ȯ
�ۼ����� : doWhile
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine(); // doWhile�̶� �ʱ�ȭ�� ���⼭�� �� �� �ִ�.
			System.out.println(inputString);
		} while( ! inputString.equals("q") );
		
		System.out.println();
		System.out.println("���α׷� ����");
		
	}
}