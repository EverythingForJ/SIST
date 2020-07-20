/*
작성자 : 김준환
작성목적 : cm을 피트와 인치로 변환
작성일지 : 20/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ChangeFeetInch {
	public static void main(String[] args) {
		double height, feet, inch;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(cm): ");
		height = scan.nextDouble();
		inch = height/2.54;
		feet = inch/12.;
		System.out.println("----------------------");
		System.out.printf("피트: %.2f\n", feet);
		System.out.printf("인치: %.2f\n", inch);
	}
}