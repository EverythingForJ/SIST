/*
�ۼ��� : ����ȯ
�ۼ����� : 100������ �ڿ��� �߿��� 4�� ����̸鼭 5�� ����� �ƴ� �� ����ϱ�
�ۼ����� : 24/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class FourNotFive {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++){
			if(i%4==0 && i%5!=0) {
				System.out.printf("%-3d",i);
			}
		}
	}
}