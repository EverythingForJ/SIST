/*
작성자 : 김준환
작성목적 : 시프트 연산자
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo3 {
	public static void main(String[] args) {
		int su =-128;
		int result = su>>5;
		int result1 = su>>>5;
		System.out.println("su ="+Integer.toBinaryString(su));
		System.out.println("result ="+Integer.toBinaryString(result));
		System.out.println("result1 ="+Integer.toBinaryString(result1)); // 음수에서 양수로 바뀜. 앞에 0 생략
		System.out.println("result ="+result);
		System.out.println("result1 ="+result1);
	}
}