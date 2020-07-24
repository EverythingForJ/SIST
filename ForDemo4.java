/*
작성자 : 김준환
작성목적 : for(;;)연습, 
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ForDemo4{
	public static void main(String[] args) {
		
/*		int count = 0;

		for(int j =0;j<=50;j++){
			for(int i = 0; i<5; i++){
				System.out.print("*");
				count++;
				if(count%10==0)System.out.println();
			}
		}
	
		for(int i = 1; i<6; i++){
				System.out.println("*");
		}

		for(int j=1; j<6; j++){
			for(int i=1; i<11; i++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = 0 ; i<6; i++){
			for(int j =65; j<=90;j++){
				System.out.printf("%-3c",(char)j);
			}
			System.out.println();
		}		
*/
		for(int j = 1; j<= 10; j++){
			for(int i = 1; i <= j; i++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}