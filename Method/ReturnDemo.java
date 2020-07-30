import java.util.Scanner;

/**
 * @author ����ȯ
 * @date 2020. 7. 30.
 * @objective making bmi program by using method
 * @environment : Windows10 Pro, Open JDK 14.0.2, Eclipse 2020-06
 */

public class ReturnDemo {
	public static void main(String[] args) {
		// Ű�� �����Ը� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("Ű �Է�");
		double height = scan.nextDouble();
		System.out.print("������ �Է�");
		double weight = scan.nextDouble();
		
		// static�� �ƴ϶� �ּҸ� �����, ����� �� �ֵ��� �Ѵ�.
		ReturnDemo rd = new ReturnDemo();
		double bmi = rd.calcBmi(height*0.01, weight); // call by value
		rd.printLevel(bmi);
	}
	
	// bmi���� ����ϴ� �κ�, prototype
	double calcBmi(double height, double weight){
		//�̹� height�� ������ meter �������
		double bmi = weight / (height* 2);
		return bmi;
	}
	// bmi������ ���� 5�ܰ� ������ ����ϴ� �κ�
	void printLevel(double bmi){
		System.out.print("BMI = ");
		if(bmi>=40)System.out.println("����");
		else if(bmi>=35&&bmi<40)System.out.println("�ߵ ��");
		else if(bmi>=30&&bmi<35)System.out.println("�浵 ��");
		else if(bmi>=25&&bmi<30)System.out.println("��ü��");
		else if(bmi>=18.5&&bmi<25)System.out.println("����");
		else if(bmi<18.5)System.out.println("��ü��");
		return;
	}

}