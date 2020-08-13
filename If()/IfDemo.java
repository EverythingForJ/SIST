/*
작성자 : 김준환
작성목적 : 조건문
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = scan.nextInt();
		// 1.
/*		if (score >= 60) System.out.println("필기 합격입니다.");
		if(score<60) System.out.println("아쉽습니다. 다음 기회에...");
		// 2.
		if (score >= 60){
			System.out.println("축하합니다.");
			System.out.println("필기 합격입니다.");
		} else{	// score < 60
			System.out.println("아쉽습니다. ");
			System.out.println("다음 기회에 다시 응시해주세요.");
		}
*/		// 3.
/*		if (score >= 90){
			System.out.println("축하합니다. Excellent!");
			System.out.println("필기 합격입니다.");
		} else if(score >= 60){	// 60 <= score < 90	
			System.out.println("축하합니다. Good~");
			System.out.println("필기 합격입니다.");
		} else if(score >= 50){	// 50 <= score < 60	
			System.out.println("너무 아쉽습니다. ");
			System.out.println("다음 기회에 다시 응시해주세요.");
		} else{
			System.out.println("불합격입니다");
			System.out.println("노답이네요");
*/		// 4.
		if(score >= 60){	
			System.out.println("필기 합격입니다.");
			if (score >= 90){
			System.out.println("축하합니다. Excellent!");
			} else System.out.println("축하합니다. Good~");
		} else {
			System.out.println("불합격입니다");
			if (score >= 50)System.out.println("너무 아쉽습니다. ");
			else System.out.println("노답이네요");
		}
	}
}