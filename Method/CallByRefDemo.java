/*
�ۼ��� : ����ȯ
�ۼ����� : 
�ۼ����� : 31/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class CallByRefDemo {

	public static void main(String[] args) {
		String str = "Hello"; // �������̰� �ּҸ� �ѱ����� �ٲ����ʴ´�. �⺻���� string�� ���� �������ʴ´�. string�� ����̱⶧����. 
		StringBuffer sb = new StringBuffer("Hello"); // �ּҸ� �Ѱܼ� ���� �ٲ��.
		System.out.println("���� ��");
		System.out.println("str = "+ str + ", sb = "+ sb.toString());
		change(str, sb); // call by reference
		System.out.println("���� ��");
		System.out.println("str = "+ str + ", sb = "+ sb.toString());
	}
	
	static void change(String str, StringBuffer sb) {
		str +=", World";
		sb.append(", World");
		System.out.println("�Լ�����");
		System.out.println("str = "+ str + ", sb = "+ sb.toString());
	}
}