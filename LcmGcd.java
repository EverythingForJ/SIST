/*
작성자 : 김준환
작성목적 : 두 개의 정수를 입력받아 최대공약수와 최소공배수 구하기
작성일지 : 25/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class LcmGcd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("최대공약수, 최소공배수 계산 프로그램");
		System.out.print("첫째수 : ");
		int fir = scan.nextInt();
		System.out.print("둘째수 : ");
		int sec = scan.nextInt();
		
		int gcd=0, lcm=0;
		
		// 최대공약수  구하기
		for (int i=1; i<=fir; i++){
			if((fir%i==0) && (sec%i==0)){
				gcd = i;
			}
		}

		// 최소공배수  구하기
		lcm = (fir*sec)/gcd;
		
		System.out.println("-----------------------------------");
		System.out.printf("%d와 %d의 GCM은 %d이고 LCM은 %d입니다.",
						  fir, sec,		gcd,	   lcm);

	}
}