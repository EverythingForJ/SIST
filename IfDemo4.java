/*
작성자 : 김준환
작성목적 : BMI 계산하기
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);

		System.out.println("---- 당신의 체중 상태는??----");
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.print("몸무게 : ");
		double weight = scan.nextDouble();
		
		double bmi = weight/((height/100)*2);
		String result;
		
		if(bmi>=40){
			result="고도 비만";
		}else if(bmi>=35){
			result="중등도 비만";
		}else if(bmi>=30){
			result="경도 비만";
		}else if(bmi>=25){
			result="과체중";
		}else if(bmi>=18.5){
			result="정상";
		}else{
			result="저체중";
		}

		System.out.print("----------------- BMI 결과 -------------------");
		System.out.printf("%s님의 BMI지수는 %.2f이고 %s입니다.\n", name, bmi, result);
	}
}