/*
�ۼ��� : ����ȯ
�ۼ����� : Scanner
�ۼ����� : 20/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
/*		System.out.print("������ ���̴� ? ");
		Scanner scan = new Scanner(System.in); // 1�ܰ�
		int age;
		age = scan.nextInt(); // �Է� ���ۿ��� �� ���� ������ �о���̴� �Լ�
		System.out.println("������ ���̴� "+age+"���̱���.");
		// System.out.printf("������ ���̴� %d���̱���.\n", age);

		double height; //1. �� ���� ����
		double weight;
		
		Scanner scan; //1. �ּ� ���� ����
		scan = new Scanner(System.in); // �ּ��Ҵ�
		
		System.out.print("Ű : ");
		height = scan.nextDouble(); // �� �Ҵ�
		System.out.print("������ : ");
		weight = scan.nextDouble(); // �� �Ҵ�
		System.out.printf("Ű = %.1fcm\t������ = %.1fkg\n ",height,weight);		
*/
		String name; // �ּ� ���� ����
		Scanner scan;// �ּ� ���� ����

		scan = new Scanner(System.in);
		System.out.print("���� : ");
		name = scan.next(); // �ּ� ���� �Ҵ�
		System.out.println("������ �̸���"+name+"�̱���.");
	}
}