/*
작성자 : 김준환
작성목적 : for(;;)연습
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ForDemo2 {
	public static void main(String[] args) {
/*		int i = 1; // 밖에서 초기화하면 for문의 결과를 가질수 있다.
			
			for(;i<11;) { // for문의 초기,증감 생략 가능
				System.out.printf("%-5d",i);
				i++; // 증감식은 for안에 넣을 수 있다.
			}
		//System.out.printf("\n%d",i);


		for(int x= 1,y = 100; x<101; x+=3,y-=2){//초기값,증감식 2개 동시에 가능(쉼표이용하여)
			if(x>y) break;
		}
*/
		int x= 1,y = 100;

		for(; x<101; x+=3,y-=2){//초기값,증감식 2개 동시에 가능(쉼표이용하여)
			if(x>y) break;
		}
		System.out.printf("x = %d, y = %d\n",x,y);
	}
}