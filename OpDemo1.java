/*
�ۼ��� : ����ȯ
�ۼ����� : ���������� ++,-- (����)
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo1 {
	public static void main(String[] args) {
		int su = 5;
		System.out.println("su ="+ su++);
		int age=24;
		System.out.println("age ="+ --age);
		int a = 5, b = 9;
		int result = ++a + b--;

		System.out.println("a = "+ a);
		System.out.println("b = "+b);
		System.out.println("result = "+result);
	}
}