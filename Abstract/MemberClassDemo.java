

public class MemberClassDemo {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		// out.a 멤버변수는 반드시 클래스의 주소가 필요하다.
		Outer1.Inner1 in = out.new Inner1();
		in.print();
	}	
}

class Outer1 extends Outer{
	int a1 = 5; // 바깥클래스의 멤버 변수
	static int b1 = 10; // 바깥클래스의 스태틱 변수
	class Inner1 extends Inner{
		int c1 =100;
		// static int d = 10000;  // 스태틱이 아닌 inner는 스태틱을 가질수 없다.
		public void print() { // 멤버메소드
			System.out.println(b);
		}
	}
}