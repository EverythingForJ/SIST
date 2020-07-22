/*
작성자 : 김준환
작성목적 : 거스름돈 계산하기
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pay=0, price = 0, change=0;
		
		System.out.print("상품 금액을 입력하세요 : ");
		price = scan.nextInt();
		System.out.print("받은 돈을 입력하세요 : ");
		pay = scan.nextInt();

		change = pay - price;
		System.out.printf("거스름 돈은 %d입니다.", change);
	}
}