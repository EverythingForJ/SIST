/*
�ۼ��� : ����ȯ
�ۼ����� : ��� ������
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class OpDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first, second; // ����
		System.out.print("ù��° ���� : "); first = scan.nextInt();
		System.out.print("�ι�° ���� : "); second = scan.nextInt();
		System.out.printf("%d + %d = %d\n", first, second, (first +second));
		System.out.printf("%d - %d = %d\n", first, second, (first -second));
		System.out.printf("%d x %d = %d\n", first, second, (first *second));
		System.out.printf("%d / %d = %d\n", first, second, (first /second));
		System.out.printf("%d %% %d = %d\n", first, second, (first %second));
	}
}