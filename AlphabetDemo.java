/*
작성자 : 김준환
작성목적 : 5열 정렬 및 대소문자 출력
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class AlphabetDemo {
	public static void main(String[] args) {
		
		int upper = 65; // 대문자
		int lower = 97; // 소문자
		int total = 1; // 알파벳은 26개
	
		while( total<27 ) {
			for(int i=0; i<5; i++){
				System.out.print((char)upper + " ");
				upper++;
				lower++;
				total++;
			} // 대문자 5개 출력
			System.out.println();

			for(int j=0; ( (j<5) && (total<27) ); j++){
				System.out.print((char)lower + " ");
				upper++;
				lower++;
				total++;
			} // 소문자 5개 출력
			System.out.println();
		}
	}
}