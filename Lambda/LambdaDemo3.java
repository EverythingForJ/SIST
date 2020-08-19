/*
 * 1. interface형 변수에 lambda식 대입하자.
 * 2. 매개변수로 lambda식 사용하자.
 * 3. return타입으로 lambda식 사용하자.
 * 
*/

public class LambdaDemo3 {
	public static void main(String[] args) {
		// PrintString lambdasStr = s -> System.out.println(s);
		// lambdasStr.showString("Hello");
		// myMethod(lambdaStr);
		
		myMethod(s -> System.out.println(s)); // 2. 매개변수로 lambda식 사용하자.
		
		
		
		
		returnString().showString("Hello");

//		PrintString ps = returnString();
//		ps.showString("Hello");
		
	}
	
	static void myMethod(PrintString lambdasStr) {
		lambdasStr.showString("world");
	}
	
	// 3. return타입으로 lambda식 사용하자.
	static PrintString returnString() {
		return s -> System.out.println(s+", from lambda Expression");
	}
}

@FunctionalInterface
interface PrintString{
	void showString(String s);
}