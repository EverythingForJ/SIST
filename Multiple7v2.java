/*
작성자 : 김준환
작성목적 : 1~100까지 숫자 중 7의 배수만 출력하기 + 배수를 한 줄에 3개씩 출력하기
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Multiple7v2 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 1; i<=100; i++ ){
			if (i%7==0){
				System.out.print(i+"   ");
				count++;
				if(count%3 == 0){
					System.out.println();
				}
			}
		}
	}
}