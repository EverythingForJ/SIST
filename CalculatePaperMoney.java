/*
작성자 : 김준환
작성목적 : 가격 입력 받아서 지폐계산하기
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class CalculatePaperMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price=0, five = 0, hundred=0, fiveThousand=0, thousand=0, rest=0;
		
		System.out.print("상품 가격을 입력하세요 :  ");
		price = scan.nextInt();
		
		five = price/50000;
		hundred = (price%50000)/10000;
		fiveThousand = (price%10000)/5000;
		thousand = (price%5000)/1000;
		rest = price%1000;

		System.out.printf("%d원은 5만원권 %d장, 만원권 %d장, 5천원권%d장, 천원권%d장을 지불하고 %d원이 남습니다.", 
									price,					five,			hundred,		fiveThousand,  thousand,				rest);
	}
}