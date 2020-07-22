/*
작성자 : 김준환
작성목적 : 시분초 환산하기
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class CalculateTime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int time=0, hour = 0, minute=0, restTime=0;
		
		System.out.print("시간을 초 단위로 입력하시오 : ");
		time = scan.nextInt();
		
		hour = time / (60*60);
		minute = ( (time % (60*60)) / 60);
		restTime = time - (minute*60) - (hour*60*60);

		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", 
									time,	 hour,	minute, restTime);
	}
}