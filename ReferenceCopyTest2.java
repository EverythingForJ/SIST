/*
�ۼ��� : ����ȯ
�ۼ����� : Reference type ���翡 ���� �˾ƺ��� ( ������ String �˾ƺ��� )
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ReferenceCopyTest2{
      public static void main(String [] args){
             String original = "Hello";
			 String copy = original;
			 System.out.printf("original = %s, copy = %s\n", original,copy);
			 original = "World"; // �̰��� �������� �ƴ� ���ο� "World"�� �ּҷ� �ٲ�°�
			 System.out.printf("original = %s, copy = %s\n", original,copy);

			 /*
				String�� ������������ ����
				Strings are constant; ��Ʈ���� �����.
				their values cannot be changed after they are created.
			 */
	}
}