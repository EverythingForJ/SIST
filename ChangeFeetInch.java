/*
�ۼ��� : ����ȯ
�ۼ����� : cm�� ��Ʈ�� ��ġ�� ��ȯ
�ۼ����� : 20/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ChangeFeetInch {
	public static void main(String[] args) {
		double height, feet, inch;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		height = scan.nextDouble();
		inch = height/2.54;
		feet = inch/12.;
		System.out.println("----------------------");
		System.out.printf("��Ʈ: %.2f\n", feet);
		System.out.printf("��ġ: %.2f\n", inch);
	}
}