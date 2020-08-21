
package com.example.libs;

import java.util.ArrayList;

class Output {
	private ArrayList<Person> list;
	
	Output(ArrayList<Person> list){
		this.list = list;
	}
	
	void output() {
		if(this.list != null && this.list.size() >0) {
			System.out.println("[ 전체 회원 목록 ]");
			for(Person p : this.list) System.out.println(p);
		}else {
			System.out.println("No Data");
		}
	}
}
