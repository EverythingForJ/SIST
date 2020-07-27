/*
�ۼ��� : ����ȯ
�ۼ����� : �޷�
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ��: ");
		
		String yearStr = scan.next();
		int year = Integer.parseInt(yearStr);
		
		String monthStr = scan.next();
		int month = Integer.parseInt(monthStr);
		
		// String dayStr = scan.next();
		// int day = Integer.parseInt(dayStr);
		int day =1; //�޷��� �ſ� 1�� ����

		// System.out.println(year+". "+month+". "+day);
		
		// ���� 366��, 
		// ���� 1����� year -1����� �� ����
		int total=0;
		for(int i = 1; i<year; i++){
			if(i%400==0 || (i%4==0&&i%100!=0)) total += 366;
			else total += 365;
		}

		int arr[];
	
		// ���� 1������ 6�������� ��
		if(year%400==0 || (year%4==0&&year%100!=0)){
			//���ذ� �����̶��
			arr = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		}else{
			//���ذ� ������ �ƴ϶��
			arr = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		}
		
		for(int i=0; i<month-1; i++){ // -1�� �����ޱ����� ����ϱ� ����
			total += arr[i];
		}
		//�̹��� ���ϱ�
		total += day;

//		String day2;
//		System.out.println(total);
		
		int space = total%7;
		int maxDay = arr[month-1];
//		System.out.println("����"+space+", ���������� = "+maxDay);
/*		switch(total%7){
			case 1:	day2 = "������"; break;
			case 2: day2 = "ȭ����"; break;
			case 3: day2 = "������"; break;
			case 4: day2 = "�����"; break;
			case 5: day2 = "�ݿ���"; break;
			case 6: day2 = "�����"; break;
			default : day2 = "�Ͽ���"; break;
		}
*/
		// System.out.printf("%d�� %d�� %d���� %s�Դϴ�.", year, month, day, day2);

		System.out.println("		####"+year+"�� "+month+"��####");
		System.out.println("��\t��\t��\t�\t��\t��\t��");
		System.out.println("---------------------------------------------------");
		//�޷� ù°�� ����ó��
		int count=0;
		for(int i =0; i<space; i++){
			System.out.print("��\t");
			count++;
		}
		//1�Ϻ��� ������ ������
		
		for(int i= 1; i <=maxDay; i++){
			System.out.print(i+"\t");
			count++;
			if(count%7==0) {
				System.out.println();
				count = 0;
			}
		}
		// ������ �� ���� ó��
		if(count!=0){
			for(int i =0; i<7-count; i++){
				System.out.print("��\t");
			}
		}
	}
}