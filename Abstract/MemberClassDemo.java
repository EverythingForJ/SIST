

public class MemberClassDemo {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		// out.a ��������� �ݵ�� Ŭ������ �ּҰ� �ʿ��ϴ�.
		Outer1.Inner1 in = out.new Inner1();
		in.print();
	}	
}

class Outer1 extends Outer{
	int a1 = 5; // �ٱ�Ŭ������ ��� ����
	static int b1 = 10; // �ٱ�Ŭ������ ����ƽ ����
	class Inner1 extends Inner{
		int c1 =100;
		// static int d = 10000;  // ����ƽ�� �ƴ� inner�� ����ƽ�� ������ ����.
		public void print() { // ����޼ҵ�
			System.out.println(b);
		}
	}
}