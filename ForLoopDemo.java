/*
�ۼ��� : ����ȯ
�ۼ����� : ����� �°� ����ϱ�
�ۼ����� : 25/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ForLoopDemo {
	public static void main(String[] args) {
		int num = 0;
		
		for(int i=0; i<5; i++){ // 5���� ���� ����ϱ� ���� �ݺ���
			num++;
			for(int j = 1; j<=5; j++){ // 5���� ���� ����ϱ� ���� �ݺ���
				if (j==num){ // ��� ���� ��ġ�ϴ� ���� ���
					System.out.printf("%-3d", num);			
				}else{ // �ƴ϶�� 0 ���
					System.out.printf("%-3d", 0);
				}
			}
			System.out.println(); // ���� �ٲٱ����� ��¹�
		}
	}
}