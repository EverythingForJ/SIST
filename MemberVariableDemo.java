/*
�ۼ��� : ����ȯ
�ۼ����� : ��� ����
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

/*
	Member variable : instance variable
	- �ڵ����� ������ �ʱⰪ�� �־�����.(class ������ ����)
	- �ּҷ� �����Ѵ�.
*/

public class MemberVariableDemo {
	//static int age; // Ŭ���� ����
	int age; // ��� ����( static�� �Ⱥ����� ��� ���� ), ���� ���� �ٸ���.
	public static void main(String[] args) {
		// int age; // ���� �������� static�� ���� �� ����.
		MemberVariableDemo avd = new MemberVariableDemo();
		System.out.println(avd.age);
	}
}