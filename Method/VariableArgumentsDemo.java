

public class VariableArgumentsDemo {

	public static void main(String[] args) {
//		int a=4, b = 9, c = 10;
//		print(a,b,c);
		
//		print(new int[] {1,2,3});
//		print(1,2,3,4,5);
		print(1,'A',true,89.5);  // ���� Ÿ���� �ٸ��� Object�� ����.
	}
	static void print(Object... array) {
		System.out.println("length = "+ array.length);
	}
}
