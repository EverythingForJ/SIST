/*
�ۼ��� : ����ȯ
�ۼ����� : ������ ~,!
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo {
	public static void main(String[] args) {
		int su = -128;
		int result = ~su; // ������ ~: 1�� ����ȭ. ���ڿ��� ���
		boolean flag = true;
		boolean answer = !flag; // ������!: boolean���� ���
		
		System.out.printf("su= %d, su = %s\n", su, Integer.toBinaryString(su));
		System.out.printf("result= %d, result = %s\n", result, Integer.toBinaryString(result));
	}
}