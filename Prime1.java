/*
�ۼ��� : ����ȯ
�ۼ����� : �Է¹��� ������ ���μ� �����Ͽ� ����ϱ�
�ۼ����� : 26/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���μ� ���ظ� �� ������ �Է����ּ��� : ");
		int num = scan.nextInt();
		
		System.out.printf("%d--> ", num);
		
		for (int i = 2; i <= num; i++) {
            while (num%i == 0) {
                System.out.printf("%-3d",i);
                num = num/i;
            }
		}
	}
}