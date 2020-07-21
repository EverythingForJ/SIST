/*
작성자 : 김준환
작성목적 : 캐스팅
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class CastingExample {
	public static void main(String[] args) {
		/*
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	
		// 성질이 바뀌어 손실이 일어남
		*/

		// int age = 24L;
		byte age = 24;
		double avg = 89; // 89.0
		
		age= (byte)avg; //89

		System.out.println(age);

		byte a = 5;
		byte b = 9;
		byte sum = a+b; // 오류: +는 int와 int로 계산하여 byte는 불가
		int sum = a+b; // 가능

	} 
}