/*
�ۼ��� : ����ȯ
�ۼ����� : Ȧ¦ �����ϱ�
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo1 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int number = scan.nextInt();
		
		if ( ( number % 2 ) == 0){
			System.out.println("¦���Դϴ�.");
		} else if( number == 0){
			System.out.println("0 �Դϴ�");
		} else{
			System.out.println("Ȧ���Դϴ�");
		}
	}
}