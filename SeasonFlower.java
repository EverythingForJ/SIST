/*
�ۼ��� : ����ȯ
�ۼ����� : ���ڿ���
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class SeasonFlower {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input, output;

		System.out.println("�����ϴ� ����(spring/summer/fall/winter) : ");
		input = scan.nextLine();
		
		output=input.equals("spring")?"������, ���޷�":
						input.equals("summer")?"���, ��ī�þ�":
								input.equals("fall")?"����, �ڽ���":"����, ��ȭ";

		System.out.println("-----------------���-----------------");
		System.out.printf("������ ���� : %s\n",input);
		System.out.printf("��  : %s", output);
	}
}