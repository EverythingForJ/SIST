/*
작성자 : 김준환
작성목적 : while()
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class WhileDemo {
	public static void main(String[] args) {
		// 1,2,3,4,5
/*		int i = 1; // 초기치
		while(i<=5){ // 조건
			System.out.print(i+"  ");
			i++; // 증감치
		}
*/	
		int i = 1; //초기치
		while(i<101){ //조건
			i++;
			if (i%7==0){
				System.out.print(i+"  ");
			}
		}
	}
}