/*
�ۼ��� : ����ȯ
�ۼ����� : while()
�ۼ����� : 24/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
/*		Scanner scan = new Scanner(System.in);
		int max = 0, input;
		System.out.println("���� ������ �Է����ּ���.(���� �Է½� ��� ���)");
		while((input = scan.nextInt())>=0){
			if(max<input) max = input;
		}
		System.out.printf("���� ū ���� %d�Դϴ�", max);
*/

/*		// ������
		int j=1;
		while (j<=9){
			int i=1;
			while(i<=9){
				System.out.printf("%d x %d = %-4d", j,i,j*i);
				i++;
			}
			System.out.println();
			j++;
		}
*/
		int i = 1,sum=0;
		while(sum<1_000_000){
			i++;
			sum = sum+i;
		}
		System.out.printf("%d�� ���ϰ� �鸸�� �ʰ��Ͽ� %d�� �ƽ��ϴ�. ", i, sum);
	}
}