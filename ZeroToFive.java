/*
작성자 : 김준환
작성목적 : for(;;)연습, 0~5 출력
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ZeroToFive {
	public static void main(String[] args) {
/*
		for(int i=0; i<5; i++){
			for(int j=0; j<=5; j++){
				//System.out.printf("%-3d",i);
				System.out.printf("%-3d",j);
			}
			System.out.println();
		}
*/
/*
		for(int i=0; i<5; i++){
			for(int j=0; j<=5; j++){
				System.out.printf("%-3d",j+i);
			}
			System.out.println();
		}
*/
		int i = 0;
		while(i <5){
			for(int j=0; j<=5; j++){
				System.out.printf("%-3d",j+i);
			}
			System.out.println();
			i++;
		}
	}
}