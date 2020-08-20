/*
 * 
*/
public class LambdaDemo4 {
	public static void main(String[] args) {
//		// 1. 참조변수에 lambda 사용하기
//		Comparable com = (a,b) -> b - a;
//		
//		// 2. parameter에 lambda사용하기
//		myMethod((a,b) -> b - a);
//		
//		// 3. returnType에 lambda사용하기
//		Comparable com = myMethod1();
//		System.out.println(com.compareTo(5, 9));
		
	}

	static void myMethod(Comparable comp ) {
		int a= 5, b =9;
		int result = comp.compareTo(3,5);
		System.out.println("result = " + result);
	}
	
	static Comparable myMethod1() {
		// 3.
		return (a, b)-> b - a;
	}
}

@FunctionalInterface // 한개의 메소드만 쓴다는 보장
interface Comparable{
	int compareTo(int a, int b);
}