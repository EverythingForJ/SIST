/*
�ۼ��� : ����ȯ
�ۼ����� : ����Ʈ ������
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo3 {
	public static void main(String[] args) {
		int su =-128;
		int result = su>>5;
		int result1 = su>>>5;
		System.out.println("su ="+Integer.toBinaryString(su));
		System.out.println("result ="+Integer.toBinaryString(result));
		System.out.println("result1 ="+Integer.toBinaryString(result1)); // �������� ����� �ٲ�. �տ� 0 ����
		System.out.println("result ="+result);
		System.out.println("result1 ="+result1);
	}
}