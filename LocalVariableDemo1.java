/*
�ۼ��� : ����ȯ
�ۼ����� : ���� ����
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class LocalVariableDemo1 {
	public static void main(String[] args) {
		double height; // ���� ����
		Scanner scan; // ���� ���� ����
		scan = new Scanner(System.in); // ����
		
		System.out.print("������ Ű�� ? ");
		height = scan.nextDouble();
		
		double inch = height  / 2.54; // ���� ����
		double feet = inch /12; // ���� ����
		System.out.printf("%.1fcm�� %.2f��Ʈ�̰�, %.2f��ġ�Դϴ�.\n", 
									height,		feet,				inch);
	}
}