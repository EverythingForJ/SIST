/*
�ۼ��� : ����ȯ
�ۼ����� : ���� �Է� �޾Ƽ� �������ϱ�
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class CalculatePaperMoney {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price=0, five = 0, hundred=0, fiveThousand=0, thousand=0, rest=0;
		
		System.out.print("��ǰ ������ �Է��ϼ��� :  ");
		price = scan.nextInt();
		
		five = price/50000;
		hundred = (price%50000)/10000;
		fiveThousand = (price%10000)/5000;
		thousand = (price%5000)/1000;
		rest = price%1000;

		System.out.printf("%d���� 5������ %d��, ������ %d��, 5õ����%d��, õ����%d���� �����ϰ� %d���� �����ϴ�.", 
									price,					five,			hundred,		fiveThousand,  thousand,				rest);
	}
}