/*
작성자 : 김준환
작성목적 : 100이하의 자연수 중에서 4의 배수이면서 5의 배수가 아닌 값 출력하기
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class FourNotFive {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++){
			if(i%4==0 && i%5!=0) {
				System.out.printf("%-3d",i);
			}
		}
	}
}