/*
�ۼ��� : ����ȯ
�ۼ����� : parseInt,toString
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ParseDemo {
	public static void main(String[] args) {
		//String str = "128";
		//int su = Integer.parseInt(str); // 128 // ������ 128�� ������ 128�� �ٲ��ش�.
		// �⺻������ 10������ �Ǵ�.
		//System.out.print(su);
		
		// ���ڸ� ��Ʈ������
		int su = 128;
		// String str = ""+su; // ���1.���� ��Ʈ���̸� �ڵ����� ��Ʈ������ �ٲ�
		//String str = String.valueOf(su); // ���2.
		String str = Integer.toString(su, 16); // ���3. // �ٸ��������� ��ȯ ����
		System.out.printf("%s",str);
	}
}