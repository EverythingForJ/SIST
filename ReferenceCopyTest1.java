/*
�ۼ��� : ����ȯ
�ۼ����� : Reference type ���翡 ���� �˾ƺ���
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ReferenceCopyTest1{
      public static void main(String [] args){
             Student chulsu = new Student();
			 chulsu.age = 24;
			 
		 	 //Student younghee = new Student();
	  		 Student younghee = new Student();
			 younghee = chulsu; 
			 // �ּҸ� ������ ��. ������ʹ� ������ �ٸ���.

             System.out.println("ö���� ���̴� " + chulsu.age);
			 System.out.println("������ ���̴� " + younghee.age);
             System.out.println("��ȯ ��");
            
			 chulsu.age = 34;
             System.out.println("ö���� ���̴� " + chulsu.age);
			 System.out.println("������ ���̴� " + younghee.age);
			// ö���� ���濡 ���� ������ �޴´�.
			
			younghee.age = 44;
             System.out.println("ö���� ���̴� " + chulsu.age);
			 System.out.println("������ ���̴� " + younghee.age);
			// ������ ���濡 ö���� ������ �޴´�.
			
			/*
			1. ��� : ������
			2. ����Ǿ��ִ�.
			*/
	}
}