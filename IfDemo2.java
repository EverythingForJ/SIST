/*
작성자 : 김준환
작성목적 : 입력받은 계절에 따른 꽃 출력하기 ( if문 )
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo2 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		String input, output;

		System.out.println("좋아하는 계절(영어 또는 한글 입력) : ");
		input = scan.nextLine();
		
		if(input.equals("spring") || input.equals("봄") ){
			output = "개나리, 진달래";
		} else if(input.equals("summer")|| input.equals("여름") ){
			output="장미, 아카시아";
		} else {
			output="백합, 코스모스";
		} 
		System.out.println("-----------------결과-----------------");
		System.out.printf("선택한 계절 : %s\n",input);
		System.out.printf("꽃  : %s", output);
	}
}