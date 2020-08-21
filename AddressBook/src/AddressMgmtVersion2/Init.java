
package com.example.libs;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

class Init {
	private String path;
	private ObjectInputStream ois;
	private ArrayList<Person> list;
	
	@SuppressWarnings("unchecked")
	Init(String path){
		this.path = path;
		File file = new File(this.path);
		
		try {
			if(file.exists()) { // �̹� ���� ����� �߰ų�, �� �� �̻� ������ ���� �ִٸ�
				this.ois = new ObjectInputStream(new FileInputStream(file)); // ������ ���� �� ������ȭ�� ����.
				this.list = (ArrayList<Person>)this.ois.readObject();
			}else { // �� ���α׷��� ó�� �����ϴ°Ŷ��
				file.createNewFile();
				this.list = new ArrayList<Person>(1);
			}
			
		} catch (EOFException e) { // file�� �����µ�, file�� ����ִٸ� �߻��ϴ� exception
			System.out.println("EOFException �߻�");
			this.list = null;
			// file.delete(); // EOFException �ݺ��� ���ϱ� ���� ������ �����Ѵ�.
			return; // ����� ���� ������ �ٷ� ���ư��� ������
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Exception �߻� : "+ e.getMessage());
			this.list = null;
			return; // ����� ���� ������ �ٷ� ���ư��� ������
		}
	}
	
	ArrayList<Person> load(){
		if(this.list != null) return this.list;
		else return null;
	}
	
}
