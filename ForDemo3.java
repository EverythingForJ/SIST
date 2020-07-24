/*
작성자 : 김준환
작성목적 : for(;;)연습, 구구단 // the multiplication table
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ForDemo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("몇 단 ?? :");
		int num = scan.nextInt();
		
		for(int i = 1; i <=9; i++ ){
			System.out.printf("%d x %d = %d\n",num, i, (num*i));	
		}
	}
}