/*
�ۼ��� : ����ȯ
�ۼ����� : ��������
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class SungjukMgmtV2 {
	public static void main(String[] args) {
		Student chulsu = new Student(); 
		// student�� heap�� �����, chulsu���� student �ּҰ��� �Ѱ���
		// student��� ���� kor, engm mat��� ����� �ڵ����� ���� �����.
		
		chulsu.mat = 100; // �ڱⰡ ���� Ŭ���� ����
		chulsu.kor = 90; // ��� ������ �ּ� ����
		chulsu.eng = 85; // ��� ������ �ּ� ����

		int total = chulsu.kor + chulsu.eng + Student.mat;
		System.out.println("ö�� ����: "+total);

		Student younghee = new Student();
		younghee.kor = 95; 
		younghee.eng = 100;
		
		total = younghee.kor + younghee.eng + younghee.mat;
		System.out.println("���� ����: "+total);
	}
}

class Student{
	int kor; // ��� ���� or Instance variable
	int eng;
	static int mat;
}