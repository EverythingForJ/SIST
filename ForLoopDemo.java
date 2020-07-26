/*
작성자 : 김준환
작성목적 : 결과에 맞게 출력하기
작성일지 : 25/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ForLoopDemo {
	public static void main(String[] args) {
		int num = 0;
		
		for(int i=0; i<5; i++){ // 5개의 행을 출력하기 위한 반복문
			num++;
			for(int j = 1; j<=5; j++){ // 5개의 열을 출력하기 위한 반복문
				if (j==num){ // 행과 열이 일치하는 숫자 출력
					System.out.printf("%-3d", num);			
				}else{ // 아니라면 0 출력
					System.out.printf("%-3d", 0);
				}
			}
			System.out.println(); // 행을 바꾸기위한 출력문
		}
	}
}