/*
�ۼ��� : ����ȯ
�ۼ����� : 1~100���� ���� �� 5�� ����� ����ϱ�
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ForDemo1 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i<=100; i++ ){
			if (i%5==0){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.printf("\n������ : %d",count);
	}
}