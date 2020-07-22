/*
작성자 : 김준환
작성목적 : 연산자 ~,!
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo {
	public static void main(String[] args) {
		int su = -128;
		int result = ~su; // 연산자 ~: 1의 보수화. 숫자에만 사용
		boolean flag = true;
		boolean answer = !flag; // 연산자!: boolean에만 사용
		
		System.out.printf("su= %d, su = %s\n", su, Integer.toBinaryString(su));
		System.out.printf("result= %d, result = %s\n", result, Integer.toBinaryString(result));
	}
}