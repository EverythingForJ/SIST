/*
�ۼ��� : ����ȯ
�ۼ����� : BMI���� ���ϱ�
�ۼ����� : 20/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		double height, weight, bmi;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Ը� �Է��ϼ���(kg): ");
		weight = scan.nextDouble();
		
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		height = scan.nextDouble();
		
		bmi = weight/(height/100*2);

		System.out.println("----------------------");
		System.out.printf("������ BMI������ %.2f�Դϴ�\n", bmi);
	}
}