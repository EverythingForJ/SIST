public class StaticDemo2 {
	public static void main(String[] args) {
		// Outer.a   a�� ����ƽ�����̱⶧���� Outer�� �ּҰ� �ʿ����.
		Outer.Inner in = new Outer.Inner(); // Outer�� �ּ� �ʿ����.
		in.print();
	}
	
}

class Outer{
	static int a = 5; // �ٱ� Ŭ������ ����ƽ����
	int b = 10; // �ٱ� Ŭ������ ��� ����
	static class Inner{
		int c = 100;
		static int d = 1000;
		public void print() { // ����Ŭ������ ����޼ҵ�
			System.out.println(c);
		}
	}
}