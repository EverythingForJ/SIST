/*
�ۼ��� : ����ȯ
�ۼ����� : ����� ���Ǳ��ϱ�
�ۼ����� : 20/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
		double height, radius, bulk;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ظ��� �������� �Է��ϼ���: ");
		radius = scan.nextDouble();
		
		System.out.print("������� ���̸� �Է��ϼ���: ");
		height = scan.nextDouble();
		
		bulk = height*radius*radius*3.14;

		System.out.println("----------------------");
		System.out.printf("������� ���� : %.2f\n", bulk);
	}
}