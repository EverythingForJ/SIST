/*
�ۼ��� : ����ȯ
�ۼ����� : ���ǹ�
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = scan.nextInt();
		// 1.
/*		if (score >= 60) System.out.println("�ʱ� �հ��Դϴ�.");
		if(score<60) System.out.println("�ƽ����ϴ�. ���� ��ȸ��...");
		// 2.
		if (score >= 60){
			System.out.println("�����մϴ�.");
			System.out.println("�ʱ� �հ��Դϴ�.");
		} else{	// score < 60
			System.out.println("�ƽ����ϴ�. ");
			System.out.println("���� ��ȸ�� �ٽ� �������ּ���.");
		}
*/		// 3.
		if (score >= 90){
			System.out.println("�����մϴ�. Excellent!");
			System.out.println("�ʱ� �հ��Դϴ�.");
		} else if(score >= 60){	// 60 <= score < 90	
			System.out.println("�����մϴ�. Good~");
			System.out.println("�ʱ� �հ��Դϴ�.");
		} else if(score >= 50){	// 50 <= score < 60	
			System.out.println("�ʹ� �ƽ����ϴ�. ");
			System.out.println("���� ��ȸ�� �ٽ� �������ּ���.");
		} else{
			System.out.println("���հ��Դϴ�");
			System.out.println("����̳׿�");
		}
	}
}