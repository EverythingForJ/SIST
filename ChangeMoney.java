/*
�ۼ��� : ����ȯ
�ۼ����� : �Ž����� ����ϱ�
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pay=0, price = 0, change=0;
		
		System.out.print("��ǰ �ݾ��� �Է��ϼ��� : ");
		price = scan.nextInt();
		System.out.print("���� ���� �Է��ϼ��� : ");
		pay = scan.nextInt();

		change = pay - price;
		System.out.printf("�Ž��� ���� %d�Դϴ�.", change);
	}
}