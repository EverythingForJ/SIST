/**
 * @author ����ȯ
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
		System.out.println("a = "+a+", b = "+b); // ������ ���� �������ʴ´�. a�� �ƴ� su�� �۾��߱� ������
	}
//	static void change(int su) { //int su = 5, Call By Value, �� ����
//		su = su*1000;
//		System.out.println("In the Change");
//		System.out.println("su = "+su);
//	}
	

	static void swap(int c, int d) { //int su = 5, Call By Value, �� ����
		int temp =c; c = d; d=temp;
		System.out.println("In the swap");
		System.out.println("c = "+c+", d ="+d);
//		return c, d; // �ڹٴ� ������ 2���̻� �ȵȴ�.
	}

}
