/*
�ۼ��� : ����ȯ
�ۼ����� : ���� ũ��, ���� �� ã��
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("------3���� ������ �Է����ּ���.------");
		System.out.print("ù°�� : ");
		int first = scan.nextInt();
		System.out.print("��°�� : ");
		int second = scan.nextInt();
		System.out.print("��°�� : ");
		int third = scan.nextInt();
		int max, min=0;
		
		max=first;
		if(max<second)max=second;
		if(max<third)max=third;

		min=first;
		if(min>second)min=second;
		if(min>third)min=third;

/*		if(first > second) {
			if(first > third) max = first;
			else max = third;
		}else{
			if(second > third) max = second;
			else max = third;
		}
*/
		System.out.println("------���� ��------");
		System.out.printf("%d�� ���� Ů�ϴ�.\n", max);
		System.out.printf("%d�� ���� �۽��ϴ�.", min);
	}
}