/*
작성자 : 김준환
작성목적 : switch
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class SwitchDemo {
	public static void main(String[] args) {
/*		int number =237;
		switch(number%2){
			case 0:System.out.println("짝수"); break;
			case 1:System.out.println("홀수"); break;
			// default 
		}
	
		String season = "fall";	
		switch(season){
			case "spring":System.out.println("개나리");break;
			default : System.out.println("동백");break; // 디폴트 위치 자유, 대신 break잊지 않기.
			case "summer":System.out.println("장미");break;
			case "fall":System.out.println("코스모스");break;
			
		}
*/		
		double avg =78.5; // 실수는 조작해서 쓴다.
		switch((int)(avg/10)){ // 10 or 9
			case 10:
			case 9: System.out.println("A"); break;
			case 8: System.out.println("B"); break;
			case 7: System.out.println("C"); break;
			case 6: System.out.println("D"); break;
			default: System.out.println("F"); break;
		}
	}
}