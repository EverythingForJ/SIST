package com.example.libs;

import java.io.Serializable;

@SuppressWarnings("serial")
class Person implements Serializable {
	private int number;
	private String name, tel, address;
	
	Person(){}
	
	Person(int number, String name, String tel, String address) {
		this.number = number;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getTel() {
		return tel;
	}

	void setTel(String tel) {
		this.tel = tel;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Person [번호=%s, 이름=%s, 전화번호=%s, 주소=%s]", number, name, tel, address);
	}

}
