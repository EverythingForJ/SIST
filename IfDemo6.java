/*
�ۼ��� : ����ȯ
�ۼ����� : ���� ũ��, ���� �� ã��
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class IfDemo6 {
	public static void main(String[] args) {
		double avg = 89.12345678;
		avg *= 10; // �Ҽ��� ù°���� ���� ���� ���ϰ� 
		double result = Math.round(avg);
		result /= 10; // ������. ��°�ڸ����� ������ 100�� ���ϰ� ����
		System.out.print(result);
	}
}