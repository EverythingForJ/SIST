import java.util.Arrays;
import java.util.Scanner;

/*
�ۼ��� : ����ȯ
�ۼ����� : ������ ��ȯ Ÿ��
�ۼ����� : 31/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class CallByRefDemo1 {

	public static void main(String[] args) {
		
		int[] array = input();
		output(array);
		// output(input);
	}

	static int[] input(){
		Scanner scan = new Scanner(System.in);
		int[] array = new int[7];
		for(int i=0; i<array.length; i++) {
			System.out.print("���� >> "); array[i] = scan.nextInt();
		}
		return array;
	} // �迭�� �ּҸ� �ѱ�ڴ�. ������ ��ȯ Ÿ��
	
	static void output(int[] array){
		System.out.println(Arrays.toString(array));
	}


}
