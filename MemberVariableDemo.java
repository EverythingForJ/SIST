/*
작성자 : 김준환
작성목적 : 멤버 변수
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

/*
	Member variable : instance variable
	- 자동으로 변수의 초기값은 주어진다.(class 변수와 같다)
	- 주소로 접근한다.
*/

public class MemberVariableDemo {
	//static int age; // 클래스 변수
	int age; // 멤버 변수( static이 안붙으면 멤버 변수 ), 쓰는 법도 다르다.
	public static void main(String[] args) {
		// int age; // 지역 변수에는 static을 붙일 수 없다.
		MemberVariableDemo avd = new MemberVariableDemo();
		System.out.println(avd.age);
	}
}