/*
작성자 : 김준환
작성목적 : id,passwd,name,email
작성일지 : 20/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		String id; // 선언
		String passwd;
		String name;
		String email;
		
		Scanner scan = new Scanner(System.in); // 초기화
		
		System.out.print("ID를 입력하세요 : ");
		id = scan.next();
		
		System.out.print("PASSWORD를 입력하세요 : ");
		passwd = scan.next();
		
		System.out.print("이름을 입력하세요 : ");
		name = scan.nextLine(); // 엔터가 따라들어와서 입력 불가 // 전부 next를 쓰거나,nextLine으로 통일해야함
		
		System.out.print("Email을 입력하세요 : ");
		email = scan.next();

		System.out.println("회원가입이 완료이 완료되었습니다.\n"+"ID: "+id+"\n"+"PASSWORD: "+passwd+"\n"+"NAME: "+name+"\n"+"Email: "+email);
	}
}