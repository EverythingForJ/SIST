/*
�ۼ��� : ����ȯ
�ۼ����� : for(;;)����, ������ // the multiplication table
�ۼ����� : 24/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ForDemo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�� �� ?? :");
		int num = scan.nextInt();
		
		for(int i = 1; i <=9; i++ ){
			System.out.printf("%d x %d = %d\n",num, i, (num*i));	
		}
	}
}