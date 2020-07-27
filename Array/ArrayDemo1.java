/*
작성자 : 김준환
작성목적 : 배열
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

/*
	배열의 초기화
	1. 정수 --> byte,short,int,log -->0
	2. 실수 --> float, double -->0.0
	3. 불리언 --> boolean --> false
	4. 문자 --> char --> 널값, '\0', '\u0000' / null값은 출력이 안된다.
	5. 참조형 --> 주소 --> null 번지 // 예를 들어 String
*/

public class ArrayDemo1 {
	public static void main(String[] args) {
		String [] array = new String[4];
		for(int i = 0; i<4; i++){
			System.out.printf("array[%d]=%s\n",i,array[i]); // 자동 초기화된다.
		}
	}
}