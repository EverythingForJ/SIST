/*
�ۼ��� : ����ȯ
�ۼ����� : continue
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ContinueDemo {
	public static void main(String[] args) {
/*		int i= 1;
		do{
		if(i&7==0)System.out.printf("%-3d",i);
		else continue; // 7�� ����� �ƴϸ� �������� ���� // �����Ⱦ��� �Ȱ���.
			i++;
		}while(i<101);
*/
		// continue�� �� ����ϴ� ��Ȳ��?
		Scanner scan = new Scanner(System.in);
		String system_password="1234";
		System.out.print("Enter a password : ");
		String user_password = scan.nextLine();
		int i = 0;
		for(; i<4; i++){
			if(system_password.charAt(i)==user_password.charAt(i)) continue;
			else break;
		}
		if(i==4) System.out.println("Login Success");
		else System.out.println("Login Failure");
	}
}