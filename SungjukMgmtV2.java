/*
작성자 : 김준환
작성목적 : 성적관리
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class SungjukMgmtV2 {
	public static void main(String[] args) {
		Student chulsu = new Student(); 
		// student를 heap에 만들고, chulsu에게 student 주소값을 넘겨줌
		// student라는 집에 kor, engm mat라는 방들이 자동으로 같이 생겼다.
		
		chulsu.mat = 100; // 자기가 속한 클래스 접근
		chulsu.kor = 90; // 멤버 변수라 주소 접근
		chulsu.eng = 85; // 멤버 변수라 주소 접근

		int total = chulsu.kor + chulsu.eng + Student.mat;
		System.out.println("철수 총점: "+total);

		Student younghee = new Student();
		younghee.kor = 95; 
		younghee.eng = 100;
		
		total = younghee.kor + younghee.eng + younghee.mat;
		System.out.println("영희 총점: "+total);
	}
}

class Student{
	int kor; // 멤버 변수 or Instance variable
	int eng;
	static int mat;
}