/*
작성자 : 김준환
작성목적 : 산술 연산자
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class OpDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first, second; // 선언
		System.out.print("첫번째 숫자 : "); first = scan.nextInt();
		System.out.print("두번째 숫자 : "); second = scan.nextInt();
		System.out.printf("%d + %d = %d\n", first, second, (first +second));
		System.out.printf("%d - %d = %d\n", first, second, (first -second));
		System.out.printf("%d x %d = %d\n", first, second, (first *second));
		System.out.printf("%d / %d = %d\n", first, second, (first /second));
		System.out.printf("%d %% %d = %d\n", first, second, (first %second));
	}
}