import java.util.Arrays;
import java.util.Scanner;

/*
�ۼ��� : ����ȯ
�ۼ����� : ������ ��ȯ Ÿ��
�ۼ����� : 31/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class CallByRefDemo2 {

public static void main(String[] args) {
		int[] array = new int[1000];
		int su = input(array);
		output(array, su);
		
	}

	static int input(int[] array){
		Scanner scan = new Scanner(System.in);
		int su = 0;
		int i=0;
		System.out.println("���� �Է�(0�� ����)");
		while((su = scan.nextInt())!=0 && i<1000) {
			array[i++] = su;
		}
		return i;
	} // �迭�� �ּҸ� �ѱ�ڴ�. ������ ��ȯ Ÿ��
	
	static void output(int[] array, int su){
		for(int i=0; i<su; i++) {
			System.out.print(array[i]+"\t");
		}
	}

}
