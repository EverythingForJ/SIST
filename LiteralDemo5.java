/*
�ۼ��� : 
�ۼ����� : 
�ۼ����� : 
�ۼ�ȯ�� : OS(windows10), JAVA VERSION(JDK-14.0.2). , � �����͸� ������(eclips
*/

// System.out.println();
public class LiteralDemo5 {
	public static void main(String[] args) {
		// �������� Ÿ���� �ѹ��� ����Ҷ� printf���� ���� ����.
		System.out.printf("%d %f %s %c %b\n", 
									24, 3.14, "Hello", 'c', 4<6);
		// %7.2f���� 7������ �ڸ�, ������ ����. 0.2f�� �Ҽ��� ǥ���ڸ�. /// %�������ڴ� ����
		System.out.printf("%5d%7.2f%10s%5c%5b\n", 24, 3.14, "Hello", 'c', 4<6);
		System.out.printf("%-5d%5.2f%5s%5c%5b\n", 24, 3.14, "Hello", 'c', 4<6);

	}
}