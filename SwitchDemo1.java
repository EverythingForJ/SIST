/*
�ۼ��� : ����ȯ
�ۼ����� : ���� 2���� �Է¹޾Ƽ� 5Ģ ���� �����ϱ�
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class SwitchDemo1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		int first = scan.nextInt();
		System.out.print("�ι�° �� : ");
		int second = scan.nextInt();
		System.out.print("������(+,-,x,/,%) : ");
		String operator = scan.next();
		
		double result=0;
		int check=0;
		switch(operator){
			default : check=1; break;
			case "+": result = first + second; break;
			case "-": result = first - second;break;
			case "x": result = first * second;break;
			case "/": result = first / second;break;
			case "%": result = first % second;
		}
		System.out.println("------------------");

		if(check==1) System.out.println("�����ڸ� �߸� �����ϼ̽��ϴ�.");
		else System.out.printf("%d %s %d = %.2f", first, operator, second, result);
	}
}