/*
작성자 : 김준환
작성목적 : 클래스 변수
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

/*
	클래스 변수 : static variable
	- 클래스의 이름으로 접근한다.
	Integer.MAX_VALUE, Short.MAX_VALUE, Byte.MAX_VALUE.
	-소속 클래스의 주소를 생성할 필요가 없다.
	-자동으로 DataType에 맞춰 초기값이 주어진다.
		-- 정수형 : 0
		-- 실수형 : 0.0
		-- 논리형 : false
		-- 문자형 : '\0', '\u0000'(NULL값)
		-- 참조형 : null(NULL번지)
*/

public class StaticVariableDemo {
	static int age; // static이 붙으면 클래스 변수라고 한다. static:공유 / 즉 공유 변수 / or static variable이라고도 한다. 
	// 지역변수는 반드시 초기화해줘야하지만, 클래스 변수는 따로 안해도 컴파일러가 자동으로 해준다.

	public static void main(String[] args) {
		//int age; // 지역 변수
/*		System.out.println("나이 = "+age); // 클래스 변수 선언 방법 1.(동일 클래스라 클래스명 생략 가능)
		System.out.println("나이 = "+StaticVariableDemo.age); // 방법 2. (원래 정확한 방법)
		
		StaticVariableDemo svd = new StaticVariableDemo(); // 4바이트의 주소 변수 생성
		System.out.println("나이 = "+svd.age); // 방법 3.
*/
		Product.price = 25_000_000;
		System.out.println("가격은 "+Product.price);
	}
}

class Product{
	static int price; // 클래스 변수

}