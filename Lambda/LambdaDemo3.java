/*
 * 1. interface�� ������ lambda�� ��������.
 * 2. �Ű������� lambda�� �������.
 * 3. returnŸ������ lambda�� �������.
 * 
*/

public class LambdaDemo3 {
	public static void main(String[] args) {
		// PrintString lambdasStr = s -> System.out.println(s);
		// lambdasStr.showString("Hello");
		// myMethod(lambdaStr);
		
		myMethod(s -> System.out.println(s)); // 2. �Ű������� lambda�� �������.
		
		
		
		
		returnString().showString("Hello");

//		PrintString ps = returnString();
//		ps.showString("Hello");
		
	}
	
	static void myMethod(PrintString lambdasStr) {
		lambdasStr.showString("world");
	}
	
	// 3. returnŸ������ lambda�� �������.
	static PrintString returnString() {
		return s -> System.out.println(s+", from lambda Expression");
	}
}

@FunctionalInterface
interface PrintString{
	void showString(String s);
}