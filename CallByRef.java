/**
 * @author ����ȯ
 * @date 2020. 7. 30.
 * @objective CallByRef
 * @environment : Windows10 Pro, Open JDK 14.0.2, Eclipse 2020-06
 */

public class CallByRef {

	public static void main(String[] args) {
		int[] array = {5,9}; // �迭�̶� ���� �ƴ� �ּҰ� �Ѿ��.
		System.out.println("Before Change");
		System.out.println("a = "+array[0]+", b = "+array[1]);
		swap(array); // call by reference 
		System.out.println("After Change");
		System.out.println("a = "+array[0]+", b = "+array[1]); // ������ �� ���� �ٲ��.
	}

	static void swap(int[] a) { // int[] target = original;
		int temp =a[0]; a[0] = a[1]; a[1]=temp;
		System.out.println("In the swap");
		System.out.println("a[0] = "+a[0]+", a[1] ="+a[1]);
	}
}