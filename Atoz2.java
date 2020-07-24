/*
작성자 : 김준환
작성목적 : for(;;)연습, A~Z 출력하기 // 중복 제외
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Atoz2 {
	public static void main(String[] args) {
		char ch = 65;
		for(int i = 1; i<= 9; i++){
			for(int j = 1; (j<=i &&(ch<=90)); j++){
				System.out.print((char)ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}