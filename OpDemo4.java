/*
작성자 : 김준환
작성목적 : ==, !=, 문자열 비교
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo4 {
	public static void main(String[] args) {
/*
		// int a=5, b=7;
		boolean a=true, b=false;
		System.out.printf("a==b==>%b\n",(a==b));
		System.out.printf("a!=b==>%b\n",(a!=b));
*/		
		//String name = "한지민";
		//System.out.printf("한지민 == name ==> %b\n",("한지민"==name));
		// true
		//String name = new String("한지민");
		//System.out.printf("한지민 == name ==> %b\n",("한지민"==name));
		// false
		String name = new String("한지민");
		// System.out.printf("한지민 == name ==> %b\n",("한지민".equals(name)));
		// new를 쓰던 안쓰던 true. 
		// 문자열 값비교는 == 연산자가 아니라 .equals() 메소드를 사용한다.
		// equals는 static이 아니라 "한지민"주소로 접근
		
		System.out.printf("한지민 == name ==> %d\n",("한지민".compareTo(name)));
		// compareTo() = 문자열 같으면 정수형 0 리턴
	}
}