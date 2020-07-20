/*
작성자 : 김준환
작성목적 : Scanner
작성일지 : 20/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
/*		System.out.print("귀하의 나이는 ? ");
		Scanner scan = new Scanner(System.in); // 1단계
		int age;
		age = scan.nextInt(); // 입력 버퍼에서 한 개의 정수를 읽어들이는 함수
		System.out.println("귀하의 나이는 "+age+"살이군요.");
		// System.out.printf("귀하의 나이는 %d살이군요.\n", age);

		double height; //1. 값 변수 선언
		double weight;
		
		Scanner scan; //1. 주소 변수 선언
		scan = new Scanner(System.in); // 주소할당
		
		System.out.print("키 : ");
		height = scan.nextDouble(); // 값 할당
		System.out.print("몸무게 : ");
		weight = scan.nextDouble(); // 값 할당
		System.out.printf("키 = %.1fcm\t몸무게 = %.1fkg\n ",height,weight);		
*/
		String name; // 주소 변수 선언
		Scanner scan;// 주소 변수 선언

		scan = new Scanner(System.in);
		System.out.print("성명 : ");
		name = scan.next(); // 주소 변수 할당
		System.out.println("귀하의 이름은"+name+"이군요.");
	}
}