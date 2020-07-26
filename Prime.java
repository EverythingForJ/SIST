/*
작성자 : 김준환
작성목적 : 1부터 200까지의 소수(Prime Number) 출력하기
작성일지 : 26/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Prime {
	public static void main(String[] args) {
		int count=0; // 줄바꿈 변수
		
		for(int i = 2; i<=200; i++) { // 소수는 2부터 시작, 200까지의 소수 구하기
			int count2=0; // 소수인지 아닌지 판별하기 위한 변수
			for(int j = 2; j<=i; j++) {
				if (i%j==0) {
					count2+=1; // 그 숫자가 2부터 자신의 숫자까지 나누었을때, 나누어지는 숫자가 있다면 변수값증가
				}
			}
			if(count2<2) { // 자신과 같은 숫자 외에 나누어 떨어지는 숫자가 없다면 소수. 출력
				System.out.printf("%-5d",i);
				count++;
				if(count%10==0) {
					System.out.println();
				}
			}
		}
	}
}