/*
작성자 : 김준환
작성목적 : 성적관리프로그램(학번,이름,국어,영어,수학)
작성일지 : 20/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		String number, name;
		int kor, eng, math, total;
		double everage;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적 관리 프로그램");
		System.out.print("학번: ");
		number = scan.nextLine();
		
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

		System.out.println("----------정보 확인----------");
		System.out.printf("학번: %s\n이름: %s\n", number, name);
		System.out.printf("국어: %d\n영어: %d\n수학: %d\n", kor, eng, math);
		System.out.printf("총 점수: %d\n", total);
		System.out.printf("평균 점수: %.2f", everage);
	}
}