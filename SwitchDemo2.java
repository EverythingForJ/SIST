/*
�ۼ��� : ����ȯ
�ۼ����� : switch
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.print("����⵵ : ");
		int year = scan.nextInt();

		int age = 2020-year+1;
		String animal;
		switch(year%12){
		case 0: animal = "������"; break;
		case 1: animal = "��"; break;
		case 2: animal = "��"; break;
		case 3: animal = "����"; break;
		case 4: animal = "��"; break;
		case 5: animal = "��"; break;
		case 6: animal = "ȣ����"; break;
		case 7: animal = "�䳢"; break;
		case 8: animal = "��"; break;
		case 9: animal = "��"; break;
		case 10: animal = "��"; break;
		default: animal = "��"; break;
		}

		System.out.println("---------------------------");
		System.out.printf("%s���� %d���̰�, %s���Դϴ�.", name, age, animal);
	}
}