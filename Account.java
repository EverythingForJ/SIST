/*
�ۼ��� : ����ȯ
�ۼ����� : id,passwd,name,email
�ۼ����� : 20/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		String id; // ����
		String passwd;
		String name;
		String email;
		
		Scanner scan = new Scanner(System.in); // �ʱ�ȭ
		
		System.out.print("ID�� �Է��ϼ��� : ");
		id = scan.next();
		
		System.out.print("PASSWORD�� �Է��ϼ��� : ");
		passwd = scan.next();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = scan.nextLine(); // ���Ͱ� ������ͼ� �Է� �Ұ� // ���� next�� ���ų�,nextLine���� �����ؾ���
		
		System.out.print("Email�� �Է��ϼ��� : ");
		email = scan.next();

		System.out.println("ȸ�������� �Ϸ��� �Ϸ�Ǿ����ϴ�.\n"+"ID: "+id+"\n"+"PASSWORD: "+passwd+"\n"+"NAME: "+name+"\n"+"Email: "+email);
	}
}