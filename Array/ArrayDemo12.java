/*
�ۼ��� : ����ȯ
�ۼ����� : string���� char[]�� �����
�ۼ����� : 28/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ArrayDemo12 {
	public static void main(String[] args) {
		String str="����� ������ ���ﵿ";
		char[] array = str.toCharArray(); // string���� char[]�� �����
		for(int i=0; i<array.length;i++){
			System.out.printf("%c",array[i]);
		}
		array[0]='��';
		array[1]='��';
		array[2]='��';
		System.out.println();
//		for(int i=0; i<array.length;i++){
//			System.out.printf("%c",array[i]);
//		}
		
		str = new String(array);
		System.out.println(str);
		// String�� ���� �������ʴ� �����.
	}
}