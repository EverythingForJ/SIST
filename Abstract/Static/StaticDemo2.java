public class StaticDemo2 {
	public static void main(String[] args) {
		// Outer.a   a가 스태틱변수이기때문에 Outer의 주소가 필요없다.
		Outer.Inner in = new Outer.Inner(); // Outer의 주소 필요없다.
		in.print();
	}
	
}

class Outer{
	static int a = 5; // 바깥 클래스의 스태틱변수
	int b = 10; // 바깥 클래스의 멤버 변수
	static class Inner{
		int c = 100;
		static int d = 1000;
		public void print() { // 내부클래스의 멤버메소드
			System.out.println(c);
		}
	}
}