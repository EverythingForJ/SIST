/*
작성자 : 김준환
작성목적 : 문자열비교
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class SeasonFlower {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input, output;

		System.out.println("좋아하는 계절(spring/summer/fall/winter) : ");
		input = scan.nextLine();
		
		output=input.equals("spring")?"개나리, 진달래":
						input.equals("summer")?"장미, 아카시아":
								input.equals("fall")?"백합, 코스모스":"동백, 매화";

		System.out.println("-----------------결과-----------------");
		System.out.printf("선택한 계절 : %s\n",input);
		System.out.printf("꽃  : %s", output);
	}
}