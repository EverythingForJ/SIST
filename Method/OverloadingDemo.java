/*
작성자 : 김준환
작성목적 : 오버로딩
작성일지 : 31/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/
// method overloading : method의 이름이 같고, 파라미터의 타입 또는 개수가 다르면 컴파일러는 다른 메소드로 인식한다.

public class OverloadingDemo {
	public static void main(String[] args) {
		print(4);
//		print(5, 89.5);
		print('a');
	}
	static void print(int su) {
		System.out.println("su = "+su);
	}
//	static void print(int su, double su1) {
//		System.out.println("su = "+su);
//	}
//	static void print(char munja) {
//		System.out.println("munja = "+munja);
//	}
	static void print(Object...array) {
		
	}
	static void print(int su, Object...array) {
		// 가변인자는 항상 마지막에 붙여줘야한다.
	}
//	static void print(Object...array, int su) {
//		// 에러발생
//	}
	
}
