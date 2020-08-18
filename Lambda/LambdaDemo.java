

public class LambdaDemo {
	public static void main(String[] args) {
//		MyInterface mi = new MyInterface() {
//			@Override
//			public int calculate(int a, int b) {
//				return a+b;
//			}
//		};
		
		// ���ٽ�, ���� ����� ����.
		// new ����� �����, override�����, method����� �����, �����ϴ� ����� �����̸� �߰�ȣ ���� ����, return�� ��������
		MyInterface mi = (int a, int b) -> a+b; // �������̽� ���� �޼ҵ尡 2���̻��� ��� ��� �Ұ�.� �޼ҵ����� �Ǵ� ����.
		
		int result = mi.calculate(5, 9);
		System.out.println("resul = " + result);
	}
}

//�޼ҵ尡 �ϳ��� �־���Ѵٴ� ������̼�, �� ���ٽ��� �� �� �ִ�.
@FunctionalInterface 
interface MyInterface {
	int calculate(int a, int b);
//	int add(int a, int b);
}
