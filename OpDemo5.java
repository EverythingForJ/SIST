/*
작성자 : 김준환
작성목적 : 연산시 주의점
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo5 {
	public static void main(String[] args) {
		// 단항 연산자 사용시 주의할 점: +,-,~ 의 결과는 무조건 int다.
		//byte a = 5;
		//byte result = ~a;
		//byte result = -a;
		// int result = ~a;
		//System.out.println("result = "+result);

		// 이항연산자 사용시 주의할 점 : 이항연산(산수르 이동, 관계, 비트, 논리)의 결과는 무조건 int이상이다.
		// byte+byte-->int, byte+short-->int, short*short-->int
/*		byte a = 5;
		byte b= 9;
		byte sum = a<<b; // +때문에 결과는 int형이 되서 에러발생
*/
		int a=5, b=9, x=100;
		if( a>x && ++b>20){ // &&이미 조건문 앞쪽이 거짓이기에 ++b를 안하고 건너뛴다. &는 한다.
			System.out.println("참");
		}else{
			System.out.println("거짓");
		}
		System.out.println("b= "+b);
	}
}