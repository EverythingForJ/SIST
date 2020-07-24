/*
작성자 : 김준환
작성목적 : 100이하의 자연수 중에서 7 또는 9의 배수인 값 출력하기
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class SevenAndNine {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++){
			if(i%7==0 || i%9==0) {
				System.out.printf("%-3d",i);
			}
		}
	}
}