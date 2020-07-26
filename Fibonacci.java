/*
작성자 : 김준환
작성목적 : 10번째까지의 피보나치 수열 출력하기
작성일지 : 25/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Fibonacci {
	public static void main(String[] args) {
		int sum = 0, fir = 1, sec = 1; // 초기값 2개와 결과값 저장을 위한 변수 3개 초기화
		
		System.out.printf("%-3d", fir); // 초기값 출력
		System.out.printf("%-3d", sec); // 초기값 출력

		for(int i=0; i<8; i++){ // 결과값 8개만 출력하기 위한 반복문
			sum=fir+sec; // sum 계산 및 저장
			System.out.printf("%-3d", sum); // 결과 출력
			sec = fir; 
			fir = sum; //sum이 생겼으니, 이 sum을 sum 전의 숫자와 다시 더하기위한 값 변경
		}	   //sum은 전의 숫자와 전전의 숫자의 합	
	}
}