/*
�ۼ��� : ����ȯ
�ۼ����� : �Է¹��� �⵵�� �������� �ƴ��� �����ϱ�
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo3 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);

		System.out.println("������ �˱� ���� ������ �Է����ּ��� ");
		int input = scan.nextInt();
		// ������ 400���� ���������� ��� or 4�� ���������� 100���� ������ ���� �ʴ� ����Դϴ�.
		if((input%400==0) || ((input%4==0) && (input%100!=0))){
			System.out.printf("%d���� �����Դϴ�.", input);
		}else{
			System.out.printf("%d���� ������ �ƴմϴ�.", input);
		}
	}
}