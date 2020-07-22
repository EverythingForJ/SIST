/*
작성자 : 김준환
작성목적 : 성적관리시스템
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
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
		System.out.println("성적 관리 프로그램");
		System.out.print("학번: ");
		idNumber = scan.nextLine();
		
		System.out.print("이름: ");
		name = scan.nextLine();

		System.out.print("국어: ");
		kor = scan.nextInt();

		System.out.print("영어: ");
		eng = scan.nextInt();

		System.out.print("수학: ");
		math = scan.nextInt();

		total = kor+eng+math;
		everage = total/3.;

		grade = (everage>=90)?'A':
							(everage>=80)?'B':
									 (everage>=70)?'c':
												(everage>=60)?'D':'F';
	}

	void printInformation(){
		System.out.println("--------------정보 확인--------------");
		System.out.printf("학번: %s\n이름: %s\n", idNumber, name);
		System.out.printf("국어: %d\n영어: %d\n수학: %d\n", kor, eng, math);
		System.out.printf("총 점수: %d\n", total);
		System.out.printf("평균 점수: %.2f\n", everage);
		System.out.printf("평점: %c", grade);
	}
}