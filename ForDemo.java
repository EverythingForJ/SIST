/*
작성자 : 김준환
작성목적 : for()
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ForDemo {
	public static void main(String[] args) {
/*		int sum = 0;
		for (int a = 1; a<11; a++ ){
			// System.out.print(a+"  "); //for의 조건이 참일 경우 해야할 작업
			sum = sum + a; // 1 + 2 + 3+ 4 ....+10
		}
		System.out.print("합은 "+sum);
*/
		long result = 1;
		for (int i = 10; i>=1; i-- ){
			result = result * i; // 1 * 2 * 3 * 4 ....* 10
		}
		System.out.print("곱은 "+result);




	}
}