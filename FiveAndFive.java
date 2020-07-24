/*
작성자 : 김준환
작성목적 : 5-4-3-2-1
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class FiveAndFive {
	public static void main(String[] args) {
		for(int i=0; i<5; i++){
			for(int j = 1+i; j<=5; j++){
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}
}