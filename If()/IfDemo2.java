/*
�ۼ��� : ����ȯ
�ۼ����� : �Է¹��� ������ ���� �� ����ϱ� ( if�� )
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo2 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		String input, output;

		System.out.println("�����ϴ� ����(���� �Ǵ� �ѱ� �Է�) : ");
		input = scan.nextLine();
		
		if(input.equals("spring") || input.equals("��") ){
			output = "������, ���޷�";
		} else if(input.equals("summer")|| input.equals("����") ){
			output="���, ��ī�þ�";
		} else {
			output="����, �ڽ���";
		} 
		System.out.println("-----------------���-----------------");
		System.out.printf("������ ���� : %s\n",input);
		System.out.printf("��  : %s", output);
	}
}