/*
�ۼ��� : ����ȯ
�ۼ����� : ==, !=, ���ڿ� ��
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo4 {
	public static void main(String[] args) {
/*
		// int a=5, b=7;
		boolean a=true, b=false;
		System.out.printf("a==b==>%b\n",(a==b));
		System.out.printf("a!=b==>%b\n",(a!=b));
*/		
		//String name = "������";
		//System.out.printf("������ == name ==> %b\n",("������"==name));
		// true
		//String name = new String("������");
		//System.out.printf("������ == name ==> %b\n",("������"==name));
		// false
		String name = new String("������");
		// System.out.printf("������ == name ==> %b\n",("������".equals(name)));
		// new�� ���� �Ⱦ��� true. 
		// ���ڿ� ���񱳴� == �����ڰ� �ƴ϶� .equals() �޼ҵ带 ����Ѵ�.
		// equals�� static�� �ƴ϶� "������"�ּҷ� ����
		
		System.out.printf("������ == name ==> %d\n",("������".compareTo(name)));
		// compareTo() = ���ڿ� ������ ������ 0 ����
	}
}