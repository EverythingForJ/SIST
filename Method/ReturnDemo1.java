/**
 * @author ����ȯ
 * @date 2020. 7. 30.
 * @objective return
 * @environment : Windows10 Pro, Open JDK 14.0.2, Eclipse 2020-06
 */

public class ReturnDemo1 {

	public static void main(String[] args) {
		test(12);
	}
	
	static void test(int su) {
		System.out.println("Hello");
		if(su % 2 == 0)return; // Don't make line under return line.
		// ���ǹ� �����̶�� �Ʒ��� ���� �־ ��� �����ϴ�.
		System.out.println("World");
	}
}
