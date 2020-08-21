
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
		System.out.print("회원 번호 : ");
		int number = scan.nextInt();
		scan.nextLine(); // 엔터키 날리자
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("전화번호 : ");
		String tel = scan.next();
		scan.nextLine(); // 엔터키 날리자
		System.out.print("주소 : ");
		String address = scan.nextLine();
		
		Person p = new Person(number, name, tel, address);
		this.list.add(p);
	}
	
}
