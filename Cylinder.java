/*
작성자 : 김준환
작성목적 : 원기둥 부피구하기
작성일지 : 20/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
		double height, radius, bulk;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("밑면의 반지름을 입력하세요: ");
		radius = scan.nextDouble();
		
		System.out.print("원기둥의 높이를 입력하세요: ");
		height = scan.nextDouble();
		
		bulk = height*radius*radius*3.14;

		System.out.println("----------------------");
		System.out.printf("원기둥의 부피 : %.2f\n", bulk);
	}
}