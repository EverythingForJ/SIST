/*
작성자 : 김준환
작성목적 : 지역 변수
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/
/*
	지역변수 : local variable, stack variable, outomatic variable, temporary variable.
	- 특정 메소드 혹은 특정 block에서 선언된 함수
	- 특정 메소드나 특정 블록을 벗어나면 자동 소멸되고, 이 영역 안으로 들어오면 자동 생성
	- 반드시 사용하기 전에 초기화해야 한다.
*/
import java.util.Scanner;
import java.util.Calendar;

public class LocalVariableDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int yearOfBorn; // 지역 변수

		System.out.print("귀하의 출생년도는 ?: ");
		yearOfBorn = scan.nextInt(); // 이 때 초기화가 된다. 사용되기전까지만 초기화하면된다.
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year-yearOfBorn+1; // 지역 변수
		System.out.println("귀하의 나이는 "+age+"살이군요.");


/*		int avg; // 함수 안에서 만들어진 지역 변수.
		{
			int age; // 블록 안에서 만들어진 지역 변수.
			// 블록 벗어나는 순간 자동 소멸하여 블록 밖에서 못 쓴다.
			System.out.println("age =" +age); // 초기화를 안하면 사용불가(이미쓰레기값이들어가있기때
		}
*/
	}
}