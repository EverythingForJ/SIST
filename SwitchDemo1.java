/*
작성자 : 김준환
작성목적 : 정수 2개를 입력받아서 5칙 연산 수행하기
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class SwitchDemo1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int first = scan.nextInt();
		System.out.print("두번째 수 : ");
		int second = scan.nextInt();
		System.out.print("연산자(+,-,x,/,%) : ");
		String operator = scan.next();
		
		double result=0;
		int check=0;
		switch(operator){
			default : check=1; break;
			case "+": result = first + second; break;
			case "-": result = first - second;break;
			case "x": result = first * second;break;
			case "/": result = first / second;break;
			case "%": result = first % second;
		}
		System.out.println("------------------");

		if(check==1) System.out.println("연산자를 잘못 선택하셨습니다.");
		else System.out.printf("%d %s %d = %.2f", first, operator, second, result);
	}
}