/*
작성자 : 김준환
작성목적 : 유니코드 41 ~ 122번까지의 코드와 문자를 한 줄에 8개씩 출력하기
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class TestUnicode {
	public static void main(String[] args) {
		int count=0;

		for(int j=41;j<=122;j++){
			System.out.printf("%d : ", j);
			System.out.printf("%-5c   ", (char)j);
			count++;
			if(count%8==0){
				System.out.println();
			}
		}
	}
}