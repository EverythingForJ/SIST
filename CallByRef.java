/**
 * @author 김준환
 * @date 2020. 7. 30.
 * @objective CallByRef
 * @environment : Windows10 Pro, Open JDK 14.0.2, Eclipse 2020-06
 */

public class CallByRef {

	public static void main(String[] args) {
		int[] array = {5,9}; // 배열이라 값이 아닌 주소가 넘어간다.
		System.out.println("Before Change");
		System.out.println("a = "+array[0]+", b = "+array[1]);
		swap(array); // call by reference 
		System.out.println("After Change");
		System.out.println("a = "+array[0]+", b = "+array[1]); // 기존의 값 또한 바뀐다.
	}

	static void swap(int[] a) { // int[] target = original;
		int temp =a[0]; a[0] = a[1]; a[1]=temp;
		System.out.println("In the swap");
		System.out.println("a[0] = "+a[0]+", a[1] ="+a[1]);
	}
}