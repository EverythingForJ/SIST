/*
 * 
*/
public class LambdaDemo4 {
	public static void main(String[] args) {
//		// 1. ���������� lambda ����ϱ�
//		Comparable com = (a,b) -> b - a;
//		
//		// 2. parameter�� lambda����ϱ�
//		myMethod((a,b) -> b - a);
//		
//		// 3. returnType�� lambda����ϱ�
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

@FunctionalInterface // �Ѱ��� �޼ҵ常 ���ٴ� ����
interface Comparable{
	int compareTo(int a, int b);
}