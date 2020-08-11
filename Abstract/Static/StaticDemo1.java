

public class StaticDemo1 {
	private static int count; // = getCount();

	static {
		System.out.println("나는 스테틱 블록");
		count =100;
	}
	
//	private static int getCount() {
//		System.out.println("나는 스테틱 메소드");
//		return 100;
//	}
	
	
	public static void main(String[] args) {
		System.out.println("나는 메인 메소드");
		System.out.println("count = "+count);
	}
}
