/*
�ۼ��� : ����ȯ
�ۼ����� : Reference type �����翡 ���� �˾ƺ���
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ReferenceCopyTest{
      public static void main(String [] args){
             Student chulsu = new Student();
			 chulsu.age = 24;
			 
		 	 Student younghee = new Student();
	  		 younghee.age = chulsu.age; 
			 // �ּ� ���簡 �ƴ� ��������. int age�� int age�� �����߱⶧����

             System.out.println("ö���� ���̴� " + chulsu.age);
			 System.out.println("������ ���̴� " + younghee.age);
             System.out.println("��ȯ ��");
             chulsu.age = 34;

             System.out.println("ö���� ���̴� " + chulsu.age);
			 System.out.println("������ ���̴� " + younghee.age);
			// ������ �����ʴ´�.
			
	}
}

class Student{
      int age;
}