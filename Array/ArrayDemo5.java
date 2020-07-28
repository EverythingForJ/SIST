/*
작성자 : 김준환
작성목적 : 문자열을 입력받아서 거꾸로 출력하기
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ArrayDemo5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = scan.nextLine();
		
		char[] a = str.toCharArray(); // string에서 char배열로 값받아오기

		System.out.printf("결과 : ");
		for(int i = a.length-1; i>=0; i--){
			System.out.print(a[i]);
		}
	}
}