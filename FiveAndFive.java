/*
�ۼ��� : ����ȯ
�ۼ����� : 5-4-3-2-1
�ۼ����� : 24/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class FiveAndFive {
	public static void main(String[] args) {
		for(int i=0; i<5; i++){
			for(int j = 1+i; j<=5; j++){
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}
}