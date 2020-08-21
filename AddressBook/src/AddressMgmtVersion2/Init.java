
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
			if(file.exists()) { // 이미 전에 백업을 했거나, 한 번 이상 실행한 적이 있다면
				this.ois = new ObjectInputStream(new FileInputStream(file)); // 파일이 있을 때 역직렬화를 하자.
				this.list = (ArrayList<Person>)this.ois.readObject();
			}else { // 이 프로그램을 처음 실행하는거라면
				file.createNewFile();
				this.list = new ArrayList<Person>(1);
			}
			
		} catch (EOFException e) { // file을 열었는데, file이 비어있다면 발생하는 exception
			System.out.println("EOFException 발생");
			this.list = null;
			// file.delete(); // EOFException 반복을 피하기 위해 파일을 삭제한다.
			return; // 저장된 파일 없으니 바로 돌아가서 시작해
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Exception 발생 : "+ e.getMessage());
			this.list = null;
			return; // 저장된 파일 없으니 바로 돌아가서 시작해
		}
	}
	
	ArrayList<Person> load(){
		if(this.list != null) return this.list;
		else return null;
	}
	
}
