/*
작성자 : 김준환
작성목적 : 자연수 중에서 100의 약수를 모두 찾아 1줄에 3개씩 출력하기
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Hundred {
	public static void main(String[] args) {
		int count = 0;
			for(int j =2; j<=99; j++){
					if(100%j==0) {
						System.out.printf("%5d", j);
						count++;
						if(count%3==0){
							System.out.println();
						}
					}
			}
	}
}