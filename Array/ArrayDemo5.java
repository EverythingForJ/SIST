/*
�ۼ��� : ����ȯ
�ۼ����� : ���ڿ��� �Է¹޾Ƽ� �Ųٷ� ����ϱ�
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ArrayDemo5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = scan.nextLine();
		
		char[] a = str.toCharArray(); // string���� char�迭�� ���޾ƿ���

		System.out.printf("��� : ");
		for(int i = a.length-1; i>=0; i--){
			System.out.print(a[i]);
		}
	}
}