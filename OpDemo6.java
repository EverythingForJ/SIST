/*
작성자 : 김준환
작성목적 : operator ?:
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo6 {
	public static void main(String[] args) {
		//int score = 60;
		//String result = (score>=60) ? "합격" : "불합격";
		//System.out.println(result);
/*
		double avg = 86.3;
		char grade = (avg>=90)?'A':
												(avg>=80)?'B':
																	 (avg>=70)?'c':
																						 (avg>=60)?'D':'F';
		// 계단식으로 이어서 가능함.
		System.out.println(grade);
*/
		int hour =12;
		System.out.println((hour<12)?"오전":"오후");
	}
}