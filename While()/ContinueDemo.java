/*
작성자 : 김준환
작성목적 : continue
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ContinueDemo {
	public static void main(String[] args) {
/*		int i= 1;
		do{
		if(i&7==0)System.out.printf("%-3d",i);
		else continue; // 7의 배수가 아니면 증감으로 가기 // 쓰나안쓰나 똑같다.
			i++;
		}while(i<101);
*/
		// continue를 꼭 써야하는 상황은?
		Scanner scan = new Scanner(System.in);
		String system_password="1234";
		System.out.print("Enter a password : ");
		String user_password = scan.nextLine();
		int i = 0;
		for(; i<4; i++){
			if(system_password.charAt(i)==user_password.charAt(i)) continue;
			else break;
		}
		if(i==4) System.out.println("Login Success");
		else System.out.println("Login Failure");
	}
}