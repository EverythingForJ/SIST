/*
�ۼ��� : ����ȯ
�ۼ����� : BMI ����ϱ�
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);

		System.out.println("---- ����� ü�� ���´�??----");
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.print("Ű : ");
		double height = scan.nextDouble();
		System.out.print("������ : ");
		double weight = scan.nextDouble();
		
		double bmi = weight/((height/100)*2);
		String result;
		
		if(bmi>=40){
			result="�� ��";
		}else if(bmi>=35){
			result="�ߵ ��";
		}else if(bmi>=30){
			result="�浵 ��";
		}else if(bmi>=25){
			result="��ü��";
		}else if(bmi>=18.5){
			result="����";
		}else{
			result="��ü��";
		}

		System.out.print("----------------- BMI ��� -------------------");
		System.out.printf("%s���� BMI������ %.2f�̰� %s�Դϴ�.\n", name, bmi, result);
	}
}