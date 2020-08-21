
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
		System.out.print("�����Ͻ� ��ȭ ��ȣ : ");
		String tel = this.scan.nextLine();
		if(tel.equals("")) tel = this.person.getTel(); // ���͸� ġ�� ������ϰ� �ּҷ� �Ѿ��
		System.out.print("�����Ͻ� �ּ� : ");
		String address = this.scan.nextLine();
		if(address.equals("")) address = this.person.getAddress();
		this.person.setTel(tel);
		this.person.setAddress(address);
	}

}
