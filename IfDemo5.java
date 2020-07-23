/*
작성자 : 김준환
작성목적 : 가장 크고, 작은 수 찾기
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("------3개의 정수를 입력해주세요.------");
		System.out.print("첫째수 : ");
		int first = scan.nextInt();
		System.out.print("둘째수 : ");
		int second = scan.nextInt();
		System.out.print("셋째수 : ");
		int third = scan.nextInt();
		int max, min=0;
		
		max=first;
		if(max<second)max=second;
		if(max<third)max=third;

		min=first;
		if(min>second)min=second;
		if(min>third)min=third;

/*		if(first > second) {
			if(first > third) max = first;
			else max = third;
		}else{
			if(second > third) max = second;
			else max = third;
		}
*/
		System.out.println("------수의 비교------");
		System.out.printf("%d가 가장 큽니다.\n", max);
		System.out.printf("%d가 가장 작습니다.", min);
	}
}