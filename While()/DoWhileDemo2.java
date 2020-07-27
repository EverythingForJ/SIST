/*
작성자 : 김준환
작성목적 : doWhile
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class DoWhileDemo2 {
	public static void main(String[] args) {
		for(int i = 1; i<6; i++){
			int j =1; // 초기치
			do{
				if(i==j){
					System.out.printf("%3d",i);
				}else{
					System.out.printf("%3d",0);
				}
				j++;
			}while(j<6);
			System.out.println();
		}
	}
}