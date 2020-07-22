/*
�ۼ��� : ����ȯ
�ۼ����� : ���������ý���
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class SungjukMgmtV3 {
	public static void main(String[] args) {
		Student jimin = new Student();
		jimin.sungjukInput();
		jimin.printInformation();
	}
}

class Student{
	String idNumber, name;
	int kor, eng, math, total;
	double everage;
	char grade;
	Scanner scan = new Scanner(System.in);
	
	void sungjukInput(){
		System.out.println("���� ���� ���α׷�");
		System.out.print("�й�: ");
		idNumber = scan.nextLine();
		
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

		grade = (everage>=90)?'A':
							(everage>=80)?'B':
									 (everage>=70)?'c':
												(everage>=60)?'D':'F';
	}

	void printInformation(){
		System.out.println("--------------���� Ȯ��--------------");
		System.out.printf("�й�: %s\n�̸�: %s\n", idNumber, name);
		System.out.printf("����: %d\n����: %d\n����: %d\n", kor, eng, math);
		System.out.printf("�� ����: %d\n", total);
		System.out.printf("��� ����: %.2f\n", everage);
		System.out.printf("����: %c", grade);
	}
}