/*
작성자 : 김준환
작성목적 : for(;;)연습, A~Z 출력하기
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Atoz {
	public static void main(String[] args) {
		for(int j = 0; j<= 25; j++){
			for(int i = 65; i <= (65+j); i++){
				System.out.print((char)i);
			}
			System.out.println();
		}
	}
}