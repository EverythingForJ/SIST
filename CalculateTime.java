/*
�ۼ��� : ����ȯ
�ۼ����� : �ú��� ȯ���ϱ�
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class CalculateTime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int time=0, hour = 0, minute=0, restTime=0;
		
		System.out.print("�ð��� �� ������ �Է��Ͻÿ� : ");
		time = scan.nextInt();
		
		hour = time / (60*60);
		minute = ( (time % (60*60)) / 60);
		restTime = time - (minute*60) - (hour*60*60);

		System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�.", 
									time,	 hour,	minute, restTime);
	}
}