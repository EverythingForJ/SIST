/*
작성자 : 김준환
작성목적 : 입력받은 정수를 소인수 분해하여 출력하기
작성일지 : 26/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("소인수 분해를 할 정수를 입력해주세요 : ");
		int num = scan.nextInt();
		
		System.out.printf("%d--> ", num);
		
		for (int i = 2; i <= num; i++) {
            while (num%i == 0) {
                System.out.printf("%-3d",i);
                num = num/i;
            }
		}
	}
}