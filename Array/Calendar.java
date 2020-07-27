/*
작성자 : 김준환
작성목적 : 달력
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년 월: ");
		
		String yearStr = scan.next();
		int year = Integer.parseInt(yearStr);
		
		String monthStr = scan.next();
		int month = Integer.parseInt(monthStr);
		
		// String dayStr = scan.next();
		// int day = Integer.parseInt(dayStr);
		int day =1; //달력은 매월 1일 기준

		// System.out.println(year+". "+month+". "+day);
		
		// 윤년 366일, 
		// 서기 1년부터 year -1년까지 총 날수
		int total=0;
		for(int i = 1; i<year; i++){
			if(i%400==0 || (i%4==0&&i%100!=0)) total += 366;
			else total += 365;
		}

		int arr[];
	
		// 올해 1월부터 6월까지의 합
		if(year%400==0 || (year%4==0&&year%100!=0)){
			//올해가 윤년이라면
			arr = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		}else{
			//올해가 윤년이 아니라면
			arr = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		}
		
		for(int i=0; i<month-1; i++){ // -1은 저번달까지만 계산하기 위함
			total += arr[i];
		}
		//이번달 더하기
		total += day;

//		String day2;
//		System.out.println(total);
		
		int space = total%7;
		int maxDay = arr[month-1];
//		System.out.println("공백"+space+", 마지막날은 = "+maxDay);
/*		switch(total%7){
			case 1:	day2 = "월요일"; break;
			case 2: day2 = "화요일"; break;
			case 3: day2 = "수요일"; break;
			case 4: day2 = "목요일"; break;
			case 5: day2 = "금요일"; break;
			case 6: day2 = "토요일"; break;
			default : day2 = "일요일"; break;
		}
*/
		// System.out.printf("%d년 %d월 %d일은 %s입니다.", year, month, day, day2);

		System.out.println("		####"+year+"년 "+month+"월####");
		System.out.println("日\t月\t火\t水\t木\t金\t土");
		System.out.println("---------------------------------------------------");
		//달력 첫째줄 공백처리
		int count=0;
		for(int i =0; i<space; i++){
			System.out.print("☆\t");
			count++;
		}
		//1일부터 마지막 날까지
		
		for(int i= 1; i <=maxDay; i++){
			System.out.print(i+"\t");
			count++;
			if(count%7==0) {
				System.out.println();
				count = 0;
			}
		}
		// 마지막 줄 공백 처리
		if(count!=0){
			for(int i =0; i<7-count; i++){
				System.out.print("★\t");
			}
		}
	}
}