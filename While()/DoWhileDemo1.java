/*
작성자 : 김준환
작성목적 : doWhile
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine(); // doWhile이라 초기화는 여기서도 할 수 있다.
			System.out.println(inputString);
		} while( ! inputString.equals("q") );
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}
}