/*
�ۼ��� : ����ȯ
�ۼ����� : �����ڵ� 41 ~ 122�������� �ڵ�� ���ڸ� �� �ٿ� 8���� ����ϱ�
�ۼ����� : 24/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class TestUnicode {
	public static void main(String[] args) {
		int count=0;

		for(int j=41;j<=122;j++){
			System.out.printf("%d : ", j);
			System.out.printf("%-5c   ", (char)j);
			count++;
			if(count%8==0){
				System.out.println();
			}
		}
	}
}