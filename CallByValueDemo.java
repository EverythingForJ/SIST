/**
 * @author 김준환
 * @date 2020. 7. 30.
 * @objective CallByValue
 * @environment : Windows10 Pro, Open JDK 14.0.2, Eclipse 2020-06
 */

public class CallByValueDemo {
	public static void main(String[] args) {
		int a = 5, b = 9;
		System.out.println("Before Change");
		System.out.println("a = "+a+", b = "+b);
//		change(a);
		swap(a,b);
		System.out.println("After Change");
		System.out.println("a = "+a+", b = "+b); // 기존의 값은 변하지않는다. a가 아닌 su로 작업했기 때문에
	}
//	static void change(int su) { //int su = 5, Call By Value, 값 복사
//		su = su*1000;
//		System.out.println("In the Change");
//		System.out.println("su = "+su);
//	}
	

	static void swap(int c, int d) { //int su = 5, Call By Value, 값 복사
		int temp =c; c = d; d=temp;
		System.out.println("In the swap");
		System.out.println("c = "+c+", d ="+d);
//		return c, d; // 자바는 리턴이 2개이상 안된다.
	}

}
