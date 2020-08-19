/*
 * 1. interface형 변수에 lambda식 대입하자.
 * 2. 매개변수로 lambda식 사용하자.
 * 3. return타입으로 lambda식 사용하자.
 * 
*/

public class LambdaDemo2 {
	public static void main(String[] args) {
//		MyInterface mi = new MyInterface() {
//			@Override
//			public void myConcat(String s1, String s2) {
//				System.out.println(s1+", "+s2);
//			}
//		};
//		mi.myConcat("Hello", "World");
		
		MyInterface mi = (s1, s2) -> System.out.println(s1+", "+s2); // 1. interface형 변수에 lambda식 대입하자.
		mi.myConcat("Hello", "World");
		
	}
}

@FunctionalInterface
interface MyInterface{
	void myConcat(String s1, String s2);
}