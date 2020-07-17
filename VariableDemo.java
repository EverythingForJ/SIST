/*
작성자 : 김준환
작성목적 : Variable(변수)
				1. Primitive type : 값 
				2. Reference type : 주소
작성일지 : 2020.07.17
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class VariableDemo {
	public static void main(String[] args) {
//		byte age; // 1.Declaration(선언)
//		age = 24; // 2.Assignment(할당)
		byte age = 128; // 3.Initialization(초기화) = 선언+할당
		System.out.printf("나이 = %d\n", age);
		//age = 30;
		//System.out.printf("나이 = %d\n", age);
		//age = 40;
		//System.out.printf("나이 = %d\n", age);
	}
}