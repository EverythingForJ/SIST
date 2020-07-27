/*
작성자 : 김준환
작성목적 : doWhile로 구구단 만들기
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class  DoWhileMultiplication {
	public static void main(String[] args) {
/*		int fir=0, sec=0;
		do{
			fir++;
			do{
				sec++;
				System.out.printf("%d x %d = %-5d	",fir,sec,fir*sec);
			}while(sec<9);
			sec=0;
			System.out.println();
		}while(fir<9);
*/
		int i = 1; // 초기화
		do{
			int j =2;
			do{
				System.out.printf("%d x %d = %-5d",j,i,j*i);
				j++;
			}while(j<10);
			System.out.println();
			i++;
		}while(i<10);
	}
}