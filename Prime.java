/*
�ۼ��� : ����ȯ
�ۼ����� : 1���� 200������ �Ҽ�(Prime Number) ����ϱ�
�ۼ����� : 26/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Prime {
	public static void main(String[] args) {
		int count=0; // �ٹٲ� ����
		
		for(int i = 2; i<=200; i++) { // �Ҽ��� 2���� ����, 200������ �Ҽ� ���ϱ�
			int count2=0; // �Ҽ����� �ƴ��� �Ǻ��ϱ� ���� ����
			for(int j = 2; j<=i; j++) {
				if (i%j==0) {
					count2+=1; // �� ���ڰ� 2���� �ڽ��� ���ڱ��� ����������, ���������� ���ڰ� �ִٸ� ����������
				}
			}
			if(count2<2) { // �ڽŰ� ���� ���� �ܿ� ������ �������� ���ڰ� ���ٸ� �Ҽ�. ���
				System.out.printf("%-5d",i);
				count++;
				if(count%10==0) {
					System.out.println();
				}
			}
		}
	}
}