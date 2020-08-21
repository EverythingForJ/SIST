
package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

class Input {
	private ArrayList<Person> list;
	private Scanner scan;

	Input(ArrayList<Person> list, Scanner scan) {
		this.list = list;
		this.scan = scan;
	}
	
	void input(){
		System.out.print("ȸ�� ��ȣ : ");
		int number = scan.nextInt();
		scan.nextLine(); // ����Ű ������
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String tel = scan.next();
		scan.nextLine(); // ����Ű ������
		System.out.print("�ּ� : ");
		String address = scan.nextLine();
		
		Person p = new Person(number, name, tel, address);
		this.list.add(p);
	}
	
}
