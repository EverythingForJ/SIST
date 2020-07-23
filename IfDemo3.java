/*
작성자 : 김준환
작성목적 : 입력받은 년도가 윤년인지 아닌지 구분하기
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo3 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);

		System.out.println("윤년을 알기 위한 연도를 입력해주세요 ");
		int input = scan.nextInt();
		// 윤년은 400으로 나누어지는 경우 or 4로 나누어지며 100으로 나누어 지지 않는 경우입니다.
		if((input%400==0) || ((input%4==0) && (input%100!=0))){
			System.out.printf("%d년은 윤년입니다.", input);
		}else{
			System.out.printf("%d년은 윤년이 아닙니다.", input);
		}
	}
}