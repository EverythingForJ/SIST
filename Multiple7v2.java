/*
�ۼ��� : ����ȯ
�ۼ����� : 1~100���� ���� �� 7�� ����� ����ϱ� + ����� �� �ٿ� 3���� ����ϱ�
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Multiple7v2 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 1; i<=100; i++ ){
			if (i%7==0){
				System.out.print(i+"   ");
				count++;
				if(count%3 == 0){
					System.out.println();
				}
			}
		}
	}
}