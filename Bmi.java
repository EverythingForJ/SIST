/*
작성자 : 김준환
작성목적 : BMI지수 구하기
작성일지 : 20/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		double height, weight, bmi;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요(kg): ");
		weight = scan.nextDouble();
		
		System.out.print("키를 입력하세요(cm): ");
		height = scan.nextDouble();
		
		bmi = weight/(height/100*2);

		System.out.println("----------------------");
		System.out.printf("귀하의 BMI지수는 %.2f입니다\n", bmi);
	}
}