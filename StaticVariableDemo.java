/*
�ۼ��� : ����ȯ
�ۼ����� : Ŭ���� ����
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

/*
	Ŭ���� ���� : static variable
	- Ŭ������ �̸����� �����Ѵ�.
	Integer.MAX_VALUE, Short.MAX_VALUE, Byte.MAX_VALUE.
	-�Ҽ� Ŭ������ �ּҸ� ������ �ʿ䰡 ����.
	-�ڵ����� DataType�� ���� �ʱⰪ�� �־�����.
		-- ������ : 0
		-- �Ǽ��� : 0.0
		-- ���� : false
		-- ������ : '\0', '\u0000'(NULL��)
		-- ������ : null(NULL����)
*/

public class StaticVariableDemo {
	static int age; // static�� ������ Ŭ���� ������� �Ѵ�. static:���� / �� ���� ���� / or static variable�̶�� �Ѵ�. 
	// ���������� �ݵ�� �ʱ�ȭ�����������, Ŭ���� ������ ���� ���ص� �����Ϸ��� �ڵ����� ���ش�.

	public static void main(String[] args) {
		//int age; // ���� ����
/*		System.out.println("���� = "+age); // Ŭ���� ���� ���� ��� 1.(���� Ŭ������ Ŭ������ ���� ����)
		System.out.println("���� = "+StaticVariableDemo.age); // ��� 2. (���� ��Ȯ�� ���)
		
		StaticVariableDemo svd = new StaticVariableDemo(); // 4����Ʈ�� �ּ� ���� ����
		System.out.println("���� = "+svd.age); // ��� 3.
*/
		Product.price = 25_000_000;
		System.out.println("������ "+Product.price);
	}
}

class Product{
	static int price; // Ŭ���� ����

}