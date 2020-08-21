
package com.example.libs;

import java.util.Scanner;

class Update {
	private Person person;
	private Scanner scan;
	
	Update(Person person, Scanner scan) {
		this.person = person;
		this.scan = scan;
	}

	void modify() {
		System.out.print("변경하실 전화 번호 : ");
		String tel = this.scan.nextLine();
		if(tel.equals("")) tel = this.person.getTel(); // 엔터만 치면 변경안하고 주소로 넘어가기
		System.out.print("변경하실 주소 : ");
		String address = this.scan.nextLine();
		if(address.equals("")) address = this.person.getAddress();
		this.person.setTel(tel);
		this.person.setAddress(address);
	}

}
