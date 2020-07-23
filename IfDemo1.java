/*
작성자 : 김준환
작성목적 : 홀짝 구분하기
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo1 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		if ( ( number % 2 ) == 0){
			System.out.println("짝수입니다.");
		} else if( number == 0){
			System.out.println("0 입니다");
		} else{
			System.out.println("홀수입니다");
		}
	}
}