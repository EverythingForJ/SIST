/*
�ۼ��� : ����ȯ
�ۼ����� : �� ���� ������ �Է¹޾� �ִ������� �ּҰ���� ���ϱ�
�ۼ����� : 25/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class LcmGcd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("�ִ�����, �ּҰ���� ��� ���α׷�");
		System.out.print("ù°�� : ");
		int fir = scan.nextInt();
		System.out.print("��°�� : ");
		int sec = scan.nextInt();
		
		int gcd=0, lcm=0;
		
		// �ִ�����  ���ϱ�
		for (int i=1; i<=fir; i++){
			if((fir%i==0) && (sec%i==0)){
				gcd = i;
			}
		}

		// �ּҰ����  ���ϱ�
		lcm = (fir*sec)/gcd;
		
		System.out.println("-----------------------------------");
		System.out.printf("%d�� %d�� GCM�� %d�̰� LCM�� %d�Դϴ�.",
						  fir, sec,		gcd,	   lcm);

	}
}