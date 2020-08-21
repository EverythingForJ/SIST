/*
 * ȸ���� ��ȭ��ȣ�� �ּҸ� ���, �˻��� �� �ִ� ���α׷��� �ۼ��Ͻÿ�.
*/
package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner scan;
	private static final String PATH; // ����� ������ ������ ��
	private ArrayList<Person> list;
	
	static {
		PATH = "./myaddress.ser";
	}
	
	private Main() {
		this.scan = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Init init = new Init(PATH); // �޸𸮿� ����Ǿ��ִ� �����͸� �޸𸮿� �ε�.
		main.list = init.load(); // ������ȭ�� ���� arrayList�� �ٲپ� �����͸� �����´�.
		if(main.list == null) System.exit(-1);
		
		while(true) {
			int choice = main.showMenu();
			main.process(choice);
			System.out.println();
		}
		
	}
	
	private void process(int choice) {
		switch(choice) {
			case 0 :
				Save save = new Save(this.list, PATH); // �����ϸ鼭 �޸𸮿� �ִ� address�� ���
				save.backup();
				System.out.println("Bye!!! Program is over...");
				System.exit(0); break;
			case 1 :
				Output output = new Output(this.list);
				output.output(); break;
			case 2 :
				Input input = new Input(this.list, this.scan);
				input.input(); break;
			case 3 :
				this.search("�˻���", 0);
				break;
			case 4 :
				this.search("������", 1);
				break;
			case 5 :
				this.search("������", 2);
		}
	}
	
	private void search(String msg, int flag) { // ����, ���������� ����ϹǷ� search�� ��ġ�� main���� �Ѵ�.
		Search search = new Search(this.list, this.scan);
		Person p = search.linearSearch(msg);
		if(p!=null) {
			if(flag == 0) System.out.println(p);
			if(flag == 1) {
				this.list.remove(p);
				System.out.println("ȸ�� ���� ����");
			}
			if(flag == 2) {
				Update update = new Update(p, this.scan);
				update.modify();
			}
		}
		
		else System.out.println("ȸ���� ã�� �� �����ϴ�. Ȯ�� �� �ٽ� �˻����ּ���.");
	}
	
	
	private int showMenu() {
		System.out.println("[ ȸ�� �ּҷ� ]");
		System.out.println("1. ��ü ȸ�� ����");
		System.out.println("2. ȸ�� ���� ���");
		System.out.println("3. ȸ�� ���� �˻�");
		System.out.println("4. ȸ�� ����");
		System.out.println("5. ȸ�� ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("�޴� ��ȣ ���� >> ");
		return this.scan.nextInt();
	}
}
