/*
�ۼ��� : ����ȯ
�ۼ����� : �Ǽ�������
�ۼ����� : 20/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class �Ǽ������� {
	public static void main(String[] args) {
		float original = 25.5f;
		int result = Float.floatToIntBits(original);
		System.out.printf("result=%d\n", result);
		System.out.printf("result=%x\n", result);

		double target = 25.5;
		long result1 = Double.doubleToLongBits(target);
		System.out.printf("result=%d\n", result1);
		System.out.printf("result=%x\n", result1);
	}
}