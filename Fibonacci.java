/*
�ۼ��� : ����ȯ
�ۼ����� : 10��°������ �Ǻ���ġ ���� ����ϱ�
�ۼ����� : 25/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class Fibonacci {
	public static void main(String[] args) {
		int sum = 0, fir = 1, sec = 1; // �ʱⰪ 2���� ����� ������ ���� ���� 3�� �ʱ�ȭ
		
		System.out.printf("%-3d", fir); // �ʱⰪ ���
		System.out.printf("%-3d", sec); // �ʱⰪ ���

		for(int i=0; i<8; i++){ // ����� 8���� ����ϱ� ���� �ݺ���
			sum=fir+sec; // sum ��� �� ����
			System.out.printf("%-3d", sum); // ��� ���
			sec = fir; 
			fir = sum; //sum�� ��������, �� sum�� sum ���� ���ڿ� �ٽ� ���ϱ����� �� ����
		}	   //sum�� ���� ���ڿ� ������ ������ ��	
	}
}