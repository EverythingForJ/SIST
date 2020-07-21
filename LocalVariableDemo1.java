/*
작성자 : 김준환
작성목적 : 지역 변수
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class LocalVariableDemo1 {
	public static void main(String[] args) {
		double height; // 지역 변수
		Scanner scan; // 지역 변수 선언
		scan = new Scanner(System.in); // 생성
		
		System.out.print("귀하의 키는 ? ");
		height = scan.nextDouble();
		
		double inch = height  / 2.54; // 지역 변수
		double feet = inch /12; // 지역 변수
		System.out.printf("%.1fcm는 %.2f피트이고, %.2f인치입니다.\n", 
									height,		feet,				inch);
	}
}