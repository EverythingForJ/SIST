/*
�ۼ��� : ����ȯ
�ۼ����� : ĳ����
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class CastingExample {
	public static void main(String[] args) {
		/*
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	
		// ������ �ٲ�� �ս��� �Ͼ
		*/

		// int age = 24L;
		byte age = 24;
		double avg = 89; // 89.0
		
		age= (byte)avg; //89

		System.out.println(age);

		byte a = 5;
		byte b = 9;
		byte sum = a+b; // ����: +�� int�� int�� ����Ͽ� byte�� �Ұ�
		int sum = a+b; // ����

	} 
}