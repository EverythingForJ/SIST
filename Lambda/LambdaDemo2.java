/*
 * 1. interface�� ������ lambda�� ��������.
 * 2. �Ű������� lambda�� �������.
 * 3. returnŸ������ lambda�� �������.
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
		
		MyInterface mi = (s1, s2) -> System.out.println(s1+", "+s2); // 1. interface�� ������ lambda�� ��������.
		mi.myConcat("Hello", "World");
		
	}
}

@FunctionalInterface
interface MyInterface{
	void myConcat(String s1, String s2);
}