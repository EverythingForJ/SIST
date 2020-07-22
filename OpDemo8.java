/*
작성자 : 김준환
작성목적 : 삼항 연산자 주의할 점
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo8 {
	public static void main(String[] args) {
		int result = (true)?9:9.5; // 9.5라는 실수형이 있어서 int형인 result에 넣질못함.
		// 3항 연산자 주의할 점 : 참과 거짓의 값 형식 먼저 확인하기. 그 후 조건 보기
		System.out.println(result);
	}
}