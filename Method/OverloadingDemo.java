/*
�ۼ��� : ����ȯ
�ۼ����� : �����ε�
�ۼ����� : 31/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/
// method overloading : method�� �̸��� ����, �Ķ������ Ÿ�� �Ǵ� ������ �ٸ��� �����Ϸ��� �ٸ� �޼ҵ�� �ν��Ѵ�.

public class OverloadingDemo {
	public static void main(String[] args) {
		print(4);
//		print(5, 89.5);
		print('a');
	}
	static void print(int su) {
		System.out.println("su = "+su);
	}
//	static void print(int su, double su1) {
//		System.out.println("su = "+su);
//	}
//	static void print(char munja) {
//		System.out.println("munja = "+munja);
//	}
	static void print(Object...array) {
		
	}
	static void print(int su, Object...array) {
		// �������ڴ� �׻� �������� �ٿ�����Ѵ�.
	}
//	static void print(Object...array, int su) {
//		// �����߻�
//	}
	
}
