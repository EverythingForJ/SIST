/*
�ۼ��� : ����ȯ
�ۼ����� : �����������α׷�(�й�,�̸�,����,����,����)
�ۼ����� : 20/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		String number, name;
		int kor, eng, math, total;
		double everage;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ���� ���α׷�");
		System.out.print("�й�: ");
		number = scan.nextLine();
		
		System.out.print("�̸�: ");
		name = scan.nextLine();

		System.out.print("����: ");
		kor = scan.nextInt();

		System.out.print("����: ");
		eng = scan.nextInt();

		System.out.print("����: ");
		math = scan.nextInt();

		total = kor+eng+math;
		everage = total/3.;

		System.out.println("----------���� Ȯ��----------");
		System.out.printf("�й�: %s\n�̸�: %s\n", number, name);
		System.out.printf("����: %d\n����: %d\n����: %d\n", kor, eng, math);
		System.out.printf("�� ����: %d\n", total);
		System.out.printf("��� ����: %.2f", everage);
	}
}