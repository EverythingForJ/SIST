/*
�ۼ��� : ����ȯ
�ۼ����� : �ڿ��� �߿��� 100�� ����� ��� ã�� 1�ٿ� 3���� ����ϱ�
�ۼ����� : 24/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Hundred {
	public static void main(String[] args) {
		int count = 0;
			for(int j =2; j<=99; j++){
					if(100%j==0) {
						System.out.printf("%5d", j);
						count++;
						if(count%3==0){
							System.out.println();
						}
					}
			}
	}
}