/*
�ۼ��� : ����ȯ
�ۼ����� : Primitive type �����翡 ���� �˾ƺ���
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ValueCopyTest{
      public static void main(String [] args){
/*
            int first, second;
            first = 7;
            second = first;
            System.out.println("first = " + first);
            System.out.println("second = " + second);

            System.out.println("�� ��ȯ ��");
            second = 10;
            System.out.println("first = " + first);
            System.out.println("second = " + second);        
			// ���� ���� �����߱⿡ �ٸ� ��� ������ �����ʴ´�.
			// ������ ī�Ǻ��� �����Ǿ� �ִ�.
*/
			double original = 173.6;
			double copy = original;
			System.out.printf("original = %.1f, copy = %.1f\n", original, copy);

			original = 190.4;
			System.out.printf("original = %.1f, copy = %.1f\n", original, copy);
		
			/*
			������
			1. ��� : primitive type
			2. ���� : ������ �ٲ�ٰ� ī�Ǻ��� �ٲ��� �ʴ´�. ��,
					 	 ������ ī�Ǻ��� ���� �ٸ���(���� ����Ǿ� ���� �ʴ�).
			*/
      }
}